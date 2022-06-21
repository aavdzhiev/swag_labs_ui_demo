package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Base {

    @FindBy(xpath = "//div[@class=\"inventory_list\"]/div/div[@class='inventory_item_description']/div/button")
    List<WebElement> addToCartButtons;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void selectFirstItem() {
        WebElement firstItem = addToCartButtons.get(0);
        firstItem.click();
    }

    public void selectLastItem() {
        WebElement firstItem = addToCartButtons.get(addToCartButtons.size()-1);
        firstItem.click();
    }

//    public Cart goToCart() {
//
//        return new Cart(driver);
//    }

}
