package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BercutPage {

    private final SelenideElement
            searchButton = $("button[name='s']"),
            searchInput = $("#search");

    private final ElementsCollection
            postElements = $$(".post");

    public BercutPage openPage() {
        open("");
        $(".main__title").shouldHave(text("bercut"));
        return this;
    }

    public BercutPage searchByText(String text) {
        executeJavaScript("arguments[0].click();", searchButton);
        executeJavaScript("arguments[0].click();", searchButton);
        searchInput.sendKeys(text);
        searchInput.pressEnter();
        return this;
    }

    public void checkSearchResult() {
        postElements.shouldHave(sizeGreaterThan(0));
    }
}
