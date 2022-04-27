package co.com.choucair.certification.mystore.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/ComprarRopa.feature",
//        tags = "@CompraExitosa1ProductoPorCheque",
        glue = "co/com/choucair/certification/mystore/definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)   //organiza con CamelCase al feature imprime

public class RunnerTags {
}