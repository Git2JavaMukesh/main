package com.ms.docker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {

    private static final Logger log = LoggerFactory.getLogger(DockerController.class);

    @GetMapping("/do")
    public String startApp() {
    log.info("ok, go ahead for docker");
    return "ok, go ahead for docker";
    }

}
