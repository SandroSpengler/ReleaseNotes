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

    @OneToOne(mappedBy = "releaseNote")
    private ReleaseSummary releaseSummary;

    @OneToMany(mappedBy = "releaseNote")
    private Set<UiChange> uiChange;

    public ReleaseNote() {
    }

    public ReleaseNote(long releaseId, String releaseNoteVersion, String title, ReleaseSummary releaseSummary, Set<UiChange> uiChange) {
        this.releaseId = releaseId;
        this.releaseNoteVersion = releaseNoteVersion;
        this.title = title;
        this.releaseSummary = releaseSummary;
        this.uiChange = uiChange;
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

    public ReleaseSummary getReleaseSummary() {
        return releaseSummary;
    }

    public void setReleaseSummary(ReleaseSummary releaseSummary) {
        this.releaseSummary = releaseSummary;
    }

    public Set<UiChange> getUiChange() {
        return uiChange;
    }

    public void setUiChange(Set<UiChange> uiChange) {
        this.uiChange = uiChange;
    }
}
