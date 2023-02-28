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

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/d4b3c460-3b83-4ead-96ec-c479d5c835fa
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 210, profileId = 100293)
public class Test_TestCases extends TestBase
{
    

    
    @Test  (groups= {"Test","Test - Test Cases"})
    @TestModellerPath(guid = "faf188f8-2074-488a-9970-1760d19d1c47")
    public void Negativesuccessfuloperation200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("c72c1c01-c5af-4f41-9cf2-32513adcd408");
    _Get_loginUser.Get_loginUser_200("#!_ @","");

    }

    @Test  (groups= {"Test","Test - Test Cases"})
    @TestModellerPath(guid = "e83e1daf-4d78-4656-a08b-38b8b82a3a3e")
    public void Negativesuccessfuloperation2001()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("c72c1c01-c5af-4f41-9cf2-32513adcd408");
    _Get_loginUser.Get_loginUser_200("Dwight_McClure","#!_ @");

    }

    @Test  (groups= {"Test","Test - Test Cases"})
    @TestModellerPath(guid = "ee5dcdaa-cec4-4f39-828f-fd34f237b426")
    public void Positivesuccessfuloperation200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("6e564e44-59d3-4ca7-b909-c9fd6c994e28");
    _Get_loginUser.Get_loginUser_200("Vernice.Jacobson72","TwbsnK2ZSl");

    }

}