### Clevertec Task 02 Gradle
***
1. utils: Assemble custom jar utils-1.3.5.jar. It should be compatible with java 8. The manifest file should contain the name and version of your jar. The jar should contain class StringUtils with method boolean isPositiveNumber(String str). Use Apache Commons Lang 3.10 library to implement this method. Write one any unit test for your StringUtils.isPositiveNumber(String str) using JUnit 5.+.
2. multi-project: Create a project multi-project with two subprojects core and api. The core subproject should contain class Utils with method boolean isAllPositiveNumbers(String... str). Use utils-1.3.5.jar from the previous task to implement this method. The api subproject should contain class App with the main method. Call Utils.isAllPositiveNumbers("12", "79") from the main method of api subproject.

Дополнительно:<br>
Сделать gradle плагин, который также опубликовать и подключить к проекту.
Как пример функциональности плагина - тестирование и формирование отчета.

Инструкция по формированию и автозапуску отчёта в браузере:
1. multi-project directory: gradle build
2. cd core
3. gradle allureServe