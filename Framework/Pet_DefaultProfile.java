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

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/b498fc18-bb7e-4927-bf8b-2b699df0d5d4
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 228, profileId = 100320)
public class Pet_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Pet","Pet - Default Profile"})
    @TestModellerPath(guid = "cf54967d-2ebf-4730-af2c-812bf9a2912e")
    public void NegativeSuccessful200()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("d274047c-da58-49ff-9009-f491d52ee0f2");
    _Post_addPet.Post_addPet_200("at","389348","","","");

    }

    @Test  (groups= {"Pet","Pet - Default Profile"})
    @TestModellerPath(guid = "cb4ef553-d3a5-4d20-9789-0f4e9a0d03c5")
    public void NegativeSuccessful2001()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("d274047c-da58-49ff-9009-f491d52ee0f2");
    _Post_addPet.Post_addPet_200("aspernatur","omnis","#!_ @","","");

    }

    @Test  (groups= {"Pet","Pet - Default Profile"})
    @TestModellerPath(guid = "232c1d66-cc11-4195-98a1-fd369afa6f7f")
    public void NegativeSuccessful2002()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("d274047c-da58-49ff-9009-f491d52ee0f2");
    _Post_addPet.Post_addPet_200("id","excepturi","http://elinor.name","389348","");

    }

    @Test  (groups= {"Pet","Pet - Default Profile"})
    @TestModellerPath(guid = "d68650fa-f885-451b-89c7-71455e56fcd5")
    public void PositiveSuccessful200()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("65e7fda0-7f06-4fcb-8ff0-dca2f0fdaf27");
    _Post_addPet.Post_addPet_200("labore","et","https://earlene.com","sed","available");

    }

    @Test  (groups= {"Pet","Pet - Default Profile"})
    @TestModellerPath(guid = "326776cb-38a6-4d94-bac1-b6515c6b8933")
    public void PositiveSuccessful2001()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("65e7fda0-7f06-4fcb-8ff0-dca2f0fdaf27");
    _Post_addPet.Post_addPet_200("et","voluptas","http://beth.name","veniam","pending");

    }

    @Test  (groups= {"Pet","Pet - Default Profile"})
    @TestModellerPath(guid = "0b33fcdc-27c6-4c80-9eb1-f7482dd7101c")
    public void PositiveSuccessful2002()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("65e7fda0-7f06-4fcb-8ff0-dca2f0fdaf27");
    _Post_addPet.Post_addPet_200("enim","iusto","http://althea.name","aspernatur","sold");

    }

    @Test  (groups= {"Pet","Pet - Default Profile"})
    @TestModellerPath(guid = "ddc207e8-23a5-404b-9805-549365348dc0")
    public void NegativeSuccessful2003()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("d274047c-da58-49ff-9009-f491d52ee0f2");
    _Post_addPet.Post_addPet_200("nobis","voluptatem","","","");

    }

    @Test  (groups= {"Pet","Pet - Default Profile"})
    @TestModellerPath(guid = "4585bd3e-d811-4e86-a461-d324d7a2b288")
    public void NegativeSuccessful2004()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("d274047c-da58-49ff-9009-f491d52ee0f2");
    _Post_addPet.Post_addPet_200("389348","","","","");

    }

}