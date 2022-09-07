package StepDefinitions;
import com.br.Page.home;
import com.br.base.TestBase;
import org.openqa.selenium.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class search extends TestBase {

    home Home;
    @Given("Mike on home page after opening nopCart mobile app")
    public void mike_on_home_page_after_opening_nop_cart_mobile_app() throws MalformedURLException {

        initialization();
        Home = new home();
    }
    @When("^Mike click \"(.*)\"$ from our categories list from home page")
    public void mike_click_from_our_categories_list_from_home_page(String Catname) {
       Home.VerifyAccept();
       Home.setCatList(Catname);
    }
    @When("^ Mike click to \"(.*)\"$ product details page")
    public void mike_click_to_product_details_page(String string) {
        Home.detailsPage();
    }
    @Then("^ Mike select size \"(.*)\"$ from product details page")
    public void mike_select_size_from_product_details_page(String size) {

        Home.SelectSize(size);
    }
    @Then("^ Mike click plus button to increase Qty by \"(.*)\"$")
    public void mike_click_plus_button_to_increase_qty_by(int j) {
        j=2;
        Home.descrptionPage(j);
    }
    @Then("Mike click add to cart button to add the product in his cart")
    public void mike_click_add_to_cart_button_to_add_the_product_in_his_cart() {
        Home.AddCart();
    }
    @Given("Mike go to shopping cart by clicking top cart icon")
    public void mike_go_to_shopping_cart_by_clicking_top_cart_icon() {
        Home.Catnav();
    }
    @When("Mike click checkout button from shopping cart page")
    public void mike_click_checkout_button_from_shopping_cart_page() {
        Home.CartPage();
    }
    @When("Mike select checkout as guest from shopping cart page")
    public void mike_select_checkout_as_guest_from_shopping_cart_page() {
        Home.guest();
    }
    @Then("Mike input all the details in checkout billing details page and click continue")
    public void mike_input_all_the_details_in_checkout_billing_details_page_and_click_continue() {
        Home.BillingPage("Muhaiminul","Islam","m@mail.com","Ridmik","1206");
    }
    @Then("Mike select {string} as shipping method and click continue")
    public void mike_select_as_shipping_method_and_click_continue(String string) {
       Home.shipMethod();
    }
    @Then("Mike select {string} as payment method and click continue")
    public void mike_select_as_payment_method_and_click_continue(String string) {
      Home.PaymentMEthod();
    }
    @Then("Mike click next button on payment information page")
    public void mike_click_next_button_on_payment_information_page() {
        Home.infopage();
    }
    @Then("Mike click confirm button to place the order")
    public void mike_click_confirm_button_to_place_the_order() {
        Home.ConfirmOrder();
    }
    @Then("Verify order place successfully with popup message {string}")
    public void verify_order_place_successfully_with_popup_message(String string) {

    }

}