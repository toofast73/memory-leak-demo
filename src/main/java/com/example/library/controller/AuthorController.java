package com.example.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class AuthorController {

    @GetMapping("/book")
    public Integer getReadersByAuthorId(@PathVariable Integer authorId) throws IOException {
        Integer data = null;
        for (int i = 0; i < 100; i++) {

        File file = new File("C:\\Users\\16726152\\IdeaProjects\\library\\src\\test\\java\\com\\example\\library\\Escher-Big.jpg");
        InputStream inputStream = new FileInputStream(file);
        data = inputStream.read();
        while (data != -1){
            System.out.println(data);
            data = inputStream.read();
        }

        }
        return data;
    }

}
