package live.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import live.model.Student;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import static com.sun.javafx.tools.resource.DeployResource.Type.data;

/**
 * @Author rcer
 * @Date 17/2/18 下午2:18
 */
@Controller
@RequestMapping(value = "/json")
public class JsonController {

    @ResponseBody
    @RequestMapping(value = "/requestHeaderTest")
    public String requestHeaderTest(@RequestHeader("User-Agent") String userAgent, @RequestHeader("Accept") String[] accepts) {
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("userAgent", userAgent);
        map.put("accepts", accepts);

        return JSON.toJSONString(map);
    }

    @ResponseBody
    @RequestMapping(value = "/cookieValueTest")
    public String cookieValueTest(@CookieValue(value = "JSESSIONID", defaultValue = "") String sessionId) {
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("sessionId", sessionId);

        return JSON.toJSONString(map);
    }

    @ResponseBody
    @RequestMapping(value = "/getStudentJson", method = RequestMethod.POST)
    public String getStudentJson(@RequestBody Student student) {
        System.out.println("============== student info ===============");
        System.out.println(student.toString());
        System.out.println("============== student info ===============");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "success");
        return JSONObject.toJSONString(map);
    }

}
