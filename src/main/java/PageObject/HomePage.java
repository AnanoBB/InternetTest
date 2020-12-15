package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

   public HomePage getCssProperty(String property){
       $(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a")).getCssValue(property);
       return this;

   }

    public void hoverOnElement(){
        $(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a")).hover();
    }





}

