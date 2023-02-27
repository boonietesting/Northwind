package tests;

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

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/d5c4782e-b8f4-4c65-a894-08a4e28c367e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 191, profileId = 100266)
public class MagentoLogin_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Magento Login","Magento Login - Default Profile"})
    @TestModellerPath(guid = "5715b84d-87a1-4a14-8241-2cf30036cd24")
    public void OpenURLEnterEmailClicksigninInvalidemailerrorError()
    {
        
        pages.Magento_Login _Magento_Login = new pages.Magento_Login (getDriver());
    TestModellerLogger.SetLastNodeGuid("69eba214-1909-4273-9d1c-495362d9c47e");
    _Magento_Login.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b3054a06-2371-4672-9650-b3143fb87adb");
    _Magento_Login.Enter_Email("invalidEmail");
    

    TestModellerLogger.SetLastNodeGuid("d1eb685b-a149-4b88-a80e-c136c1029bdf");
    _Magento_Login.Click_Signin_Button();
    

    TestModellerLogger.SetLastNodeGuid("c9e3aeb5-b6db-4e63-b702-d7108f71bea3");
    _Magento_Login.Assert_Invalid_Email();
    

    }

    @Test  (groups= {"Magento Login","Magento Login - Default Profile"})
    @TestModellerPath(guid = "45d05c87-d081-4b30-add7-6d29fa7625d8")
    public void OpenURLEnterEmailEnterPasswordClickSigninAuthenticated()
    {
        
        pages.Magento_Login _Magento_Login = new pages.Magento_Login (getDriver());
    TestModellerLogger.SetLastNodeGuid("69eba214-1909-4273-9d1c-495362d9c47e");
    _Magento_Login.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b9e89584-4926-4fe2-9499-7db82aecde11");
    _Magento_Login.Enter_Email("roni_cost@example.com");
    

    TestModellerLogger.SetLastNodeGuid("ca8da4a0-ab5e-4d45-be0f-4cc7d3d69f37");
    _Magento_Login.Enter_Password("roni_cost3@example.com");
    

    TestModellerLogger.SetLastNodeGuid("2b60fb44-5a24-4504-9224-aa5b9c48b461");
    _Magento_Login.Click_Signin_Button();
    

    }

    @Test  (groups= {"Magento Login","Magento Login - Default Profile"})
    @TestModellerPath(guid = "fe708be6-c170-4ee3-89e0-d1cfd220e587")
    public void OpenURLEnterEmailEnterPasswordClickSigninAssertinvalidpassworderrorError()
    {
        
        pages.Magento_Login _Magento_Login = new pages.Magento_Login (getDriver());
    TestModellerLogger.SetLastNodeGuid("69eba214-1909-4273-9d1c-495362d9c47e");
    _Magento_Login.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b9e89584-4926-4fe2-9499-7db82aecde11");
    _Magento_Login.Enter_Email("roni_cost@example.com");
    

    TestModellerLogger.SetLastNodeGuid("3a4d8f81-4cc7-43bc-8c50-ee6e5bb209fe");
    _Magento_Login.Enter_Password("");
    

    TestModellerLogger.SetLastNodeGuid("de56e522-bb35-4d4c-9db6-b70b44b5c243");
    _Magento_Login.Click_Signin_Button();
    

    TestModellerLogger.SetLastNodeGuid("b1a1c12e-3f59-450d-8c4a-13942a7c2bc3");
    _Magento_Login.Assert_Invalid_Password();
    

    }

}