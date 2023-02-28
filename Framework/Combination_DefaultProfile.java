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

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/1fe4f116-bcb4-41c3-8a7f-c703c36aaea7
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 232, profileId = 100326)
public class Combination_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Combination","Combination - Default Profile"})
    @TestModellerPath(guid = "655609dd-5d3b-48a0-ac0f-d56e22c02957")
    public void Positivesuccessfuloperation200successfuloperation200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("9fe6785c-1740-4ab1-b0a6-771a1cee3b1d");
    _Get_loginUser.Get_loginUser_200("Isaac22","rNK3WyiOFq");

   pages.Get_getInventory _Get_getInventory = new pages.Get_getInventory(getDriver());
    TestModellerLogger.SetLastNodeGuid("e6f6a3bf-4cdd-49ab-a98d-136c80b63e00");
    _Get_getInventory.Get_getInventory_200();

    }

    @Test  (groups= {"Combination","Combination - Default Profile"})
    @TestModellerPath(guid = "52fbc909-6cbd-454e-83eb-7c0c21307793")
    public void Negativesuccessfuloperation200successfuloperation200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("d39a292d-0c40-4496-bca8-3786f11fc014");
    _Get_loginUser.Get_loginUser_200("Yessenia75","#!_ @");

   pages.Get_getInventory _Get_getInventory = new pages.Get_getInventory(getDriver());
    TestModellerLogger.SetLastNodeGuid("e6f6a3bf-4cdd-49ab-a98d-136c80b63e00");
    _Get_getInventory.Get_getInventory_200();

    }

    @Test  (groups= {"Combination","Combination - Default Profile"})
    @TestModellerPath(guid = "3007d33c-b693-4671-8d22-3c84e0129755")
    public void Negativesuccessfuloperation200successfuloperation2001()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("d39a292d-0c40-4496-bca8-3786f11fc014");
    _Get_loginUser.Get_loginUser_200("#!_ @","");

   pages.Get_getInventory _Get_getInventory = new pages.Get_getInventory(getDriver());
    TestModellerLogger.SetLastNodeGuid("e6f6a3bf-4cdd-49ab-a98d-136c80b63e00");
    _Get_getInventory.Get_getInventory_200();

    }

}