import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GithubSolutionsHoverTest {


    @Test
    void enterpriseHasTextTest() {
        open("https://github.com");
        $(byTagAndText("button", "Solutions")).hover();
        $(".HeaderMenu-dropdown a[href='/enterprise']").click();
        $("h1").shouldHave(text("Build like the best"));
    }
}
