package org.selenide.examples;

import PageObject.ChallengingDomPage;
import PageObject.FileUploadPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class FileUploadTest {


    @BeforeTest
    public void goToWebsite(){
        open("http://the-internet.herokuapp.com/upload");
    }

    @Test
    public void uploadFile(){
        FileUploadPage catPic = new FileUploadPage();
        catPic.uploadFile("src/test/pics/catPic.jpg","#file-upload");
        catPic.clickUploadButton("#file-submit");




        FileUploadPage pic = new FileUploadPage();
        SelenideElement picture = pic.getUploaded("#uploaded-files");
        picture.should(Condition.appear);




    }
}
