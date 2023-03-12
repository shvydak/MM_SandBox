import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login {
    WebDriver wd;

    @Test
    public void test1() {
        WebElement el1 = wd.findElement(By.tagName("div"));
        WebElement el2 = wd.findElement(By.id("user"));
        WebElement el3 = wd.findElement(By.className("form-field"));
        WebElement el4 = wd.findElement(By.linkText("Log in"));

        //css
        WebElement els1 = wd.findElement(By.cssSelector("#user"));
        WebElement elx1 = wd.findElement(By.xpath("//*[@id='user']"));

        WebElement els2 = wd.findElement(By.cssSelector(".form-field"));
        WebElement elx2 = wd.findElement(By.xpath("//*[form-field]"));

        WebElement els3 = wd.findElement(By.cssSelector("[data-testid='bignav']"));
        WebElement elx3 = wd.findElement(By.xpath("//*[@data-testid='bignav']"));


        WebElement els4 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement elx4 = wd.findElement(By.xpath("//*[@href='/login']"));

        WebElement els5 = wd.findElement(By.cssSelector("a[href='/login']"));
        WebElement elx5 = wd.findElement(By.xpath("//*[@href='/login']"));

        //login_css

        WebElement l1 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement lx1 = wd.findElement(By.xpath("//*[@href='/login']"));

        WebElement l2 = wd.findElement(By.cssSelector("#user"));
        WebElement lx2 = wd.findElement(By.xpath("//*[@id='user']"));

        WebElement l3 = wd.findElement(By.cssSelector("#login"));
        WebElement lx3 = wd.findElement(By.xpath("//*[@id='login']"));

        WebElement l4 = wd.findElement(By.cssSelector("#password"));
        WebElement lx4 = wd.findElement(By.xpath("//*[@id='password']"));

        WebElement l5 = wd.findElement(By.cssSelector("#login-submit"));
        WebElement lx5 = wd.findElement(By.xpath("//*[@id='login-submit']"));

        //Assert
        WebElement al1 = wd.findElement(By.cssSelector("[data-testid='header-member-menu-button']"));
        WebElement alx1 = wd.findElement(By.xpath("//*[@data-testid='header-member-menu-button']"));

        WebElement al2 = wd.findElement(By.cssSelector(".js-open-header-member-menu"));
        WebElement alx2 = wd.findElement(By.xpath("//*[@class='js-open-header-member-menu']"));

        WebElement al3 = wd.findElement(By.cssSelector(".qsCZSrobO7JoSv"));
        WebElement alx3 = wd.findElement(By.xpath("//*[@class='qsCZSrobO7JoSv']"));

        //logOut+logo
        WebElement l6 = wd.findElement(By.cssSelector("[data-testid='header-member-menu-button']"));
        WebElement lx6 = wd.findElement(By.xpath("//*[@data-testid='header-member-menu-button']"));

        WebElement l7 = wd.findElement(By.cssSelector("[data-testid='account-menu-logout']"));
        WebElement lx7 = wd.findElement(By.xpath("//*[@data-testid='account-menu-logout']"));

        WebElement l8 = wd.findElement(By.cssSelector("//*[@id='logout-submit']"));
        WebElement lx8 = wd.findElement(By.xpath("//*[@id='logout-submit']"));


        //ends-contains-starts css
        WebElement s1 = wd.findElement(By.cssSelector("[aria-label='Atlassian Trello']"));
        WebElement sx1 = wd.findElement(By.xpath("//*[@aria-label='Atlassian Trello']"));

        WebElement s2 = wd.findElement(By.cssSelector("[aria-label $='llo']"));//ends
        WebElement sx2 = wd.findElement(By.xpath("//*[contains(@aria-label, 'llo')]"));//ends

        WebElement s3 = wd.findElement(By.cssSelector("[aria-label ^='Atlas']"));//starts
        WebElement sx3 = wd.findElement(By.xpath("//*[starts-with(@aria-label,'Atlas')]"));//starts

        WebElement s4 = wd.findElement(By.cssSelector("[aria-label *='rello']"));//contains
    }
}