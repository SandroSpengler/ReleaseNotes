package com.notes.ReleaseNotes.DBModel;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class ReleaseNote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long releaseId;

    private String releaseNoteVersion;

    private String title;

    public Set<ReleaseSummary> getReleaseSummary() {
        return releaseSummary;
    }

    public void setReleaseSummary(Set<ReleaseSummary> releaseSummary) {
        this.releaseSummary = releaseSummary;
    }

    @OneToMany(mappedBy = "releaseNote")
    private Set<ReleaseSummary> releaseSummary;

    public ReleaseNote() {
    }

    public ReleaseNote(long releaseId, String releaseNoteVersion, String title) {
        this.releaseId = releaseId;
        this.releaseNoteVersion = releaseNoteVersion;
        this.title = title;
    }

    public long getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(long releaseId) {
        this.releaseId = releaseId;
    }

    public String getReleaseNoteVersion() {
        return releaseNoteVersion;
    }

    public void setReleaseNoteVersion(String releaseNoteVersion) {
        this.releaseNoteVersion = releaseNoteVersion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
