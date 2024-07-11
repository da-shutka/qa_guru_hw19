package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.BercutPage;

public class BercutTests extends TestBase {

    BercutPage bercutPage = new BercutPage();

    @Test
    @DisplayName("Проверка работоспособности глобального поиска")
    public void searchOnMainPageTest() {
        String searchText = "bss";
        bercutPage
                .openPage()
                .searchByText(searchText)
                .checkSearchResult();
    }
}
