package live.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

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

}
