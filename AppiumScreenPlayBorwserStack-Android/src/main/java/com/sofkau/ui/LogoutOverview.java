package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class LogoutOverview {
    public static final Target MENU = Target
            .the("menu")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView"));
    public static final Target LOGOUT = Target
            .the("cierre sesion")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-LOGOUT\"]/android.widget.TextView"));
    public static final Target ASERCION_LOGIN = Target
            .the("asercion login")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]/android.widget.TextView"));


}