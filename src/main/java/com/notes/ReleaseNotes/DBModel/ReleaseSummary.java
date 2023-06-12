package com.notes.ReleaseNotes.DBModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class ReleaseSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long summaryId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "release_id")
    @JsonIgnore
    private ReleaseNote releaseNote;

    private String headline;

    private String content;

    public ReleaseSummary() {
    }

    public ReleaseSummary(long summaryId, String headline, String content, ReleaseNote releaseNote) {
        this.summaryId = summaryId;
        this.headline = headline;
        this.content = content;
        this.releaseNote = releaseNote;
    }

    public long getSummaryId() {
        return summaryId;
    }

    public void setSummaryId(long summaryId) {
        this.summaryId = summaryId;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ReleaseNote getReleaseNote() {
        return releaseNote;
    }

    public void setReleaseNote(ReleaseNote releaseNote) {
        this.releaseNote = releaseNote;
    }
}
