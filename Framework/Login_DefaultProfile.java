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

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/fd4e39d4-dacf-4492-9eb7-ad8e25cbcc58
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 236, profileId = 100332)
public class Login_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Login","Login - Default Profile"})
    @TestModellerPath(guid = "90e96130-e9ed-45c4-8351-a5a742bb604a")
    public void Negativesuccessfuloperation200Failure()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("49f58e82-633e-4db5-a115-4e9f38fbc281");
    _Get_loginUser.Get_loginUser_200("Ben","#!_ @");

    }

    @Test  (groups= {"Login","Login - Default Profile"})
    @TestModellerPath(guid = "8bd3597c-caaa-4f0d-96a6-fc4cf496fbb0")
    public void Positivesuccessfuloperation200Success()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("193e2cde-9511-4d76-a63e-95b95f731e3c");
    _Get_loginUser.Get_loginUser_200("Ben","Rvztt7bWKI");

    }

    @Test  (groups= {"Login","Login - Default Profile"})
    @TestModellerPath(guid = "42f2e76a-c2cc-4aa3-9019-14902f8c63cf")
    public void Negativesuccessfuloperation200Failure1()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("49f58e82-633e-4db5-a115-4e9f38fbc281");
    _Get_loginUser.Get_loginUser_200("#!_ @","");

    }

}