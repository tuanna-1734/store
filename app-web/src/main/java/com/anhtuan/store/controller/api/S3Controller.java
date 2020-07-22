package com.anhtuan.store.controller.api;

import com.anhtuan.store.service.AmazonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/storage/")
public class S3Controller {
    @Autowired
    private AmazonClient amazonClient;

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestPart(value = "file") MultipartFile file) {
        return this.amazonClient.uploadFile(file);
    }

    @GetMapping("/getImage/{fileName}")
    public ResponseEntity<?> getImage(@PathVariable("fileName") String fileName) throws IOException {
        byte[] media = amazonClient.getImage(fileName);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);
        headers.setContentLength(media.length);

        return new ResponseEntity<>(media, headers, HttpStatus.OK);
    }
}
