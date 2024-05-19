import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeEach
    void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.pollingInterval = 1500;
        Configuration.timeout = 7000;
        open("https://www.zara.com/ww/ru/");
        $("[id='onetrust-accept-btn-handler']").click();
        $("[data-qa-action='stay-in-store']").click();



    }


}
