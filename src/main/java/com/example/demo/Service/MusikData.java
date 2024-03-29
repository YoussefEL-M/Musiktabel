package com.example.demo.Service;

import java.util.List;

public class MusikData {
    private String artist;
    private String origin;
    private String genre;
    private String albumName;
    private List<String> songs;

    public MusikData(String artist, String origin, String genre, String albumName, List<String> songs) {
        this.artist = artist;
        this.origin = origin;
        this.genre = genre;
        this.albumName = albumName;
        this.songs = songs;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}

