package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class LoginOverview {
    public static final Target LOGIN = Target
            .the("LoginScreen")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]"));
    public static final Target USERNAME = Target
            .the("usuario")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Username\"]"));
    public static final Target PASSWORD = Target
            .the("password")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Password\"]\n"));
    public static final Target PRODUCTOS = Target
            .the("LoginScreen")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView"));

}