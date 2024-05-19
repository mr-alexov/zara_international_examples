import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ZaraCharlieTest extends BaseTest {

    @Test
    void searchTest01() {

        $("[data-qa-id='header-search-bar-link']").click();

        $("[data-qa-qualifier='search-term']").setValue("футболка мужская").pressEnter();

        $("[data-qa-action='product-click'] [data-qa-qualifier='product-detail-secondary-product-info-name']").shouldHave(Condition.text("ФУТБОЛКА"));


    }
}
