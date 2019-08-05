package com.stepdefinition;

import org.junit.runner.RunWith;
import org.junit.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import junit.framework.*;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/AddTariffPlan",glue="com.stepdefinition.AddTariffPlan",plugin="html:target",dryRun=false,monochrome=true)

public class testrunner {

}
