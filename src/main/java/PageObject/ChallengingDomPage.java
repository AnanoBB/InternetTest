package PageObject;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class ChallengingDomPage {



        public ElementsCollection elements = $$(By.xpath("//*[@id='content']/div/div/div/div[2]/table/tbody/tr[1]/td[position() < last()]"));
        public List el = elements.texts();

        public List getElements() {
                return this.el;
        }
}
