package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Cart extends Base {
    @FindBy(className = "inventory_item_name")
    List<WebElement> itemNames;

    @FindBy(className = "cart_button")
    List<WebElement> cartRemoveBtns;

    @FindBy(id = "continue-shopping")
    WebElement continueShoppingBtn;

    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    @FindBy(xpath = "//div[@class='cart_item']/div[@class='cart_quantity']")
    List<WebElement> itemQuantities;


    public Cart() {
        PageFactory.initElements(driver, this);
    }


}
