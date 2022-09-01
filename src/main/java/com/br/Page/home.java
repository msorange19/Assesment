package com.br.Page;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class home {
    static WebDriver driver;
    public static AndroidTouchAction actions = null;

    @FindBy(id = "btnAccept")
    WebElement BtnAccept;

    @FindBy(id = "rvHomeCategories")
    List<WebElement> CatList;
    @FindBy(id = "tvProductName")
    List<WebElement> ProductNames;
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

    @FindBy(id = "etFirstName")
    WebElement FirstName;

    @FindBy(id = "etLastName")
    WebElement LastName;

    @FindBy(id = "etEmail")
    WebElement email;

    @FindBy(id = "countrySpinner")
    WebElement SelectorCountry;

    @FindBy(id = "text1")
    List<WebElement> CountryName;

    @FindBy(id = "stateSpinner")
    WebElement StateSelector;

    @FindBy(id = "text1")
    List<WebElement> StateName;
    @FindBy(id = "etCompanyName")
    WebElement CompanyName;

    @FindBy(id = "etCity")
    WebElement CityName;

    @FindBy(id = "etStreetAddress")
    WebElement StreetAddress;

    @FindBy(id = "etZipCode")
    WebElement ZipCode;

    @FindBy(id = "btnContinue")
    WebElement ConBtn;

    @FindBy(id = "tvShippingMethodName")
    WebElement ShippingMethodName;

    @FindBy(id = "tvPaymentMethodName")
    List<WebElement> PaymentType;

    @FindBy(xpath = "//android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
    WebElement NxtBtn;

    @FindBy(id = "checkoutButton")
    WebElement ConfirmBtn;

    public home() {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void VerifyAccept() {
        BtnAccept.click();
    }

    public void setCatList() {
        actions = new AndroidTouchAction((PerformsTouchActions) driver);
        actions.tap(ElementOption.element((WebElement) CatList)).perform();
        scroll_right();
        String Expected = "Electronics";
        for (WebElement CatName : CatList) {
            if (CatName.getText().equalsIgnoreCase(Expected)) {
                CatName.click();
            } else {
                System.out.println("Not Found");
            }
        }

    }

    public void detailsPage() {
        String proname = "Nokia Lumia 1020";
        scroll_down();
        for (WebElement productname : ProductNames) {
            if (productname.getText().equalsIgnoreCase(proname)) {
                ProductName.click();
            } else {
                System.out.println("Error");
            }
        }

    }

    public void descrptionPage() {
        for (int i = 0; i <= 1; i++) {
            QtyPLUS.click();
        }
        Size.click();
        SizeList.click();


    }
  public void AddCart()
  {
      AddCartBtn.click();
  }

    public void Catnav()
    {
        CartBtn.click();
    }
  public void CartPage() {

        CheckoutBtn.click();

    }
public void guest()
{
    GuestBtn.click();
}
    public void BillingPage(String firstName, String lastName, String em, String company, String zipcode) {
        FirstName.sendKeys(firstName);
        LastName.sendKeys(lastName);
        email.sendKeys(em);
        CompanyName.sendKeys(company);
        SelectorCountry.click();
        for (WebElement country : CountryName) {
            scroll_down();
            if (country.getText().equalsIgnoreCase("Bangladesh")) {
                country.click();
            } else {
                System.out.println("Error");
            }
        }
        StateSelector.click();
        for (WebElement state : StateName) {
            scroll_down();
            if (state.getText().equalsIgnoreCase("Dhaka")) {
                state.click();
            } else {
                System.out.println("Error");
            }
        }
        ZipCode.sendKeys(zipcode);
        ConBtn.click();
    }

    public void shipMethod() {
        ShippingMethodName.click();
        ConBtn.click();
    }

    public void PaymentMEthod() {

        for (WebElement SelectPaymentType : PaymentType) {
            scroll_down();
            if (SelectPaymentType.getText().equalsIgnoreCase("Check/Money Order")) {
                SelectPaymentType.click();
            } else {
                System.out.println("Not Found");
            }
        }
    }

    public void infopage()
    {
        NxtBtn.click();
    }

    public void ConfirmOrder()
    {
        ConfirmBtn.click();
    }


    public static void scroll_right() {
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getWidth() * .1);
        int scrollEnd = (int) (dimension.getWidth() * .5);
        actions = new AndroidTouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
    }

    public static void scroll_down() {
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * .1);
        int scrollEnd = (int) (dimension.getHeight() * .5);
        actions = new AndroidTouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
    }

}
