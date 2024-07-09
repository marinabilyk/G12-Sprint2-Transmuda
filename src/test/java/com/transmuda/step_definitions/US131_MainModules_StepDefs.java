package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.MainModulesPage_MB;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US131_MainModules_StepDefs extends BasePage{
    MainModulesPage_MB mainModulesPageMb = new MainModulesPage_MB();


    @Then("user sees {string} module MB")
    public void user_sees_module_mb(String module) {
        switch(module){
            case "dashboard":
                waitUntilLoaderScreenDisappear();
                Assert.assertTrue("Dashboard module is not displayed", mainModulesPageMb.dashboardsModule.isDisplayed());
            case "fleet":
                waitUntilLoaderScreenDisappear();
                Assert.assertTrue("Fleet module is not displayed", mainModulesPageMb.fleetModule.isDisplayed());
            case "customers":
                waitUntilLoaderScreenDisappear();
                Assert.assertTrue("Customers module is not displayed", mainModulesPageMb.customersModule.isDisplayed());
            case "sales":
                waitUntilLoaderScreenDisappear();
                Assert.assertTrue("Sales module is not displayed", mainModulesPageMb.salesModule.isDisplayed());
            case "activities":
                waitUntilLoaderScreenDisappear();
                Assert.assertTrue("Activities module is not displayed",mainModulesPageMb.activitiesModule.isDisplayed());
            case "marketing":
                waitUntilLoaderScreenDisappear();
                Assert.assertTrue("Marketing module is not displayed", mainModulesPageMb.marketingModule.isDisplayed());
            case "reports & segments":
                waitUntilLoaderScreenDisappear();
                Assert.assertTrue("Reports & segments module is not displayed", mainModulesPageMb.reportsSegmentsModule.isDisplayed());
            case "system":
                waitUntilLoaderScreenDisappear();
                Assert.assertTrue("System module is not displayed", mainModulesPageMb.systemModule.isDisplayed());
        }
    }



}
