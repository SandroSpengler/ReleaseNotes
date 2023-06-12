package com.notes.ReleaseNotes.Interface;

import com.notes.ReleaseNotes.DBModel.ReleaseNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReleaseNoteRepository extends JpaRepository<ReleaseNote, Long> {
}
