package com.boot.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableCaching            // 开启Cache 缓存注解
@SpringBootApplication
@RestController
public class CacheApplication {

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String sayHello(){
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class,args) ;
    }
}
