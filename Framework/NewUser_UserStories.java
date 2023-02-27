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
@TestModellerSuite(id = 198, profileId = 100281)
public class NewUser_UserStories extends TestBase
{
    

    
    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "464c0680-9a01-4e89-9606-eda92048659e")
    public void NegativeSuccessful200()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("#!_ @","","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "8556166f-e74d-40ab-87f5-f0b8e92104df")
    public void NegativeSuccessful2001()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Isadore_Mayert","#!_ @","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "b0284897-5ec4-4fa8-9182-c7e29a9489b2")
    public void NegativeSuccessful2002()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Rosalee.Hoeger","","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "5035e419-d40e-427e-b7a4-b5f07f7be822")
    public void NegativeSuccessful2003()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Jayda80","Bernita","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "6bb562e1-9457-4212-94ae-f709861a901a")
    public void NegativeSuccessful2004()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Stanford.Blick","Rylan","#!_ @","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "5f69919e-4c49-4817-aac9-63b6b75a02f5")
    public void NegativeSuccessful2005()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Annamarie.Sipes16","Maryjane","Russel","ben","6sTlGYtQ_W","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "76a61085-a346-4343-b0db-3dc02c244a24")
    public void NegativeSuccessful2006()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Furman87","King","Gleichner","ben","GcOTifWqc_","#!_ @",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "79c8cecc-3a56-4c88-a4cd-4fa779c1b51f")
    public void PositiveSuccessful200NegativeSuccessful200()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Ayla_Carter40","Jackeline","Bergstrom","ben","qvc0LXn6pP","1-492-333-9867 x12240",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "931330c7-f502-40b6-9b60-291704f97fe2")
    public void PositiveSuccessful200NegativeSuccessful2001()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Adonis_Hirthe","Lily","Pfannerstill","ben","rK_j9RWk7A","1-227-436-7320",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "4dbd0b44-4614-46da-8b0f-e2df95be9015")
    public void PositiveSuccessful200NegativeSuccessful2002()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Lue_MacGyver42","Israel","Brekke","ben","IuvM4XHULw","1-974-413-7133",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "c6e7b3e8-b068-4961-b417-01c2a77b89d7")
    public void PositiveSuccessful200PositiveSuccessful200()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Ressie.Grimes2","Ines","Feeney","ben","YPiHSAk6QR","915-227-1722 x570",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "79eba249-fcef-4809-a7f7-11d6f3b6d255")
    public void PositiveSuccessful200PositiveSuccessful2001()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Jadyn.Reinger","Lamont","Cartwright","ben","NKf4pc40ZQ","(509) 204-7297",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "dc6f3cee-997e-484e-9a8f-b4951cc50efa")
    public void PositiveSuccessful200PositiveSuccessful2002()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Jaylen25","Oran","Fisher","ben","yVZsuw1vvm","235-572-2997",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "e3cb475c-8939-4dce-a72a-d3cada25aa06")
    public void PositiveSuccessful200NegativeSuccessful2003()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Filomena.Padberg37","Carleton","Spinka","ben","YxidyON7au","895-220-1296 x4961",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "1f409d2d-6350-4475-9853-d69317678b34")
    public void PositiveSuccessful200NegativeSuccessful2004()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Shanelle25","Thora","Daniel","ben","7P9GstcRKD","405.947.6089 x3265",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "64b65177-48aa-4747-8c36-39767b6744bf")
    public void NegativeSuccessful2007()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Keegan.Schneider","Macie","Jacobi","ben","#!_ @","",12345);

    }

}