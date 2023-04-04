package com.sofkau.task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.LoginOverview.*;

public class IniciarSesion implements Task {
    private String username;
    private String password;
    public IniciarSesion credenciales(String username, String password){
        this.username = username;
        this.password = password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(USERNAME),
                Enter.theValue(password).into(PASSWORD),
                Click.on(LOGIN)
        );
    }
    public static IniciarSesion iniciarSesion () {
        return new IniciarSesion();
    }
}

