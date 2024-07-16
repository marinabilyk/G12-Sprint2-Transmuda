package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.MainModulesPage_MB;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

public class US01_MainModules_StepDefs_MB extends BasePage {
    MainModulesPage_MB mainModulesPageMb = new MainModulesPage_MB();


    @Then("user sees {string} module MB")
    public void user_sees_module_mb(String module) {
        moduleIsDisplayed(module);
    }

    @Then("user does not see {string} module MB")
    public void user_does_not_see_module_mb(String module) {
        switch (module) {
            case "dashboard":
                waitUntilLoaderScreenDisappear();
                try {
                    Assert.assertFalse(mainModulesPageMb.dashboardsModule.isDisplayed());
                } catch (NoSuchElementException e) {
                    System.out.println("Passed, no such element for the driver");
                }
                break;
            case "sales":
                waitUntilLoaderScreenDisappear();
                try {
                    Assert.assertFalse(mainModulesPageMb.salesModule.isDisplayed());
                } catch (NoSuchElementException e) {
                    System.out.println("Passed, no such element for the driver");
                }
                break;
            case "marketing":
                waitUntilLoaderScreenDisappear();
                try {
                    Assert.assertFalse(mainModulesPageMb.marketingModule.isDisplayed());
                } catch (NoSuchElementException e) {
                    System.out.println("Passed, no such element for the driver");
                }
                break;
            case "reports & segments":
                waitUntilLoaderScreenDisappear();
                try {
                    Assert.assertFalse(mainModulesPageMb.reportsSegmentsModule.isDisplayed());
                } catch (NoSuchElementException e) {
                    System.out.println("Passed, no such element for the driver");
                }
                break;


        }
    }

}
