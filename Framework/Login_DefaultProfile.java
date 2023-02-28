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
@TestModellerSuite(id = 235, profileId = 100332)
public class Login_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Login","Login - Default Profile"})
    @TestModellerPath(guid = "415c1bf9-66c5-4600-9a36-2560cfd9fea8")
    public void Negativesuccessfuloperation200Failure()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("49f58e82-633e-4db5-a115-4e9f38fbc281");
    _Get_loginUser.Get_loginUser_200("Elwyn.DAmore17","#!_ @");

    }

    @Test  (groups= {"Login","Login - Default Profile"})
    @TestModellerPath(guid = "6f616c1d-b723-4214-9d3f-b99836916639")
    public void Positivesuccessfuloperation200Success()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("193e2cde-9511-4d76-a63e-95b95f731e3c");
    _Get_loginUser.Get_loginUser_200("Ofelia66","gbH9zDAZZY");

    }

    @Test  (groups= {"Login","Login - Default Profile"})
    @TestModellerPath(guid = "ce11726a-5b00-41fd-b6ac-067553271fc8")
    public void Negativesuccessfuloperation200Failure1()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("49f58e82-633e-4db5-a115-4e9f38fbc281");
    _Get_loginUser.Get_loginUser_200("#!_ @","");

    }

}