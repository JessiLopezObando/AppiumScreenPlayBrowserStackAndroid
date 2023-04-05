package com.sofkau.task;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.sofkau.ui.CompraOverview.*;

public class RealizarCompra implements Task {

    private String nombre;
    private String apellido;
    private String postal;
    private io.appium.java_client.android.AndroidDriver<AndroidElement> driver;

    public  RealizarCompra conElDriver(io.appium.java_client.android.AndroidDriver<AndroidElement> driver){
        this.driver = driver;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().description(\"test-FINISH\"))"));
        actor.attemptsTo(
                Click.on(FINISH)
        );
    }

    public static RealizarCompra realizarCompra() {
        return new RealizarCompra();
    }
}
