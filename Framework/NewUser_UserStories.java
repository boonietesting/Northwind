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
@TestModellerSuite(id = 199, profileId = 100281)
public class NewUser_UserStories extends TestBase
{
    

    
    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "337622aa-9596-4954-9e44-8f59441813ad")
    public void NegativeSuccessful200()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("#!_ @","","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "f7703a67-6f2f-4546-aad6-907ed1805df5")
    public void NegativeSuccessful2001()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Kevon_Johnston","#!_ @","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "c0f9d23c-4d29-44ec-90fa-2383d25b471f")
    public void NegativeSuccessful2002()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Shawna.Grady","#!_ @","","ben","","#!_ @",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "25809666-13de-4f88-b6bb-99eb02c47c19")
    public void NegativeSuccessful2003()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Micaela80","","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "d817855b-55b4-45a4-b32e-e07a35c84a43")
    public void PositiveSuccessful200NegativeSuccessful200()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Edwardo_Ullrich43","Mariane","","ben","","(771) 655-1135",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "f845c799-aa3b-4126-88b7-e6d272cd305b")
    public void PositiveSuccessful200NegativeSuccessful2001()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Isaias_Johnson45","Andreane","","ben","","954-985-2832 x60621",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "dbacc648-cb5d-4c7f-aa6c-726961258d1f")
    public void PositiveSuccessful200NegativeSuccessful2002()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Chaim.Jerde","Royal","","ben","","(228) 625-1510",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "df44ac3b-e482-48ec-ad9f-c757b1d23b17")
    public void PositiveSuccessful200PositiveSuccessful200()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Julianne.Boyer10","Wayne","","ben","","481-688-2015 x6750",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "1153ffa9-1c4d-4af5-9ac9-7cb3390a90c7")
    public void PositiveSuccessful200PositiveSuccessful2001()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Vicenta.Gibson95","Sophie","","ben","","791.997.2105 x19032",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "eef42c0c-2e54-42ff-8fb5-704e166a9659")
    public void PositiveSuccessful200PositiveSuccessful2002()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Claudine39","Lisandro","","ben","","640.601.0538 x020",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "ddd5e6e1-ff5d-4fd3-a180-dbf2ba5fc4dd")
    public void PositiveSuccessful200NegativeSuccessful2003()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Magdalen.Bins5","Diego","","ben","","702-953-9100",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "e640f63e-60bb-40e3-ad71-a1174d82e0e6")
    public void PositiveSuccessful200NegativeSuccessful2004()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Makayla_Pollich","Vilma","","ben","","642.511.3380 x5113",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "9e73a87b-6df6-47e9-98dc-d2bac00263c2")
    public void NegativeSuccessful2004()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Favian79","Nayeli","","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "82cce234-6e57-4eb3-82e6-1f1d07430b57")
    public void NegativeSuccessful2005()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Kaelyn26","Justine","#!_ @","ben","","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "881c1b37-e404-4801-a7b3-9e477b36e153")
    public void NegativeSuccessful2006()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Maxime.Price","Emiliano","Konopelski","ben","Bnp5woCY78","",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "97d3175e-c948-4d0c-b8a9-72d4a4ba445c")
    public void NegativeSuccessful2007()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Peyton_Barrows77","Geraldine","Nitzsche","ben","ghoZxkSbDw","#!_ @",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "fa88cefa-a2f9-4032-86b1-86fed62bd4d7")
    public void PositiveSuccessful200NegativeSuccessful2005()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("55b223d3-0995-4303-94e6-600954889deb");
    _Post_createUser.Post_createUser_200("Jolie_Vandervort","Vicente","Hilll","ben","aM9SSNeMWd","1-446-554-0357 x6233",12345);

    }

    @Test  (groups= {"New User","New User - User Stories"})
    @TestModellerPath(guid = "542c6b6a-61f6-4591-81ce-8af262aab2ee")
    public void NegativeSuccessful2008()
    {
        
           pages.Post_createUser _Post_createUser = new pages.Post_createUser(getDriver());
    TestModellerLogger.SetLastNodeGuid("aaf33002-2edf-4609-8013-082166386229");
    _Post_createUser.Post_createUser_200("Shyann_Dare","Chyna","Schamberger","ben","#!_ @","",12345);

    }

}