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

    @Test(description = "Hovers on 'Home' button and checks if font-size is changing")
    public void checkIfChangesAfterHover(){
        HomePage getSize1 = new HomePage();
        getSize1.getCssProperty("font-size");
        HomePage getSize = new HomePage();
        getSize.hoverOnElement();
        getSize.getCssProperty("font-size");

        Assert.assertNotEquals(getSize1,getSize);
    }

    @Test(description = "Hovers on 'Home' button and cheks if color is changing")
    public void checkIfChangesSizeAfterHover(){

        HomePage getColor = new HomePage();
        getColor.getCssProperty("color");
        HomePage getColorAfterHover = new HomePage();
        getColor.hoverOnElement();
        getColorAfterHover.getCssProperty("color");

        Assert.assertNotEquals(getColor,getColorAfterHover);
    }

}
