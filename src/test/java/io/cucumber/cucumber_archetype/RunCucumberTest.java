package io.cucumber.cucumber_archetype;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

/**
 * @author MD Kashif
 * @since 10/06/2023
 **/

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("io/cucumber/cucumber_archetype")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
public class RunCucumberTest {
}
