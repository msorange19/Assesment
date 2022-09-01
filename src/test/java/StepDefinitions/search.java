package StepDefinitions;
import org.openqa.selenium.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class search {
WebDriver driver;

    @Given("Mike on home page after opening nopCart mobile app")
    public void mike_on_home_page_after_opening_nop_cart_mobile_app() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\IdeaProjects\\Cucumber\\driver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.google.com");
    }
    @When("Mike click {string} from our categories list from home page")
    public void mike_click_from_our_categories_list_from_home_page(String string) {
        // Write code here that turns the phrase above into concrete actions
       System.out.println("test");
    }
    @When("Mike click to {string} product details page")
    public void mike_click_to_product_details_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
    }
    @Then("Mike select size {string} from product details page")
    public void mike_select_size_from_product_details_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
    }
    @Then("Mike click plus button to increase Qty by {string}")
    public void mike_click_plus_button_to_increase_qty_by(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
    }
    @Then("Mike click add to cart button to add the product in his cart")
    public void mike_click_add_to_cart_button_to_add_the_product_in_his_cart() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
    }
    @Given("Mike go to shopping cart by clicking top cart icon")
    public void mike_go_to_shopping_cart_by_clicking_top_cart_icon() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
    }
    @When("Mike click checkout button from shopping cart page")
    public void mike_click_checkout_button_from_shopping_cart_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
    }
    @When("Mike select checkout as guest from shopping cart page")
    public void mike_select_checkout_as_guest_from_shopping_cart_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
    }
    @Then("Mike input all the details in checkout billing details page and click continue")
    public void mike_input_all_the_details_in_checkout_billing_details_page_and_click_continue() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
    }
    @Then("Mike select {string} as shipping method and click continue")
    public void mike_select_as_shipping_method_and_click_continue(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
    }
    @Then("Mike select {string} as payment method and click continue")
    public void mike_select_as_payment_method_and_click_continue(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
    }
    @Then("Mike click next button on payment information page")
    public void mike_click_next_button_on_payment_information_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
    }
    @Then("Mike click confirm button to place the order")
    public void mike_click_confirm_button_to_place_the_order() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
    }
    @Then("Verify order place successfully with popup message {string}")
    public void verify_order_place_successfully_with_popup_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
    }

}