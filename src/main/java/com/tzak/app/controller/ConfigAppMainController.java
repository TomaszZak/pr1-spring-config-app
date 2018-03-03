package com.tzak.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ConfigAppMainController {

    @RequestMapping(value = "/configappmain", method = RequestMethod.GET)
    public String configAppMain() {
        return this.getClass().getSimpleName() + "-> configappmain !!";
    }

}
