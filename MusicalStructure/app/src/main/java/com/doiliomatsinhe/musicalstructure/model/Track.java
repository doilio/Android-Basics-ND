package com.doiliomatsinhe.musicalstructure.model;

import java.io.Serializable;

public class Track implements Serializable {
    private int trackCover;
    private String trackName;
    private String trackArtist;

    public Track(int trackCover, String trackName, String trackArtist) {
        this.trackCover = trackCover;
        this.trackName = trackName;
        this.trackArtist = trackArtist;
    }

    public int getTrackCover() {
        return trackCover;
    }

    public void setTrackCover(int trackCover) {
        this.trackCover = trackCover;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }
}
