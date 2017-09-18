package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
    	//name of the flow in the test method (mavenFlow) matches the name of your flow.
        runFlowAndExpect("mavenFlow", "Hello Mule");
    }
    
    @Override
    protected String getConfigFile() {
    	//name of the config file matches the name of your XML file
        return "maven-project-training.xml";
    }

}
