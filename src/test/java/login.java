import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class login {
    WebDriver wd;

    @Test
    public void test1() {
        WebElement el1 = wd.findElement(By.tagName("div"));
        WebElement el2 = wd.findElement(By.id("user"));
        WebElement el3 = wd.findElement(By.className("hide-when-two-factor"));
        WebElement el4 = wd.findElement(By.linkText("Log in"));


        //css

        WebElement els1 = wd.findElement(By.cssSelector("#user"));
        WebElement els2 = wd.findElement(By.cssSelector(".hide-when-two-factor"));
        WebElement els3= wd.findElement(By.cssSelector(".form-field"));
        WebElement els4= wd.findElement(By.cssSelector("[data-testid='bignav']"));
        WebElement els5= wd.findElement(By.cssSelector("[href='/login']"));
        WebElement els6= wd.findElement(By.cssSelector("a[href='/login']"));

        // login_css






    }
}
