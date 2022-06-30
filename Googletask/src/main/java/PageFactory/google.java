package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class google {
    By search_field= By.xpath("//*[@class=\"gLFyf gsfi\"]");
    Duration duration = Duration.ofSeconds(20);
    By search_button=By.xpath("(//*[@name=\"btnK\"])[2]");
    By m_link=By.xpath("(//*[h3])[3]");
    JavascriptExecutor jsexecutor ;
    public void  enter_Search(WebDriver driver, String s)
    {
          WebDriverWait pwait=new WebDriverWait(driver,duration);
          pwait.until(ExpectedConditions.visibilityOfElementLocated(search_field)).sendKeys(s);


    }
    public void click_Search(WebDriver driver)
    {
        driver.findElement(search_button).click();
    }
    public void click_Link(WebDriver driver)
    {
        WebDriverWait pwait=new WebDriverWait(driver,duration);
        pwait.until(ExpectedConditions.visibilityOfElementLocated(m_link)).click();
    }
    public String find_elment_in_Shadow_cons(WebDriver driver)
    {
        jsexecutor=(JavascriptExecutor)driver;
        WebElement consumptiom=(WebElement)jsexecutor.executeScript("return document.querySelector('owc-feature-box-item:nth-child(1)').shadowRoot.querySelector('span.owc-feature-box-item__value.wb-type-heading-l')");
        System.out.println(consumptiom.getText());
       return  consumptiom.getText();
    }

    public String find_elment_in_Shadow_from(WebDriver driver)
    {
        jsexecutor=(JavascriptExecutor)driver;
        WebElement from0_100=(WebElement)jsexecutor.executeScript("return document.querySelector('owc-feature-box-item:nth-child(2)').shadowRoot.querySelector('span.owc-feature-box-item__value.wb-type-heading-l')");
        System.out.println(from0_100.getText());
        return from0_100.getText();
    }
    public String find_elment_in_Shadow_engine(WebDriver driver)
    {
        jsexecutor=(JavascriptExecutor)driver;
        WebElement engine_horsepower=(WebElement)jsexecutor.executeScript("return document.querySelector('owc-feature-box-item:nth-child(3)').shadowRoot.querySelector('span.owc-feature-box-item__value.wb-type-heading-l')");
        System.out.println(engine_horsepower.getText());
        return engine_horsepower.getText();
    }
    public String find_elment_in_Shadow_max(WebDriver driver)
    {
        jsexecutor=(JavascriptExecutor)driver;
        WebElement max_speed=(WebElement)jsexecutor.executeScript("return document.querySelector('owc-feature-box-item:nth-child(4)').shadowRoot.querySelector('span.owc-feature-box-item__value.wb-type-heading-l')");
        System.out.println(max_speed.getText());
        return max_speed.getText();
    }

}
