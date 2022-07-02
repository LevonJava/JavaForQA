package com.swaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    WebElement title;
    WebElement begSelect;
    WebElement shoppingCartLink;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        initElements();
    }

    private void initElements() {
        this.title = driver.findElement(By.className("title"));
        this.begSelect = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        this.shoppingCartLink = driver.findElement(By.id("shopping_cart_container"));
    }

    public String getTitleText(){
        return this.title.getText();
    }

    public ShopBasket clickBasket(){
        shoppingCartLink.click();
        return new ShopBasket(driver);
    }

}
