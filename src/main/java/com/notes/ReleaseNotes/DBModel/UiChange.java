package com.notes.ReleaseNotes.DBModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class UiChange {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uiId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "release_id")
    @JsonIgnore
    private ReleaseNote releaseNote;

    @OneToMany(mappedBy = "uiChange")
    private Set<AdjustedElements> adjustedElements;

    public UiChange() {
    }

    public UiChange(long uiId, String name, ReleaseNote releaseNote, Set<AdjustedElements> uiChange) {
        this.uiId = uiId;
        this.name = name;
        this.releaseNote = releaseNote;
        this.adjustedElements = uiChange;
    }

    public long getUiId() {
        return uiId;
    }

    public void setUiId(long uiId) {
        this.uiId = uiId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReleaseNote getReleaseNote() {
        return releaseNote;
    }

    public void setReleaseNote(ReleaseNote releaseNote) {
        this.releaseNote = releaseNote;
    }

    public Set<AdjustedElements> getAdjustedElements() {
        return adjustedElements;
    }

    public void setAdjustedElements(Set<AdjustedElements> adjustedElements) {
        this.adjustedElements = adjustedElements;
    }
}
