package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// Главный класс приложения
public class DemoApplication {
	public static void main(String[] args) {
		// Сообщение о начале работы приложения
		System.out.println("Запуск музыкального плеера...");

		// Загрузка Spring контекста и воспроизведение музыки
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
			player.chooseTrack(); // Пользователь выбирает трек
			player.playMusic(); // Воспроизведение выбранного трека
		} catch (Exception e) {
			System.err.println("Произошла ошибка: " + e.getMessage());
		} finally {
			// Сообщение о завершении работы приложения
			System.out.println("Работа музыкального плеера завершена.");
		}
	}
}
