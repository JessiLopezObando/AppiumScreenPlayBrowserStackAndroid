package com.sofkau.task;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.AndroidDriver.driver;
import static com.sofkau.ui.CompraOverview.*;
import static com.sofkau.ui.LoginOverview.*;

public class RealizarCompra implements Task {

    private String nombre;
    private String apellido;
    private String postal;

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
