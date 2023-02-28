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
@TestModellerSuite(id = 204, profileId = 100257)
public class CreateUser_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "46e799a0-f137-4e9d-ac22-d0c46ac97c80")
    public void NegativeSuccessful200Negative()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("Darrin.Dietrich34","#!_ @","","ben.riley@curiosity.software","","",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "37109559-ec15-4ba5-a395-4da728d85f9d")
    public void NegativeSuccessful200Negative1()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("Elisabeth_Will48","Gabriella","#!_ @","ben.riley@curiosity.software","","",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "6a2040d1-9b9d-4d69-a7d0-47ba2185c39e")
    public void NegativeSuccessful200Negative2()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("Orion_Braun","Betty","Fisher","ben.riley@curiosity.software","k2Cm2sp27t","",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "6c8cf2db-e512-4a72-a788-4d6f792b87fb")
    public void PositiveSuccessful200Positive()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("0e562eaa-3201-4d11-b3fd-8ed19246fdda");
    _Post_createUser.Post_createUser_200("Kyler.Hilpert","Casey","Cassin","ben.riley@curiosity.software","zSirKvfIGH","362-378-2949 x8999",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "0f094124-12e5-4f7f-94f7-76af2aef9fcb")
    public void NegativeSuccessful200Negative3()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("Tyrell34","Augustine","Roberts","ben.riley@curiosity.software","FK7_2QwuX8","#!_ @",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "9a8386ff-3e77-4e30-988d-f6ea1dd0d2d4")
    public void NegativeSuccessful200Negative4()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("Thurman.Hilll64","Zackery","Schroeder","ben.riley@curiosity.software","#!_ @","",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "86058f1e-f743-47b6-ac48-8dc24c9db6f5")
    public void NegativeSuccessful200Negative5()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("Leatha.Wolf","Clarissa","","ben.riley@curiosity.software","","",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "ef8ac86a-0294-4362-b7a7-5962fa6b26b8")
    public void NegativeSuccessful200Negative6()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("Loyal93","","","ben.riley@curiosity.software","","",Active);

    }

    @Test  (groups= {"Create User","Create User - Default Profile"})
    @TestModellerPath(guid = "e0e681b7-e8e2-4a74-bb80-ce804b1271bf")
    public void NegativeSuccessful200Negative7()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("3be853f5-6491-43f5-8eb2-3afb76bb15b2");
    _Post_createUser.Post_createUser_200("#!_ @","","","ben.riley@curiosity.software","","",Active);

    }

}