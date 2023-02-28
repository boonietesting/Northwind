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

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/daf3bea4-0f08-4cf4-a642-4d7ba27a5a81
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 230, profileId = 100323)
public class BusinessProcess_UserStories extends TestBase
{
    

    
    @Test  (groups= {"Business Process","Business Process - User Stories"})
    @TestModellerPath(guid = "9335bfb6-aa80-4d93-82d9-a8ec039f50d1")
    public void NegativeSuccessful200successfuloperation200()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("d274047c-da58-49ff-9009-f491d52ee0f2");
    _Post_addPet.Post_addPet_200("qui","389348","","","");

   pages.Get_getInventory _Get_getInventory = new pages.Get_getInventory(getDriver());
    TestModellerLogger.SetLastNodeGuid("5bf807f6-93b5-4d0c-976f-c0bb273f3196");
    _Get_getInventory.Get_getInventory_200();

    }

    @Test  (groups= {"Business Process","Business Process - User Stories"})
    @TestModellerPath(guid = "da5fe492-4bb1-45ac-9a14-1b0a12e80178")
    public void Negativesuccessfuloperation200NegativeSuccessful200successfuloperation200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("f5a97c4d-03b4-4e45-8351-4c6d95cb94a2");
    _Get_loginUser.Get_loginUser_200("#!_ @","");

   pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("d274047c-da58-49ff-9009-f491d52ee0f2");
    _Post_addPet.Post_addPet_200("vel","optio","#!_ @","","");

   pages.Get_getInventory _Get_getInventory = new pages.Get_getInventory(getDriver());
    TestModellerLogger.SetLastNodeGuid("5bf807f6-93b5-4d0c-976f-c0bb273f3196");
    _Get_getInventory.Get_getInventory_200();

    }

    @Test  (groups= {"Business Process","Business Process - User Stories"})
    @TestModellerPath(guid = "3d82255b-08ef-4f32-90d0-69e1758fa273")
    public void Negativesuccessfuloperation200NegativeSuccessful200successfuloperation2001()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("f5a97c4d-03b4-4e45-8351-4c6d95cb94a2");
    _Get_loginUser.Get_loginUser_200("Ben","#!_ @");

   pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("d274047c-da58-49ff-9009-f491d52ee0f2");
    _Post_addPet.Post_addPet_200("vero","officia","https://courtney.info","389348","");

   pages.Get_getInventory _Get_getInventory = new pages.Get_getInventory(getDriver());
    TestModellerLogger.SetLastNodeGuid("5bf807f6-93b5-4d0c-976f-c0bb273f3196");
    _Get_getInventory.Get_getInventory_200();

    }

    @Test  (groups= {"Business Process","Business Process - User Stories"})
    @TestModellerPath(guid = "6db12dd4-b7ba-4101-b3f8-7cf933a1ff8a")
    public void Positivesuccessfuloperation200PositiveSuccessful200successfuloperation200()
    {
        
           pages.Get_loginUser _Get_loginUser = new pages.Get_loginUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("72bd5192-b1b0-4fa8-aaf2-e3a983c9abf9");
    _Get_loginUser.Get_loginUser_200("Ben","8v2I0uXaWv");

   pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("65e7fda0-7f06-4fcb-8ff0-dca2f0fdaf27");
    _Post_addPet.Post_addPet_200("sint","voluptas","https://ida.name","similique","available");

   pages.Get_getInventory _Get_getInventory = new pages.Get_getInventory(getDriver());
    TestModellerLogger.SetLastNodeGuid("5bf807f6-93b5-4d0c-976f-c0bb273f3196");
    _Get_getInventory.Get_getInventory_200();

    }

    @Test  (groups= {"Business Process","Business Process - User Stories"})
    @TestModellerPath(guid = "164fd0df-433c-4503-bd26-617e847707ff")
    public void PositiveSuccessful200successfuloperation200()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("65e7fda0-7f06-4fcb-8ff0-dca2f0fdaf27");
    _Post_addPet.Post_addPet_200("ipsa","est","https://oswaldo.com","eos","pending");

   pages.Get_getInventory _Get_getInventory = new pages.Get_getInventory(getDriver());
    TestModellerLogger.SetLastNodeGuid("5bf807f6-93b5-4d0c-976f-c0bb273f3196");
    _Get_getInventory.Get_getInventory_200();

    }

    @Test  (groups= {"Business Process","Business Process - User Stories"})
    @TestModellerPath(guid = "bc01fdf7-60c1-4a93-9e0c-be32a00f8aea")
    public void PositiveSuccessful200successfuloperation2001()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("65e7fda0-7f06-4fcb-8ff0-dca2f0fdaf27");
    _Post_addPet.Post_addPet_200("itaque","suscipit","http://kenna.biz","ducimus","sold");

   pages.Get_getInventory _Get_getInventory = new pages.Get_getInventory(getDriver());
    TestModellerLogger.SetLastNodeGuid("5bf807f6-93b5-4d0c-976f-c0bb273f3196");
    _Get_getInventory.Get_getInventory_200();

    }

    @Test  (groups= {"Business Process","Business Process - User Stories"})
    @TestModellerPath(guid = "2830ed71-19fd-43bd-a0d5-1d9c8a061cff")
    public void NegativeSuccessful200successfuloperation2001()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("d274047c-da58-49ff-9009-f491d52ee0f2");
    _Post_addPet.Post_addPet_200("sit","debitis","","","");

   pages.Get_getInventory _Get_getInventory = new pages.Get_getInventory(getDriver());
    TestModellerLogger.SetLastNodeGuid("5bf807f6-93b5-4d0c-976f-c0bb273f3196");
    _Get_getInventory.Get_getInventory_200();

    }

    @Test  (groups= {"Business Process","Business Process - User Stories"})
    @TestModellerPath(guid = "5a057743-fcbd-4b2b-9a23-822a1ab1255c")
    public void NegativeSuccessful200successfuloperation2002()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("d274047c-da58-49ff-9009-f491d52ee0f2");
    _Post_addPet.Post_addPet_200("389348","","","","");

   pages.Get_getInventory _Get_getInventory = new pages.Get_getInventory(getDriver());
    TestModellerLogger.SetLastNodeGuid("5bf807f6-93b5-4d0c-976f-c0bb273f3196");
    _Get_getInventory.Get_getInventory_200();

    }

}