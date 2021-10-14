package com.pebconf.study.spring.commnuication.files.controller;

import com.pebconf.study.spring.commnuication.files.model.ModelWrapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/files")
public class FilesController {

    @PostMapping(value = "/pushFile", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public String pushFile(HttpServletRequest request){
            //, ModelWrapper modelWrapper, @RequestPart("multiFile") MultipartFile[] multipartFiles, @RequestPart("singleFileA")MultipartFile singleFileA, @RequestPart("singleFileB")MultipartFile singleFileB){

        return "hello";
    }

}
