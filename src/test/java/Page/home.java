package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class home {
    WebDriver driver;

    @FindBy(id = "btnAccept")
    WebElement BtnAccept;

    @FindBy(id = "rvHomeCategories")
    List<WebElement> CatList;

    @FindBy(id = "tvProductName")
    WebElement ProductName;

    @FindBy(id = "tvSelectedAttr")
    WebElement Size;

    @FindBy(xpath = "//android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]")
    WebElement SizeList;

    @FindBy(id = "btnPlus")
    WebElement QtyPLUS;

    @FindBy(id = "btnAddToCart")
    WebElement AddCartBtn;

    @FindBy(id = "menu_cart")
    WebElement CartBtn;

    @FindBy(id = "tvTitle")
    WebElement CheckoutBtn;

    @FindBy(id = "btnGuestCheckout")
    WebElement GuestBtn;

    @FindBy (id = "etFirstName")
    WebElement FirstName;

    @FindBy (id = "etLastName")
    WebElement LastName;

    @FindBy (id = "etEmail")
    WebElement email;

    @FindBy (id = "countrySpinner")
    WebElement SelectorCountry;

    @FindBy (id = "text1")
    WebElement CountryName;

    @FindBy (id = "stateSpinner")
    WebElement StateSelector;

    @FindBy (id = "etCompanyName")
    WebElement CompanyName;

    @FindBy (id = "etCity")
    WebElement CityName;

    @FindBy (id = "etStreetAddress")
    WebElement StreetAddress;

    @FindBy (id = "etZipCode")
    WebElement ZipCode;

    @FindBy (id = "btnContinue")
    WebElement ConBtn;

    @FindBy (id = "tvShippingMethodName")
    WebElement ShippingMethodName;

    @FindBy (id = "tvPaymentMethodName")
    WebElement PaymentType;

    @FindBy (xpath = "//android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
    WebElement NxtBtn;

    @FindBy (id = "checkoutButton")
    WebElement ConfirmBtn;

    public home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void VerifyAccept()
    {
        BtnAccept.click();
    }
   public void setCatList()
   {


   }

    public void seekbar_countdown() {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(SeekBarBtn, 150, 920).build().perform();
    }

}
