package org.selenide.examples;
import PageObject.ChallengingDomPage;
import PageObject.ChallengingDomPage.*;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class ChallengingDomTest  {
//    public ChallengingDomTest(){
//        this.el = ChallengingDomPage
//    }

    @BeforeTest
    public void goToWebsite(){
        open("http://the-internet.herokuapp.com/challenging_dom");
    }

    @Test
    public void rame(){
        ChallengingDomPage newF = new ChallengingDomPage();
        List newColl = newF.getElements();




        for(int i = 0; i < newColl.size();i++){

            String newEl = newColl.get(i).toString();
            char lastChar = newEl.charAt(newEl.length()-1);
            Assert.assertEquals(lastChar,'0');
        }
    }
}
