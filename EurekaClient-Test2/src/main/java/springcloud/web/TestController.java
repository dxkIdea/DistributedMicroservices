package springcloud.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 丁杏凯
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/3/289:53
 * IDEA 2017.2
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "Client-Test--------2" + "输出";
    }

}
