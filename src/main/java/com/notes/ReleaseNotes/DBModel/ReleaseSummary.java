package com.notes.ReleaseNotes.DBModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class ReleaseSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long summaryId;

    private String headline;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "release_id")
    @JsonIgnore
    private ReleaseNote releaseNote;

    public long getSummaryId() {
        return summaryId;
    }

    public void setSummaryId(long summaryId) {
        this.summaryId = summaryId;
    }

    public ReleaseNote getReleaseNote() {
        return releaseNote;
    }

    public void setReleaseNote(ReleaseNote releaseNote) {
        this.releaseNote = releaseNote;
    }
}
