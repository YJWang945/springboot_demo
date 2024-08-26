package wyj.example.spingboot_demo01.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    @RequestMapping("/hello")
    public String helloWorld() {
        return "hello Springboot 1!";
    }
}
