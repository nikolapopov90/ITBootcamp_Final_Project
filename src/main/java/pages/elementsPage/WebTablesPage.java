package pages.elementsPage;

import pages.defaultPages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesPage extends BasePage {
    private By addNewUserButton = By.id("addNewRecordButton");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By eMail= By.id("userEmail");
    private By age = By.id("age");
    private By salary = By.id("salary");
    private By department = By.id("department");
    private By submitButton = By.id("submit");
    private By newUserAdded = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div");

    public WebTablesPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void setAddNewUserButton () {
        getDriver().findElement(addNewUserButton).click();
    }
    public void enterFirstName (String firstName) {
        getDriver().findElement(this.firstName).sendKeys(firstName);
    }
    public void enterLastName (String lastName) {
        getDriver().findElement(this.lastName).sendKeys(lastName);
    }
    public void enterEmail (String email) {
        getDriver().findElement(this.eMail).sendKeys(email);
    }
    public void enterAge (String age) {
        getDriver().findElement(this.age).sendKeys(age);
    }
    public void enterSalary (String salary) {
        getDriver().findElement(this.salary).sendKeys(salary);
    }
    public void enterDepartment (String department) {
        getDriver().findElement(this.department).sendKeys(department);
    }
    public void clickSubmitButton () {
        getDriver().findElement(submitButton).click();
    }
    public boolean newUserAddedToList () {
        return getDriver().findElement(newUserAdded).isDisplayed();
    }

}
