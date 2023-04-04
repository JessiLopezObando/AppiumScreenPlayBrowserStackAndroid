package android.demoapk.tasks;

import android.demoapk.driver.AndroidDriverr;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.net.MalformedURLException;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AbrirApp implements Task {
    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
