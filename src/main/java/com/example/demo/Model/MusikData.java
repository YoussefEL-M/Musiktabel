package com.example.demo.Model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class MusikData {

    @Id
    private String artist;
    private String origin;
    private String genre;
    private String albumName;
    private int year;

    @ElementCollection
    private List<String> songs;

    public MusikData(String artist, String origin, String genre, String albumName, int year, List<String> songs) {
        this.artist = artist;
        this.origin = origin;
        this.genre = genre;
        this.albumName = albumName;
        this.year = year;
        this.songs = songs;
    }

    public MusikData() {
        this.songs = new ArrayList<>();
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
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

