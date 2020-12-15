package org.selenide.examples;
import PageObject.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class HomePageTest {
    @BeforeTest
    public void goToWebsite(){
        open("http://the-internet.herokuapp.com/shifting_content/menu");
    }

    @Test
    public void checkIfChangesAfterHover(){
        HomePage getSize1 = new HomePage();
        getSize1.getCssProperty("font-size");
        HomePage getSize = new HomePage();
        getSize.hoverOnElement();
        getSize.getCssProperty("font-size");

        Assert.assertNotEquals(getSize1,getSize);
    }

    @Test
    public void checkIfChangesSizeAfterHover(){
        HomePage getColor = new HomePage();
        getColor.getCssProperty("color");
        HomePage getColorAfterHover = new HomePage();
        getColorAfterHover.hoverOnElement();
        getColorAfterHover.getCssProperty("color");

        Assert.assertNotEquals(getColor,getColorAfterHover);
    }

}
