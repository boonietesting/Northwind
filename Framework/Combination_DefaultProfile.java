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
@TestModellerSuite(id = 231, profileId = 100326)
public class Combination_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Combination","Combination - Default Profile"})
    @TestModellerPath(guid = "c456c7f9-ce9d-4890-9636-bc18eea0a902")
    public void Positivesuccessfuloperation200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("9fe6785c-1740-4ab1-b0a6-771a1cee3b1d");
    _Get_loginUser.Get_loginUser_200("Elwyn_Nienow70","4NwNVyUHIU");

    }

    @Test  (groups= {"Combination","Combination - Default Profile"})
    @TestModellerPath(guid = "6ccae79d-133a-4ab8-9b43-8717f0a7191b")
    public void Negativesuccessfuloperation200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("d39a292d-0c40-4496-bca8-3786f11fc014");
    _Get_loginUser.Get_loginUser_200("Jaren_Rau","#!_ @");

    }

    @Test  (groups= {"Combination","Combination - Default Profile"})
    @TestModellerPath(guid = "63f7916a-19ed-481f-98c5-0e9823773f14")
    public void Negativesuccessfuloperation2001()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("d39a292d-0c40-4496-bca8-3786f11fc014");
    _Get_loginUser.Get_loginUser_200("#!_ @","");

    }

}