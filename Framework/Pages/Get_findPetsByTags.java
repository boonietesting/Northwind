package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jayway.jsonpath.JsonPath;

// https://riley.partner.testinsights.io/app/#!/module-collection/guid/c3b5a834-a6e7-4ac3-8725-1bb94f0250b4
@TestModellerModule(guid = "c3b5a834-a6e7-4ac3-8725-1bb94f0250b4")
public class Get_findPetsByTags extends BasePage
{
	public Get_findPetsByTags (WebDriver driver)
	{
		super(driver);
	}




	
	public void Get_findPetsByTags_400(String tags)
	{
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.contentType(ContentType.JSON);
        
        httpRequest = httpRequest.header("Content-Type", "application/json");
        
        httpRequest = httpRequest.param("tags", "" + tags + "");
        Response response = httpRequest.get("https://petstore.swagger.io/v2/pet/findByTags");
        printResponse(response);

        
        if (!(response.getStatusCode() == 400)) {
            TestModellerLogger.FailResponseStep(response, "Get_findPetsByTags_400");

            failStep("Get_findPetsByTags_400","Status code invalid - expected 400 - found " + response.getStatusCode());
        }
 		ExtentReportManager.passStep(response, "Get_findPetsByTags_400");
 		TestModellerLogger.PassResponseStep(response, "Get_findPetsByTags_400");
	}
	public void Get_findPetsByTags_200(String tags)
	{
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.contentType(ContentType.JSON);
        
        httpRequest = httpRequest.header("Content-Type", "application/json");
        
        httpRequest = httpRequest.param("tags", "" + tags + "");
        Response response = httpRequest.get("https://petstore.swagger.io/v2/pet/findByTags");
        printResponse(response);

        
        if (!(response.getStatusCode() == 200)) {
            TestModellerLogger.FailResponseStep(response, "Get_findPetsByTags_200");

            failStep("Get_findPetsByTags_200","Status code invalid - expected 200 - found " + response.getStatusCode());
        }
 		ExtentReportManager.passStep(response, "Get_findPetsByTags_200");
 		TestModellerLogger.PassResponseStep(response, "Get_findPetsByTags_200");
	}}