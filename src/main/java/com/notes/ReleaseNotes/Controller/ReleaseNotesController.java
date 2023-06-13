package com.notes.ReleaseNotes.Controller;

import com.notes.ReleaseNotes.DBModel.ReleaseNote;
import com.notes.ReleaseNotes.Exception.DBNotFoundException;
import com.notes.ReleaseNotes.Interface.IReleaseNoteService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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

    @GetMapping("/{id}")
    @ApiResponse(description = "Ok", responseCode = "200")
    @ApiResponse(description = "Not Found", responseCode = "404")
    public ResponseEntity<ReleaseNote> getAllReleaseNotes(@PathVariable long id) {

        try {
            ReleaseNote rn = _releaseNoteService.getReleaseNoteByVersion(id);

            return ResponseEntity.ok(rn);
        } catch (DBNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            //ToDO
            // Add logging
            return ResponseEntity.internalServerError().build();
        }
    }
}
