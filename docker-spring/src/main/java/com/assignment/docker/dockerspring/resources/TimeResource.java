package com.assignment.docker.dockerspring.resources;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("get/time")
public class TimeResource {

    @GetMapping
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)

        public void values(){
        for (DateTimeFormat.ISO c : DateTimeFormat.ISO.values())
            System.out.println(c);
    }
}
