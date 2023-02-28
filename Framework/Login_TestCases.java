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

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/4554562a-f214-4ebd-9e9c-b30879482483
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 227, profileId = 100314)
public class Login_TestCases extends TestBase
{
    

    
    @Test  (groups= {"Login","Login - Test Cases"})
    @TestModellerPath(guid = "7a5e1988-65cb-401b-9c4d-f817ba1c39c7")
    public void Positivesuccessfuloperation200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("72bd5192-b1b0-4fa8-aaf2-e3a983c9abf9");
    _Get_loginUser.Get_loginUser_200("Ben","EokrquOlWB");

    }

    @Test  (groups= {"Login","Login - Test Cases"})
    @TestModellerPath(guid = "8e794a9a-d83d-4a6a-99a7-406b2f0264be")
    public void Negativesuccessfuloperation200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("f5a97c4d-03b4-4e45-8351-4c6d95cb94a2");
    _Get_loginUser.Get_loginUser_200("Ben","#!_ @");

    }

    @Test  (groups= {"Login","Login - Test Cases"})
    @TestModellerPath(guid = "0b3ff099-7287-49b9-9539-89b492b55257")
    public void Negativesuccessfuloperation2001()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("f5a97c4d-03b4-4e45-8351-4c6d95cb94a2");
    _Get_loginUser.Get_loginUser_200("#!_ @","");

    }

}