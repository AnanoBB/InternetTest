package org.selenide.examples;


import PageObject.ShiftingPic;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ShiftingPicTest {

    @BeforeTest
    public void goToWebsite(){
        open("http://the-internet.herokuapp.com/shifting_content/image");
    }

    @Test
    public void checkIfStylesChange(){
        ShiftingPic locationBeforeClick = new ShiftingPic();
        locationBeforeClick.getCssProperty(".shift","left");
        locationBeforeClick.clickOnButton();

        ShiftingPic locationAfterClick = new ShiftingPic();
        locationAfterClick.getCssProperty(".shift","left");
        Assert.assertNotEquals(locationBeforeClick,locationAfterClick);





    }
}
