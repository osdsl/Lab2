package com.example.demo;

// Рок музыкальный трек
public class RockMusicTrack implements MusicTrack {
    private String title;

    // Конструктор принимает название трека
    public RockMusicTrack(String title) {
        this.title = title;
    }

    // Возвращает детали рок трека
    @Override
    public String getDetails() {
        return "Рок трек: " + title;
    }
}
