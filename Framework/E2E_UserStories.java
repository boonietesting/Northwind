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

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/574a321f-c7af-44f8-b1f2-f6101a7694e3
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 239, profileId = 100341)
public class E2E_UserStories extends TestBase
{
    

    
    @Test  (groups= {"E2E","E2E - User Stories"})
    @TestModellerPath(guid = "3ea15aa0-0c65-44d3-89d2-2871233dc0e0")
    public void Negativesuccessfuloperation200FailureNegativeSuccessful200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("49f58e82-633e-4db5-a115-4e9f38fbc281");
    _Get_loginUser.Get_loginUser_200("Ben","#!_ @");

   pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("9016969d-2ebb-48ef-9eb7-d6c7cfc61962");
    _Post_addPet.Post_addPet_200("389348","","","","");

    }

    @Test  (groups= {"E2E","E2E - User Stories"})
    @TestModellerPath(guid = "8c9e8a81-d222-4d0d-af28-9b47477df789")
    public void Negativesuccessfuloperation200FailureNegativeSuccessful2001()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("49f58e82-633e-4db5-a115-4e9f38fbc281");
    _Get_loginUser.Get_loginUser_200("#!_ @","");

   pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("9016969d-2ebb-48ef-9eb7-d6c7cfc61962");
    _Post_addPet.Post_addPet_200("perspiciatis","389348","","","");

    }

    @Test  (groups= {"E2E","E2E - User Stories"})
    @TestModellerPath(guid = "bb426c1c-313b-4996-8d38-37c450e24790")
    public void Positivesuccessfuloperation200SuccessNegativeSuccessful200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("193e2cde-9511-4d76-a63e-95b95f731e3c");
    _Get_loginUser.Get_loginUser_200("Ben","ezL9tbCJeT");

   pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("9016969d-2ebb-48ef-9eb7-d6c7cfc61962");
    _Post_addPet.Post_addPet_200("omnis","ea","#!_ @","","");

    }

    @Test  (groups= {"E2E","E2E - User Stories"})
    @TestModellerPath(guid = "efefaf9f-4c79-4011-b8c2-51d6bf451abb")
    public void Negativesuccessfuloperation200FailurePositiveSuccessful200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("49f58e82-633e-4db5-a115-4e9f38fbc281");
    _Get_loginUser.Get_loginUser_200("Ben","#!_ @");

   pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("a4071257-1ed4-47af-88ff-8b83eeb3797f");
    _Post_addPet.Post_addPet_200("et","cumque","http://augustus.info","debitis","available");

    }

    @Test  (groups= {"E2E","E2E - User Stories"})
    @TestModellerPath(guid = "47831ea8-c84e-4748-8553-985bfb118ac7")
    public void Negativesuccessfuloperation200FailurePositiveSuccessful2001()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("49f58e82-633e-4db5-a115-4e9f38fbc281");
    _Get_loginUser.Get_loginUser_200("Ben","#!_ @");

   pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("a4071257-1ed4-47af-88ff-8b83eeb3797f");
    _Post_addPet.Post_addPet_200("in","architecto","https://timothy.info","qui","pending");

    }

    @Test  (groups= {"E2E","E2E - User Stories"})
    @TestModellerPath(guid = "0376349b-ed27-407a-8bbd-cbc3cbb0ac5e")
    public void Negativesuccessfuloperation200FailurePositiveSuccessful2002()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("49f58e82-633e-4db5-a115-4e9f38fbc281");
    _Get_loginUser.Get_loginUser_200("Ben","#!_ @");

   pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("a4071257-1ed4-47af-88ff-8b83eeb3797f");
    _Post_addPet.Post_addPet_200("maiores","est","https://lorena.biz","culpa","sold");

    }

    @Test  (groups= {"E2E","E2E - User Stories"})
    @TestModellerPath(guid = "ade48e57-64ff-4037-af87-60318b1ea2cc")
    public void Negativesuccessfuloperation200FailureNegativeSuccessful2002()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("49f58e82-633e-4db5-a115-4e9f38fbc281");
    _Get_loginUser.Get_loginUser_200("Ben","#!_ @");

   pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("9016969d-2ebb-48ef-9eb7-d6c7cfc61962");
    _Post_addPet.Post_addPet_200("voluptatem","deleniti","https://consuelo.info","389348","");

    }

    @Test  (groups= {"E2E","E2E - User Stories"})
    @TestModellerPath(guid = "2aa1667e-7c34-4353-aed1-36b8ace9465f")
    public void Negativesuccessfuloperation200FailureNegativeSuccessful2003()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("49f58e82-633e-4db5-a115-4e9f38fbc281");
    _Get_loginUser.Get_loginUser_200("Ben","#!_ @");

   pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("9016969d-2ebb-48ef-9eb7-d6c7cfc61962");
    _Post_addPet.Post_addPet_200("quas","qui","","","");

    }

}