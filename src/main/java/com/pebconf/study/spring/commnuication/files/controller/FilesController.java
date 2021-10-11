package com.pebconf.study.spring.commnuication.files.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/files")
public class FilesController {

    @PostMapping("pushFile")
    public String pushFile(MultipartFile file,  HttpServletRequest request){

        return "hello";
    }

}
