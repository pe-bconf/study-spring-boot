package com.pebconf.study.spring.commnuication.files.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class FileWrapper {
    String fileKey;
    MultipartFile files;
}
