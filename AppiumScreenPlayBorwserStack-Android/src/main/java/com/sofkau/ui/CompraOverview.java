package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class CompraOverview {
    public static final Target ORDENAR = Target
            .the("ordenar")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-Toggle\"]/android.widget.ImageView"));
    public static final Target ANADIR = Target
            .the("anadir")
            .located(xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]/android.widget.TextView"));
    public static final Target CARRITO = Target
            .the("carrito")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.view.ViewGroup"));
    public static final Target CHECKOUT = Target
            .the("checkout")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]"));
    public static final Target NOMBRE = Target
            .the("nombre")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-First Name\"]"));
    public static final Target APELLIDO = Target
            .the("apellido")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]"));
    public static final Target POSTAL = Target
            .the("postal")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]"));
    public static final Target CONTINUAR = Target
            .the("continuar")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]"));
    public static final Target FINISH = Target
            .the("finish")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-FINISH\"]"));

    public static final Target THANKS = Target
            .the("thanks")
            .located(xpath("//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETE!\"]/android.view.ViewGroup/android.widget.TextView[1]\n"));


}

