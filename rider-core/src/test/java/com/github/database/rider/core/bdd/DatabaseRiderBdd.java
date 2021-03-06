package com.github.database.rider.core.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by rmpestano on 4/17/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "src/test/resources/features/core/core-seed-database.feature",
        "src/test/resources/features/cdi/cdi-seed-database.feature",
        "src/test/resources/features/cucumber/cucumber-seed-database.feature",
        "src/test/resources/features/junit5/junit5-seed-database.feature",
        "src/test/resources/features/general/dataset-replacements.feature",
        "src/test/resources/features/general/expected-dataset.feature"
},
        plugin = "json:target/dbunit-rules.json")
public class DatabaseRiderBdd {
}
