package cn.xdcao.fistboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xd.cao
 * @version 1.0.0
 * @ClassName MyFristControl.java
 * @Description TODO
 * @createTime 2020年02月23日 22:57:00
 */
public class MyFirstControl {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
}
