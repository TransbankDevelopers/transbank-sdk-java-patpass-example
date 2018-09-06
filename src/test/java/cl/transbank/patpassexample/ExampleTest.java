package cl.transbank.patpassexample;

import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class ExampleTest {

    @Rule
    public ScreenShooter screenShooter = ScreenShooter.failedTests();

    @BeforeClass
    public static void setUp() {
        timeout = 10000;
        baseUrl = "http://localhost:8080";
        startMaximized = true;
    }

    @Before
    public void resetBrowser() {
        open("/");
    }

    @AfterClass
    public static void logout() {
        closeWebDriver();
    }

}