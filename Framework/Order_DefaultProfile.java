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

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/9f3a9a4e-a6dc-4957-98ad-2ba01cdd09f1
@Listeners({TestNGListener.class, ExtentTestListener.class})
@TestModellerSuite(id = 238, profileId = 100338)
public class Order_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Order","Order - Default Profile"})
    @TestModellerPath(guid = "992ce74a-6264-4a6f-95f9-0c9f1da96a8c")
    public void NegativeSuccessful200()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("9016969d-2ebb-48ef-9eb7-d6c7cfc61962");
    _Post_addPet.Post_addPet_200("389348","","","","");

    }

    @Test  (groups= {"Order","Order - Default Profile"})
    @TestModellerPath(guid = "58322281-033c-405f-b949-aace9aed3413")
    public void NegativeSuccessful2001()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("9016969d-2ebb-48ef-9eb7-d6c7cfc61962");
    _Post_addPet.Post_addPet_200("quia","389348","","","");

    }

    @Test  (groups= {"Order","Order - Default Profile"})
    @TestModellerPath(guid = "7aeac67e-92eb-49cb-b4b2-c8b841c78d57")
    public void NegativeSuccessful2002()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("9016969d-2ebb-48ef-9eb7-d6c7cfc61962");
    _Post_addPet.Post_addPet_200("neque","qui","#!_ @","","");

    }

    @Test  (groups= {"Order","Order - Default Profile"})
    @TestModellerPath(guid = "da614756-cc5f-4843-a395-92ec67a7047e")
    public void PositiveSuccessful200()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("a4071257-1ed4-47af-88ff-8b83eeb3797f");
    _Post_addPet.Post_addPet_200("voluptatem","quis","https://adriana.org","dolores","available");

    }

    @Test  (groups= {"Order","Order - Default Profile"})
    @TestModellerPath(guid = "8b5a4d3d-879a-47a0-9685-59598593b7ab")
    public void PositiveSuccessful2001()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("a4071257-1ed4-47af-88ff-8b83eeb3797f");
    _Post_addPet.Post_addPet_200("accusantium","sunt","https://cody.info","eum","pending");

    }

    @Test  (groups= {"Order","Order - Default Profile"})
    @TestModellerPath(guid = "2c3c844e-b18b-48b3-a9c5-e0929512711f")
    public void PositiveSuccessful2002()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("a4071257-1ed4-47af-88ff-8b83eeb3797f");
    _Post_addPet.Post_addPet_200("eum","ipsa","http://einar.com","et","sold");

    }

    @Test  (groups= {"Order","Order - Default Profile"})
    @TestModellerPath(guid = "2fe63a17-6c38-4f16-a83b-02011b92afbc")
    public void NegativeSuccessful2003()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("9016969d-2ebb-48ef-9eb7-d6c7cfc61962");
    _Post_addPet.Post_addPet_200("qui","rerum","http://rose.biz","389348","");

    }

    @Test  (groups= {"Order","Order - Default Profile"})
    @TestModellerPath(guid = "41dfe68a-8b16-4dbf-a1ed-ecba969c950e")
    public void NegativeSuccessful2004()
    {
        
           pages.Post_addPet _Post_addPet = new pages.Post_addPet(getDriver());
    TestModellerLogger.SetLastNodeGuid("9016969d-2ebb-48ef-9eb7-d6c7cfc61962");
    _Post_addPet.Post_addPet_200("fuga","quam","","","");

    }

}