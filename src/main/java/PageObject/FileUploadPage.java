package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class FileUploadPage {
    public FileUploadPage uploadFile(String pathname, String selector){
        File file = new File(pathname);
        $(selector).uploadFile(
                file
        );
        return this;

    }

    public void clickUploadButton(String selector){
        $(selector).click();

    }

    public SelenideElement getUploaded(String selector){

        return $(selector);
    }

}
