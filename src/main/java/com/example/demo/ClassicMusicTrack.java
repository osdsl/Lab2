package com.example.demo;

// Классический музыкальный трек
public class ClassicMusicTrack implements MusicTrack {
    private String title;

    // Конструктор принимает название трека
    public ClassicMusicTrack(String title) {
        this.title = title;
    }

    // Возвращает детали классического трека
    @Override
    public String getDetails() {
        return "Классический трек: " + title;
    }
}
