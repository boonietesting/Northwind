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

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/4b887025-ce88-418e-b5ae-4482426f2304
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 224, profileId = 100311)
public class Login2_TestCases extends TestBase
{
    

    
    @Test  (groups= {"Login2","Login2 - Test Cases"})
    @TestModellerPath(guid = "c815124a-6f35-49c3-a546-9ae760d9518f")
    public void Negativesuccessfuloperation200fail()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("dd26d07d-f17c-42ef-8811-e51ba291573c");
    _Get_loginUser.Get_loginUser_200("#!_ @","");

    }

    @Test  (groups= {"Login2","Login2 - Test Cases"})
    @TestModellerPath(guid = "30855a63-2053-417e-879c-78ca0cc55c8c")
    public void Positivesuccessfuloperation200success()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("a52fd42a-a5b9-4edf-98ba-2e48f874ea42");
    _Get_loginUser.Get_loginUser_200("Frederick.Weber38","hxI0Zk3HUP");

    }

    @Test  (groups= {"Login2","Login2 - Test Cases"})
    @TestModellerPath(guid = "7baf91c8-3d53-4e50-8db4-38d3f144aca9")
    public void Negativesuccessfuloperation200fail1()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("dd26d07d-f17c-42ef-8811-e51ba291573c");
    _Get_loginUser.Get_loginUser_200("Bridie23","#!_ @");

    }

}