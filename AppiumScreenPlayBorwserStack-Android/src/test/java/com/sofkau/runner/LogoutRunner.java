package com.sofkau.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/logout.feature",
        glue = "com.sofkau.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LogoutRunner {
}
