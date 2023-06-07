package com.notes.ReleaseNotes.Controller;

import jdk.jfr.ContentType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/releaseNotes")
public class ReleaseNotesController {

    @GetMapping("")
    public String getHelloWorld() {
        return "Hello World";
    }
    @GetMapping("/{parameter}")
    public String getHelloWorld(@PathVariable String parameter) {
        return "Hello World " +  parameter;
    }
}
