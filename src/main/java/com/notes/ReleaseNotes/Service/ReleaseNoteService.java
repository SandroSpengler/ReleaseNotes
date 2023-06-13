package com.notes.ReleaseNotes.Service;

import com.notes.ReleaseNotes.DBModel.ReleaseNote;
import com.notes.ReleaseNotes.Exception.DBNotFoundException;
import com.notes.ReleaseNotes.Interface.IReleaseNoteRepository;
import com.notes.ReleaseNotes.Interface.IReleaseNoteService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReleaseNoteService implements IReleaseNoteService {

    private IReleaseNoteRepository _releaseNoteRepository;

//    @Autowired
//    private IReleaseNoteRepository _releaseNoteRepository;

    public ReleaseNoteService(IReleaseNoteRepository releaseRepository) {
        _releaseNoteRepository = releaseRepository;
    }


    public List<ReleaseNote> getAllReleaseNotes() {
        return _releaseNoteRepository.findAll();
    }

    public ReleaseNote getReleaseNoteByVersion(long id) throws DBNotFoundException {

        return _releaseNoteRepository.findById(id).orElseThrow(() -> new
                DBNotFoundException("ReleaseNote not Found"));
    }
}
