import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class ZaraAlfaTest {

    @BeforeEach
    void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.pollingInterval = 500;
        open("https://www.zara.com/uk/");
        $("[id='onetrust-accept-btn-handler']").click();
        $("[data-qa-action='stay-in-store']").click();
    }

    @Test
    void testAccessibilityMenuButtonShouldBeVisible() {
        $("[id='INDmenu-btn']").should(visible);
    }

    @Test
    void testSearch01() {
        $("[data-qa-id='header-search-bar-link']").click();
        $("[data-qa-qualifier='search-term']").setValue("dress").pressEnter();
        $(".product-grid-product__info-wrapper [data-qa-action='product-click']").shouldBe(visible);
        $(".product-grid-product__info-wrapper [data-qa-action='product-click']").shouldHave(text("DRESS"));
    }

    @AfterEach
    void tearDown() {
        clearBrowserCookies();
        // sleep(3000);
    }
}
