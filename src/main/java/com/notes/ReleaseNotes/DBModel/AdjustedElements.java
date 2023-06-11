package com.notes.ReleaseNotes.DBModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class AdjustedElements {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long aeId;

    private String description;

    @ManyToOne
    @JoinColumn(name = "ui_id")
    @JsonIgnore
    private UiChange uiChange;

    public AdjustedElements() {
    }

    public AdjustedElements(long aeId, String description, UiChange uiChange) {
        this.aeId = aeId;
        this.description = description;
        this.uiChange = uiChange;
    }

    public long getAeId() {
        return aeId;
    }

    public void setAeId(long aeId) {
        this.aeId = aeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UiChange getUiChange() {
        return uiChange;
    }

    public void setUiChange(UiChange uiChange) {
        this.uiChange = uiChange;
    }
}
