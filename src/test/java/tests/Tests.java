package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class Tests extends BaseTests {

    MainPage mainPage = new MainPage();

    @Test
    @Tag("test")
    @Owner("Aleksandr Trifonov")
    @DisplayName("Проверка наличия верхнего меню")
    void testUpperMenuNotEmpty() {
        step("Открываем главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие первого элемента", () -> {
            mainPage.checkUpperMenu();
        });
    }
}
