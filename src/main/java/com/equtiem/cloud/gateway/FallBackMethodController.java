package com.equtiem.cloud.gateway;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FallBackMethodController {

    @GetMapping("/dataServiceFallBack")
    public String dataServiceFallBack(){
        System.out.println("dataServiceFallBack");
        return "Data Service is not working";
    }


    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack(){
        System.out.println("userServiceFallBack");
        return "User Service is not working";
    }

    @GetMapping("/fileServiceFallBack")
    public String fileServiceFallBack(){
        System.out.println("fileServiceFallBack");
        return "File Service Service is not working";
    }
}
