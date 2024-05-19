import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ZaraBetaTests extends BaseTest {

    @Test
    void checkLocatorOfLoginComponent() {

        open("https://www.zara.com/ww/ru/help-center");

        $("[data-qa-id='header-logon-link']").click();

        $("[name='logonId']").shouldBe(visible);

        sleep(7500);

    }

    @Test
    void zaraProfileLogin() {

        open("https://www.zara.com/ww/ru/help-center");

        $("[data-qa-id='header-logon-link']").click();

        $("[data-qa-input-qualifier='logonId']").setValue("boykovabkru@mailnesia.com");
        $("[data-qa-input-qualifier='password']").setValue("Boykovabkru03");
        $("[data-qa-action='logon-form-submit']").click();

        $("[data-qa-id='header-user-menu-link']").shouldBe(visible);
        $("[data-qa-id='header-user-menu-link']").shouldHave(text("Юлия"));


    }
}
