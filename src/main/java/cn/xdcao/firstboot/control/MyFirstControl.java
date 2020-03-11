package cn.xdcao.firstboot.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xd.cao
 * @version 1.0.0
 * @ClassName MyFristControl.java
 * @Description TODO
 * @createTime 2020年02月23日 22:57:00
 */
@RestController
public class MyFirstControl {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
