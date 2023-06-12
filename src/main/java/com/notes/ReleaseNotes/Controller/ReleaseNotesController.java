package com.notes.ReleaseNotes.Controller;

import com.notes.ReleaseNotes.DBModel.ReleaseNote;
import com.notes.ReleaseNotes.Interface.IReleaseNoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/releaseNotes")
public class ReleaseNotesController {
    public ReleaseNotesController(IReleaseNoteService _releaseNoteService) {
        this._releaseNoteService = _releaseNoteService;
    }

    private IReleaseNoteService _releaseNoteService;

    @GetMapping("")
    public ResponseEntity<List<ReleaseNote>> getAllReleaseNotes() {
        return ResponseEntity.ok(_releaseNoteService.getAllReleaseNotes());
    }

    @GetMapping("/{parameter}")
    public String getAllReleaseNotes(@PathVariable String parameter) {

        return "Hello World " + parameter;
    }
}
