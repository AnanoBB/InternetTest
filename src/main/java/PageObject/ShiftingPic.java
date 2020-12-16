package PageObject;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ShiftingPic {
    public ShiftingPic getCssProperty(String selector,String property){
        $(selector).getCssValue(property);
        return this;

    }

    public void clickOnButton(){
        $(By.xpath("//*[@id='content']/div/p[3]/a")).click();
    }


}
