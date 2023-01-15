package com.kochetkov;

import com.codeborne.selenide.Selenide;
import com.kochetkov.Pages.YandexMainPage;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ExampleTest {

    @ExtendWith({SimpleCallback.class})
    private final YandexMainPage ymp = new YandexMainPage();

    @ValueSource(strings = {
            "qa.guru",
            "selenide",
            "qameta",
            "allure"
    })
    @ParameterizedTest(name = "Check search results for input string: {0}")
    void yandexSearchTest(String searchQuery) {
        Selenide.open(YandexMainPage.URL);
        ymp.doSearch(searchQuery)
                .checkResults(searchQuery);
    }
}