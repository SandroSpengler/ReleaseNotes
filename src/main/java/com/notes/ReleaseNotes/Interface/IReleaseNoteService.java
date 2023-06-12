package com.notes.ReleaseNotes.Interface;

import com.notes.ReleaseNotes.DBModel.ReleaseNote;

import java.util.List;

public interface IReleaseNoteService {

    public List<ReleaseNote> getAllReleaseNotes();
}
