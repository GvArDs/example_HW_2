import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Codition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Codition.open;


public class SearchTests {
    @Test
    void successfulSearchTest(){
        open("https://google.com");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }

}