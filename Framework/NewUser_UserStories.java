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

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/9d7639a6-524b-4e5b-aa58-2e8ecea4bcb8
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 196, profileId = 100281)
public class NewUser_UserStories extends TestBase
{
    

    
    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "dd9b65c2-34bc-4438-acf5-00f8dba3d5c6")
    public void NegativeSuccessful200()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("#!_ @","","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "0b27ac2a-66ef-4559-81ee-b26a1227bec6")
    public void NegativeSuccessful2001()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Chet51","#!_ @","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "eabc7927-191b-4974-90e5-e27e4ebcb1ad")
    public void NegativeSuccessful2002()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Meredith_Douglas27","","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "7ff99793-0e1f-498c-8d6b-f7f845077464")
    public void NegativeSuccessful2003()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Lesly_Shanahan14","Meggie","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "15fc0ecd-5430-4ccf-b591-4bafe41c37fc")
    public void NegativeSuccessful2004()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Miguel.Sauer","Hank","#!_ @","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "6abbe7f0-e2f4-48b0-a846-64e65efe4683")
    public void NegativeSuccessful2005()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Arianna_Bernhard","Isidro","Monahan","ben","9mQyVgYNjy","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "2ad46aa3-e2d4-4af9-9353-6aeb77da8643")
    public void NegativeSuccessful2006()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Wilhelmine_Hoeger","Reggie","Hansen","ben","5R4LlNXXy1","#!_ @",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "b2150ede-d67e-443f-9dff-0c744f0553a2")
    public void PositiveSuccessful200()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Alexandrea5","Jolie","Koepp","ben","hqTQTuoalJ","641-949-8740 x554",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "ba5f4ffe-cd61-491f-a57d-e1d1330a9493")
    public void NegativeSuccessful2007()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Darrion63","Kane","Bartoletti","ben","#!_ @","",12345);

    }

}