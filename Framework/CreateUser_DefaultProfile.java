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

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/37132625-14ab-4664-92a9-52c894ba5656
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 205, profileId = 100257)
public class CreateUser_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "e216e8da-6110-4ecc-a445-d1170ef07877")
    public void NegativeSuccessful200Negative()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("Murphy_Schmidt7","#!_ @","","ben.riley@curiosity.software","","",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "0b44d87b-578f-46d5-b863-9f0409d64217")
    public void NegativeSuccessful200Negative1()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("Edmond_Connelly","Olga","#!_ @","ben.riley@curiosity.software","","",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "8f9cd193-3a5d-4f93-b1d2-35e145f70e5e")
    public void PositiveSuccessful200Positive()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("0e562eaa-3201-4d11-b3fd-8ed19246fdda");
    _Post_createUser.Post_createUser_200("Nyasia_Dietrich","Ricardo","Veum","ben.riley@curiosity.software","","429-548-1631",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "86cb48a4-5452-4a26-84ac-08b6cf1d32be")
    public void NegativeSuccessful200Negative2()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("Luis.Bednar96","Anjali","Rohan","ben.riley@curiosity.software","fWywfo2QIB","",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "f3ed064b-4568-4579-93b4-0d4ed106d997")
    public void PositiveSuccessful200Positive1()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("0e562eaa-3201-4d11-b3fd-8ed19246fdda");
    _Post_createUser.Post_createUser_200("Myrtie45","Jake","MacGyver","ben.riley@curiosity.software","MZiM2XJUz_","(481) 407-4771 x9562",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "9e83117f-4b72-48a7-8d98-c8cad9318546")
    public void NegativeSuccessful200Negative3()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("Ike94","Leonor","Huels","ben.riley@curiosity.software","P5q8aFPZrC","#!_ @",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "f56afb47-41b7-40eb-9c90-0353e4f223e7")
    public void NegativeSuccessful200Negative4()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("Kay97","Mozell","Boyer","ben.riley@curiosity.software","#!_ @","",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "8b7e5d88-1b84-4bb2-8d07-8e846417079e")
    public void NegativeSuccessful200Negative5()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("Kari_Kshlerin","Zane","","ben.riley@curiosity.software","","",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "a4ef8da6-16c8-4ecc-a5d6-2c8cb983825e")
    public void NegativeSuccessful200Negative6()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("Vern26","","","ben.riley@curiosity.software","","",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "e437af01-048f-4f52-9c7d-7efe330eab38")
    public void NegativeSuccessful200Negative7()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("#!_ @","","","ben.riley@curiosity.software","","",Active);

    }

}