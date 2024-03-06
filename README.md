#    Практическая работа №2
Цель работы: Ознакомиться с механизмом внедрения зависимостей в Spring.

Вариант классов, в которые будут внедряться зависимости:
Музыкальный плеер.
## Инструкция по сборке

# Для сборки и развертывания приложения из командной строки Windows, используя Maven для управления зависимостями и сборкой проекта, выполните следующие шаги:

1. Установка Maven
Убедитесь, что у вас установлен Apache Maven. Если его нет, загрузите и установите Maven, а затем добавьте путь к исполняемому файлу Maven в переменную среды PATH.

2. Настройка переменных среды Java
Убедитесь, что переменные среды JAVA_HOME и PATH правильно настроены для вашей JDK.

3. Навигация к проекту
Откройте командную строку Windows и перейдите к корневой директории вашего проекта.

4. Сборка проекта с помощью Maven
Выполните следующую команду для сборки проекта:

shell
mvn clean package
Это создаст скомпилированный JAR файл в директории "target" проекта.

5. Запуск приложения
После успешной сборки вы можете запустить приложение, указав JAR файл, содержащий ваше приложение, например:

shell
java -jar target/ваш_файл.jar
Объединение с Spring
Убедитесь, что applicationContext.xml и application.properties находятся в каталоге проекта

Следуя этим шагам, вы сможете собрать и развернуть приложение с использованием Spring из командной строки Windows.

