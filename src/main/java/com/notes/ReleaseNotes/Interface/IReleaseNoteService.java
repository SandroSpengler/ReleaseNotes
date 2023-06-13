package com.notes.ReleaseNotes.Interface;

import com.notes.ReleaseNotes.DBModel.ReleaseNote;
import com.notes.ReleaseNotes.Exception.DBNotFoundException;

import java.util.List;

public interface IReleaseNoteService {

    public List<ReleaseNote> getAllReleaseNotes();

    public ReleaseNote getReleaseNoteByVersion(long id) throws DBNotFoundException;
}
