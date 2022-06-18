package tests;

import pages.alerts.AlertsPage;
import pages.bookStore.BooksPage;
import pages.bookStore.LoginPage;
import pages.elementsPage.*;
import pages.defaultPages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
        private WebDriverWait driverWait;
        private WebDriver driver;
        private ElementsPage elementsPage;
        private TextBoxPage textBoxPage;
        private CheckBoxPage checkBoxPage;
        private RadioButtonPage radioButtonPage;
        private HomePage homePage;
        private ButtonsPage buttonsPage;
        private WebTablesPage webTablesPage;
        private LinksPage linksPage;
        private AlertsPage alertsPage;
        private LoginPage loginPage;
        private BooksPage booksPage;


        


        @BeforeClass
        public void setup () {
            System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driverWait=new WebDriverWait(driver, Duration.ofSeconds(30));
            driver.manage().window().maximize();
            driver.navigate().to("https://demoqa.com/");
            elementsPage = new ElementsPage(driver,driverWait);
            textBoxPage = new TextBoxPage(driver,driverWait);
            checkBoxPage = new CheckBoxPage(driver,driverWait);
            radioButtonPage = new RadioButtonPage(driver,driverWait);
            homePage = new HomePage(driver,driverWait);
            buttonsPage = new ButtonsPage(driver,driverWait);
            webTablesPage = new WebTablesPage(driver,driverWait);
            linksPage = new LinksPage(driver,driverWait);
            alertsPage = new AlertsPage(driver,driverWait);
            loginPage = new LoginPage(driver,driverWait);
            booksPage = new BooksPage(driver,driverWait);




        }

            public WebDriverWait getDriverWait() {
            return driverWait;
        }

            public WebDriver getDriver() {
            return driver;
        }

            public ElementsPage getElementsPage() {
        return elementsPage;
        }

            public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }


            public  HomePage getHomePage() {
            return homePage;

    }

            public CheckBoxPage getCheckBoxPage() {
            return checkBoxPage;
    }

            public RadioButtonPage getRadioButtonPage() {
            return radioButtonPage;
    }


            public ButtonsPage getButtonsPage() {
            return buttonsPage;
    }

            public WebTablesPage getWebTablesPage() {
            return webTablesPage;
    }

            public LinksPage getLinksPage() {
            return linksPage;
    }

            public AlertsPage getAlertsBasePage() {
            return alertsPage;
    }

            public AlertsPage getAlertsPage() {
            return alertsPage;
    }

            public BooksPage getBooksPage() {
            return booksPage;
    }

            public LoginPage getLoginPage() {
            return loginPage;

    }



    @AfterClass
        public void afterClass() {
            getDriver().close();
        }
    }
