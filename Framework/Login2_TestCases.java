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
@TestModellerSuite(id = 223, profileId = 100311)
public class Login2_TestCases extends TestBase
{
    

    
    @Test  (groups= {"Login2","Login2 - Test Cases"})
    @TestModellerPath(guid = "e1913db9-9e88-452e-ae16-1244c767ed6b")
    public void Negativesuccessfuloperation200fail()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("dd26d07d-f17c-42ef-8811-e51ba291573c");
    _Get_loginUser.Get_loginUser_200("#!_ @","");

    }

    @Test  (groups= {"Login2","Login2 - Test Cases"})
    @TestModellerPath(guid = "f935c0eb-24ba-495b-8383-42138e41b1c0")
    public void Positivesuccessfuloperation200success()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("a52fd42a-a5b9-4edf-98ba-2e48f874ea42");
    _Get_loginUser.Get_loginUser_200("Nelson.Gleichner6","LcyKo7CU6J");

    }

    @Test  (groups= {"Login2","Login2 - Test Cases"})
    @TestModellerPath(guid = "fb8554f1-f716-4ff1-b587-047238e3778f")
    public void Negativesuccessfuloperation200fail1()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("dd26d07d-f17c-42ef-8811-e51ba291573c");
    _Get_loginUser.Get_loginUser_200("Kyra36","#!_ @");

    }

}