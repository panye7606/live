package live.controller;

import live.model.Uploader;
import live.service.UploaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @Author rcer
 * @Date 17/2/22 下午9:10
 */
@Controller
@RequestMapping(value = "/upload")
public class UploaderController {

    @Autowired
    private UploaderService uploaderService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "uploader/index";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(HttpServletRequest request,
                       @RequestParam("description") String description,
                       @RequestParam("file") MultipartFile file) {
        System.out.println("========= description: " + description + " ==========");

        try {
            if (!file.isEmpty()) {
                Uploader uploader = new Uploader();

                String path = request.getSession().getServletContext().getRealPath("upload");

                String filename = file.getOriginalFilename();
                File filepath = new File(path, filename);

                if (!filepath.getParentFile().exists()) {
                    filepath.getParentFile().mkdirs();
                }

                file.transferTo(new File(path + File.separator + filename));

                uploader.setDescription(description);
                uploader.setFileName(file.getOriginalFilename());
                uploader.setFilePath(filepath.getPath());

                uploaderService.add(uploader);

                return "uploader/index";

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return "error";
    }

}
