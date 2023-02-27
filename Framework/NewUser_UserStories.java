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
    _Post_createUser.Post_createUser_200("Iliana_Kunze25","#!_ @","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "b0284897-5ec4-4fa8-9182-c7e29a9489b2")
    public void NegativeSuccessful2002()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Jaylan26","","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "5035e419-d40e-427e-b7a4-b5f07f7be822")
    public void NegativeSuccessful2003()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Carlie30","Hassie","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "6bb562e1-9457-4212-94ae-f709861a901a")
    public void NegativeSuccessful2004()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Carlie85","Tiana","#!_ @","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "5f69919e-4c49-4817-aac9-63b6b75a02f5")
    public void NegativeSuccessful2005()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Ila59","Stephen","Turcotte","ben","4wyd7N5WZR","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "76a61085-a346-4343-b0db-3dc02c244a24")
    public void NegativeSuccessful2006()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Darrell_Kovacek22","Anabelle","Lehner","ben","4iIlS4DVeh","#!_ @",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "79c8cecc-3a56-4c88-a4cd-4fa779c1b51f")
    public void PositiveSuccessful200NegativeSuccessful200()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Craig.Bauch","Anika","Wiegand","ben","MoxgkwzGle","1-240-921-5625 x0341",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "931330c7-f502-40b6-9b60-291704f97fe2")
    public void PositiveSuccessful200NegativeSuccessful2001()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Haylee.Hauck28","Piper","Stanton","ben","6unSCmJjWM","747.600.4681",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "4dbd0b44-4614-46da-8b0f-e2df95be9015")
    public void PositiveSuccessful200NegativeSuccessful2002()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Hazel_Renner88","Julia","Boehm","ben","VrKR0gOTsg","543.286.0072",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "c6e7b3e8-b068-4961-b417-01c2a77b89d7")
    public void PositiveSuccessful200PositiveSuccessful200()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Ernie_King83","Gina","Brakus","ben","vDciAOKxUK","1-567-218-1081",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "79eba249-fcef-4809-a7f7-11d6f3b6d255")
    public void PositiveSuccessful200PositiveSuccessful2001()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Vicenta_Mertz","Baby","Jacobs","ben","AbR4lbafPw","229.510.5649 x80205",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "dc6f3cee-997e-484e-9a8f-b4951cc50efa")
    public void PositiveSuccessful200PositiveSuccessful2002()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Enoch_Rau","Wilburn","Berge","ben","u6pRofngsE","1-610-683-1544",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "e3cb475c-8939-4dce-a72a-d3cada25aa06")
    public void PositiveSuccessful200NegativeSuccessful2003()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Eloy49","Jerald","Ledner","ben","jWWbLpkO2M","756-903-3556",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "1f409d2d-6350-4475-9853-d69317678b34")
    public void PositiveSuccessful200NegativeSuccessful2004()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Calista80","Catherine","Sawayn","ben","oLlD35YTtC","573.440.9820",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "64b65177-48aa-4747-8c36-39767b6744bf")
    public void NegativeSuccessful2007()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Brando_Rau","Deron","Jones","ben","#!_ @","",12345);

    }

}