package wyj.example.spingboot_demo01.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloWorld {
    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "hello SpringBoot world update five";
    }
}
