package com.metabob.metabobk8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetBOBDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - Metabob-k8s i Have updated the message";
    }
}
