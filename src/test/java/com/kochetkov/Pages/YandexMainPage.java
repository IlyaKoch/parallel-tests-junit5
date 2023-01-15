package com.kochetkov.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class YandexMainPage {

    public static final String URL = "https://ya.ru/";

    private final SelenideElement searchInput = $x("//input[@id='text']");
    private final SelenideElement searchBtn = $("button[type='submit']");

    public YandexResultsPage doSearch(String searchQuery) {
        searchInput.setValue(searchQuery);
        searchBtn.click();
        return new YandexResultsPage();
    }
}