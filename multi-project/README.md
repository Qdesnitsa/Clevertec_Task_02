### Clevertec Task 02 Gradle
***
Create a project multi-project with two subprojects core and api.<br>
The core subproject should contain class Utils with method boolean isAllPositiveNumbers(String... str).<br>
Use utils-1.3.5.jar from the previous task to implement this method.<br>
The api subproject should contain class App with the main method.<br>
Call Utils.isAllPositiveNumbers("12", "79") from the main method of api subproject.

Дополнительно:<br>
Сделать gradle плагин, который также опубликовать и подключить к проекту.
Как пример функциональности плагина - тестирование и формирование отчета.

Инструкция по формированию и автозапуску отчёта в браузере:
1. multi-project directory: gradle build
2. cd core
3. gradle allureServe