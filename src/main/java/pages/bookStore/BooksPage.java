package pages.bookStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultPages.BasePage;

import java.util.List;

public class BooksPage extends BasePage {
    private static final String BOOKS_URL = "https://demoqa.com/books";
    private By searchBooks = By.id("searchBox");

    public BooksPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void enterSearchBooks(String books) {
        getDriver().findElement(this.searchBooks).sendKeys(books);

    }

    public void openBooksPage() {
        getDriver().navigate().to(BOOKS_URL);
    }

    public boolean checkSearchByAuthor(String author) {
        List<WebElement> rows = getDriver().findElements(By.xpath("//*[@class=\"rt-tr-group\"]/div"));

        for (WebElement element : rows) {
            List<WebElement> newRow = element.findElements(By.tagName("div"));

            if (newRow.get(3).getText().contains(author)) {
                return true;
            }
        }
        return false;
    }
}
