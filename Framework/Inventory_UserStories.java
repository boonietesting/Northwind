package tests;

import jakarta.mail.*;
import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;
import io.restassured.RestAssured;

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/46899ac1-d29d-4d45-9e72-07aa6b84daf5
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 229, profileId = 100317)
public class Inventory_UserStories extends TestBase
{
    

    
    @Test  (groups= {"Inventory","Inventory - User Stories"})
    @TestModellerPath(guid = "d7d859d6-3103-4513-b829-2dc28a801885")
    public void successfuloperation200()
    {
        
           pages.Get_getInventory _Get_getInventory = new pages.Get_getInventory(getDriver());
    TestModellerLogger.SetLastNodeGuid("5bf807f6-93b5-4d0c-976f-c0bb273f3196");
    _Get_getInventory.Get_getInventory_200();

    }

}