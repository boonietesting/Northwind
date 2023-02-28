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
@TestModellerSuite(id = 226, profileId = 100314)
public class Login_TestCases extends TestBase
{
    

    
    @Test  (groups= {"Login","Login - Test Cases"})
    @TestModellerPath(guid = "573d7fdd-d9c7-4938-ae8a-42cbcafb6d47")
    public void Positivesuccessfuloperation200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("72bd5192-b1b0-4fa8-aaf2-e3a983c9abf9");
    _Get_loginUser.Get_loginUser_200("Orville.Howe27","kWdFSlZ27e");

    }

    @Test  (groups= {"Login","Login - Test Cases"})
    @TestModellerPath(guid = "c1ba7c38-14c3-4a45-a670-837cd016f4b4")
    public void Negativesuccessfuloperation200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("f5a97c4d-03b4-4e45-8351-4c6d95cb94a2");
    _Get_loginUser.Get_loginUser_200("Imogene83","#!_ @");

    }

    @Test  (groups= {"Login","Login - Test Cases"})
    @TestModellerPath(guid = "44434378-3ca3-48f8-96d8-1304872ccd30")
    public void Negativesuccessfuloperation2001()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("f5a97c4d-03b4-4e45-8351-4c6d95cb94a2");
    _Get_loginUser.Get_loginUser_200("#!_ @","");

    }

}