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

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/bbdad346-3980-4516-89ba-77f8d45d20f9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 108, profileId = 100077)
public class MasterShopApp_UserStories extends TestBase
{
    

    
    @Test  (groups= {"Master Shop App","Master Shop App - User Stories"})
    @TestModellerPath(guid = "499c1b81-2cda-45ac-a1b2-c6b2ae259f8c")
    public void AddCapabilityAddCapabilityAddCapabilityAddCapabilityConnectAppiumCapturePageScreenshotOpenMen()
    {
        
        pages.MobileGeneralActions _MobileGeneralActions = new pages.MobileGeneralActions (getDriver());
    TestModellerLogger.SetLastNodeGuid("68e7f268-5d38-492e-a16a-b8c63b379baa");
    _MobileGeneralActions.addCapability("platformName","Android");
    

    TestModellerLogger.SetLastNodeGuid("b3c898ec-152c-440d-b7df-c3a64123d10f");
    _MobileGeneralActions.addCapability("app","https://github.com/saucelabs/my-demo-app-rn/releases/download/v1.3.0/Android-MyDemoAppRN.1.3.0.build-244.apk");
    

    TestModellerLogger.SetLastNodeGuid("1b0ea9ea-9207-433d-ac4b-42763996e981");
    _MobileGeneralActions.addCapability("appPackage","com.saucelabs.mydemoapp");
    

    TestModellerLogger.SetLastNodeGuid("d4603536-e117-4af7-8086-b7f01c1f78b2");
    _MobileGeneralActions.addCapability("appActivity","com.saucelabs.mydemoapp.rn.MainActivity");
    

    TestModellerLogger.SetLastNodeGuid("9e33c4c1-c93d-4d31-9a93-072329600aab");
    _MobileGeneralActions.connectAppium("https://jameswalker90:68887628-16c4-4132-9c61-5decf9f1e6ff@ondemand.us-west-1.saucelabs.com:443/wd/hub");
    

    TestModellerLogger.SetLastNodeGuid("a8a11e10-cfee-48d1-8fe8-370a50923a5a");
    _MobileGeneralActions.capturePageScreenshot();
    

    TestModellerLogger.SetLastNodeGuid("872bbafd-0f2f-41a0-a549-df9f14f542c3");
    _MobileGeneralActions.clickElement("//android.view.ViewGroup[@content-desc=\"open menu\"]");
    

    TestModellerLogger.SetLastNodeGuid("87fd30d0-b695-47b1-bf46-56b0464a57ce");
    _MobileGeneralActions.clickElement("//android.view.ViewGroup[@content-desc=\"menu item log in\"]");
    

    TestModellerLogger.SetLastNodeGuid("98f8ec5e-b250-4c37-b674-c1a251cc4925");
    _MobileGeneralActions.clickElement("//android.view.ViewGroup[@content-desc=\"Login button\"]");
    

    TestModellerLogger.SetLastNodeGuid("539ec5f7-8201-4546-8b0c-fb239c4b17d1");
    _MobileGeneralActions.capturePageScreenshot();
    

    }

    @Test  (groups= {"Master Shop App","Master Shop App - User Stories"})
    @TestModellerPath(guid = "54705173-968e-4423-a3c4-7b1609f5339a")
    public void AddCapabilityAddCapabilityAddCapabilityAddCapabilityConnectAppiumCapturePageScreenshotOpenMen1()
    {
        
        pages.MobileGeneralActions _MobileGeneralActions = new pages.MobileGeneralActions (getDriver());
    TestModellerLogger.SetLastNodeGuid("68e7f268-5d38-492e-a16a-b8c63b379baa");
    _MobileGeneralActions.addCapability("platformName","Android");
    

    TestModellerLogger.SetLastNodeGuid("b3c898ec-152c-440d-b7df-c3a64123d10f");
    _MobileGeneralActions.addCapability("app","https://github.com/saucelabs/my-demo-app-rn/releases/download/v1.3.0/Android-MyDemoAppRN.1.3.0.build-244.apk");
    

    TestModellerLogger.SetLastNodeGuid("1b0ea9ea-9207-433d-ac4b-42763996e981");
    _MobileGeneralActions.addCapability("appPackage","com.saucelabs.mydemoapp");
    

    TestModellerLogger.SetLastNodeGuid("d4603536-e117-4af7-8086-b7f01c1f78b2");
    _MobileGeneralActions.addCapability("appActivity","com.saucelabs.mydemoapp.rn.MainActivity");
    

    TestModellerLogger.SetLastNodeGuid("9e33c4c1-c93d-4d31-9a93-072329600aab");
    _MobileGeneralActions.connectAppium("https://jameswalker90:68887628-16c4-4132-9c61-5decf9f1e6ff@ondemand.us-west-1.saucelabs.com:443/wd/hub");
    

    TestModellerLogger.SetLastNodeGuid("a8a11e10-cfee-48d1-8fe8-370a50923a5a");
    _MobileGeneralActions.capturePageScreenshot();
    

    TestModellerLogger.SetLastNodeGuid("872bbafd-0f2f-41a0-a549-df9f14f542c3");
    _MobileGeneralActions.clickElement("//android.view.ViewGroup[@content-desc=\"open menu\"]");
    

    TestModellerLogger.SetLastNodeGuid("87fd30d0-b695-47b1-bf46-56b0464a57ce");
    _MobileGeneralActions.clickElement("//android.view.ViewGroup[@content-desc=\"menu item log in\"]");
    

    TestModellerLogger.SetLastNodeGuid("ae80e675-e015-45a4-8053-7b673af08e46");
    _MobileGeneralActions.inputText("//android.widget.EditText[@content-desc=\"Password input field\"]","10203040");
    

    TestModellerLogger.SetLastNodeGuid("626fcbd9-c542-4370-938e-267402a9e58b");
    _MobileGeneralActions.clickElement("//android.view.ViewGroup[@content-desc=\"Login button\"]");
    

    TestModellerLogger.SetLastNodeGuid("7ffb88e0-9e2c-497a-a16d-212f20a23e8e");
    _MobileGeneralActions.capturePageScreenshot();
    

    }

    @Test  (groups= {"Master Shop App","Master Shop App - User Stories"})
    @TestModellerPath(guid = "e5e6635e-695d-449e-b37a-a15989e50df9")
    public void AddCapabilityAddCapabilityAddCapabilityAddCapabilityConnectAppiumCapturePageScreenshotOpenMen2()
    {
        
        pages.MobileGeneralActions _MobileGeneralActions = new pages.MobileGeneralActions (getDriver());
    TestModellerLogger.SetLastNodeGuid("68e7f268-5d38-492e-a16a-b8c63b379baa");
    _MobileGeneralActions.addCapability("platformName","Android");
    

    TestModellerLogger.SetLastNodeGuid("b3c898ec-152c-440d-b7df-c3a64123d10f");
    _MobileGeneralActions.addCapability("app","https://github.com/saucelabs/my-demo-app-rn/releases/download/v1.3.0/Android-MyDemoAppRN.1.3.0.build-244.apk");
    

    TestModellerLogger.SetLastNodeGuid("1b0ea9ea-9207-433d-ac4b-42763996e981");
    _MobileGeneralActions.addCapability("appPackage","com.saucelabs.mydemoapp");
    

    TestModellerLogger.SetLastNodeGuid("d4603536-e117-4af7-8086-b7f01c1f78b2");
    _MobileGeneralActions.addCapability("appActivity","com.saucelabs.mydemoapp.rn.MainActivity");
    

    TestModellerLogger.SetLastNodeGuid("9e33c4c1-c93d-4d31-9a93-072329600aab");
    _MobileGeneralActions.connectAppium("https://jameswalker90:68887628-16c4-4132-9c61-5decf9f1e6ff@ondemand.us-west-1.saucelabs.com:443/wd/hub");
    

    TestModellerLogger.SetLastNodeGuid("a8a11e10-cfee-48d1-8fe8-370a50923a5a");
    _MobileGeneralActions.capturePageScreenshot();
    

    TestModellerLogger.SetLastNodeGuid("872bbafd-0f2f-41a0-a549-df9f14f542c3");
    _MobileGeneralActions.clickElement("//android.view.ViewGroup[@content-desc=\"open menu\"]");
    

    TestModellerLogger.SetLastNodeGuid("87fd30d0-b695-47b1-bf46-56b0464a57ce");
    _MobileGeneralActions.clickElement("//android.view.ViewGroup[@content-desc=\"menu item log in\"]");
    

    TestModellerLogger.SetLastNodeGuid("03b6ba4d-9c77-4c4b-8388-e76b1477bbbd");
    _MobileGeneralActions.inputText("//android.widget.EditText[@content-desc=\"Username input field\"]","bob@example.com");
    

    TestModellerLogger.SetLastNodeGuid("170aac7a-b8ea-445d-8eb8-7d0369c527c6");
    _MobileGeneralActions.clickElement("//android.view.ViewGroup[@content-desc=\"Login button\"]");
    

    TestModellerLogger.SetLastNodeGuid("58959019-013f-4464-90a3-928cfc132514");
    _MobileGeneralActions.elementShouldBeVisible("//android.view.ViewGroup[@content-desc=\"Password-error-message\"]/android.widget.TextView");
    

    TestModellerLogger.SetLastNodeGuid("00c9307a-11b6-424d-a115-f72da3290af1");
    _MobileGeneralActions.capturePageScreenshot();
    

    }

    @Test  (groups= {"Master Shop App","Master Shop App - User Stories"})
    @TestModellerPath(guid = "9750b829-c720-4087-97e2-bdb57b2d4709")
    public void AddCapabilityAddCapabilityAddCapabilityAddCapabilityConnectAppiumCapturePageScreenshotOpenMen3()
    {
        
        pages.MobileGeneralActions _MobileGeneralActions = new pages.MobileGeneralActions (getDriver());
    TestModellerLogger.SetLastNodeGuid("68e7f268-5d38-492e-a16a-b8c63b379baa");
    _MobileGeneralActions.addCapability("platformName","Android");
    

    TestModellerLogger.SetLastNodeGuid("b3c898ec-152c-440d-b7df-c3a64123d10f");
    _MobileGeneralActions.addCapability("app","https://github.com/saucelabs/my-demo-app-rn/releases/download/v1.3.0/Android-MyDemoAppRN.1.3.0.build-244.apk");
    

    TestModellerLogger.SetLastNodeGuid("1b0ea9ea-9207-433d-ac4b-42763996e981");
    _MobileGeneralActions.addCapability("appPackage","com.saucelabs.mydemoapp");
    

    TestModellerLogger.SetLastNodeGuid("d4603536-e117-4af7-8086-b7f01c1f78b2");
    _MobileGeneralActions.addCapability("appActivity","com.saucelabs.mydemoapp.rn.MainActivity");
    

    TestModellerLogger.SetLastNodeGuid("9e33c4c1-c93d-4d31-9a93-072329600aab");
    _MobileGeneralActions.connectAppium("https://jameswalker90:68887628-16c4-4132-9c61-5decf9f1e6ff@ondemand.us-west-1.saucelabs.com:443/wd/hub");
    

    TestModellerLogger.SetLastNodeGuid("a8a11e10-cfee-48d1-8fe8-370a50923a5a");
    _MobileGeneralActions.capturePageScreenshot();
    

    TestModellerLogger.SetLastNodeGuid("872bbafd-0f2f-41a0-a549-df9f14f542c3");
    _MobileGeneralActions.clickElement("//android.view.ViewGroup[@content-desc=\"open menu\"]");
    

    TestModellerLogger.SetLastNodeGuid("87fd30d0-b695-47b1-bf46-56b0464a57ce");
    _MobileGeneralActions.clickElement("//android.view.ViewGroup[@content-desc=\"menu item log in\"]");
    

    TestModellerLogger.SetLastNodeGuid("3882a559-59a9-48f6-93b8-eb4ac860bc9a");
    _MobileGeneralActions.inputText("//android.widget.EditText[@content-desc=\"Username input field\"]","bob@example.com");
    

    TestModellerLogger.SetLastNodeGuid("eebb2a43-392d-4b9c-b13c-8458db658a1b");
    _MobileGeneralActions.inputText("//android.widget.EditText[@content-desc=\"Password input field\"]","10203040");
    

    TestModellerLogger.SetLastNodeGuid("ef38ec00-5247-4480-8f48-ca7fbc253288");
    _MobileGeneralActions.capturePageScreenshot();
    

    TestModellerLogger.SetLastNodeGuid("fc858ac5-3a6f-441d-a3cd-06ea1997b392");
    _MobileGeneralActions.clickElement("//android.view.ViewGroup[@content-desc=\"Login button\"]");
    

    }

    @Test  (groups= {"Master Shop App","Master Shop App - User Stories"})
    @TestModellerPath(guid = "d3ca947e-b8a4-438b-addf-507765941c06")
    public void AddCapabilityAddCapabilityAddCapabilityAddCapabilityConnectAppiumCapturePageScreenshotOpenMen4()
    {
        
        pages.MobileGeneralActions _MobileGeneralActions = new pages.MobileGeneralActions (getDriver());
    TestModellerLogger.SetLastNodeGuid("68e7f268-5d38-492e-a16a-b8c63b379baa");
    _MobileGeneralActions.addCapability("platformName","Android");
    

    TestModellerLogger.SetLastNodeGuid("b3c898ec-152c-440d-b7df-c3a64123d10f");
    _MobileGeneralActions.addCapability("app","https://github.com/saucelabs/my-demo-app-rn/releases/download/v1.3.0/Android-MyDemoAppRN.1.3.0.build-244.apk");
    

    TestModellerLogger.SetLastNodeGuid("1b0ea9ea-9207-433d-ac4b-42763996e981");
    _MobileGeneralActions.addCapability("appPackage","com.saucelabs.mydemoapp");
    

    TestModellerLogger.SetLastNodeGuid("d4603536-e117-4af7-8086-b7f01c1f78b2");
    _MobileGeneralActions.addCapability("appActivity","com.saucelabs.mydemoapp.rn.MainActivity");
    

    TestModellerLogger.SetLastNodeGuid("9e33c4c1-c93d-4d31-9a93-072329600aab");
    _MobileGeneralActions.connectAppium("https://jameswalker90:68887628-16c4-4132-9c61-5decf9f1e6ff@ondemand.us-west-1.saucelabs.com:443/wd/hub");
    

    TestModellerLogger.SetLastNodeGuid("a8a11e10-cfee-48d1-8fe8-370a50923a5a");
    _MobileGeneralActions.capturePageScreenshot();
    

    TestModellerLogger.SetLastNodeGuid("872bbafd-0f2f-41a0-a549-df9f14f542c3");
    _MobileGeneralActions.clickElement("//android.view.ViewGroup[@content-desc=\"open menu\"]");
    

    TestModellerLogger.SetLastNodeGuid("5e372089-5ab6-4389-ba98-2dbfe76cf4c0");
    _MobileGeneralActions.clickElement("//android.view.ViewGroup[@content-desc=\"menu item log out\"]");
    

    }

}