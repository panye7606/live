package live.controller;

import live.model.Uploader;
import live.service.UploaderService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/22 下午9:10
 */
@Controller
@RequestMapping(value = "/file")
public class UploaderController {

    @Autowired
    private UploaderService uploaderService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        List<Uploader> uploadersList = uploaderService.getUploaders();
        model.addAttribute("list", uploadersList);
        return "uploader/index";
    }

    @RequestMapping(value = "upload", method = RequestMethod.POST)
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

                return "redirect:/file/index";

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return "error";
    }

    @RequestMapping(value = "/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request,
                                           @RequestParam("filename") String filename) throws Exception {
        String path = request.getSession().getServletContext().getRealPath("upload");

        File file = new File(path + File.separator + filename);

        // tomcat编码已经设置为utf-8, 所以这里可以不用加上utf-8, 否则应与tomcat同步
        String downloadFileName = new String(filename.getBytes("UTF-8"), "iso-8859-1");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment", downloadFileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }

}
