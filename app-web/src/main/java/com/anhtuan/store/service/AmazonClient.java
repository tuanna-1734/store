package com.anhtuan.store.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public interface AmazonClient {
    public String uploadFile(MultipartFile multipartFile);

    byte[] getImage(String fileName) throws IOException;
}
