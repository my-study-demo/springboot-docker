package com.kely;/**
 * Created by YMO on 2018/9/14.
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Descrition TODO
 * @Author YMO
 * @Date 2018/9/14 18:22
 **/
@RestController
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).run(args);
    }

    @GetMapping("/sayHi")
    public String hello() {
        return "hello my docker,success！" + System.currentTimeMillis();
    }
}
