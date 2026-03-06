package com.dyashin.musicplayer.dto;

public class SongDTO {
    private int id;
    private int year;
    private String name;

    public SongDTO(int id, int year, String name) {
        this.id = id;
        this.year = year;
        this.name = name;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Year: " + year;
    }
}
