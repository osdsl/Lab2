package com.example.demo;

import java.util.Scanner;

// Класс музыкального плеера, который воспроизводит треки
public class MusicPlayer {
    private MusicTrack musicTrack;
    private String name;

    // Конструктор для внедрения музыкального трека через конструктор
    public MusicPlayer(MusicTrack musicTrack) {
        this.musicTrack = musicTrack;
    }

    // Метод для воспроизведения музыки
    public void playMusic() {
        System.out.println(name + " сейчас играет - " + musicTrack.getDetails());
    }

    // Метод для установки названия плеера
    public void setName(String name) {
        this.name = name;
    }

    // Метод для выбора трека пользователем
    public void chooseTrack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер трека для воспроизведения:");
        System.out.println("1 - Классическая музыка");
        System.out.println("2 - Рок музыка");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                musicTrack = new ClassicMusicTrack("Лунная соната");
                break;
            case "2":
                musicTrack = new RockMusicTrack("Кале-Гула");
                break;
            default:
                System.out.println("Неверный выбор, попробуйте еще раз.");
                chooseTrack(); // рекурсивный вызов для повторного выбора
                break;
        }
    }
}
