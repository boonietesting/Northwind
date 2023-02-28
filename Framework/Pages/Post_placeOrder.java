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

// https://riley.partner.testinsights.io/app/#!/module-collection/guid/c05e270d-a497-4715-a125-89c783fce002
@TestModellerModule(guid = "c05e270d-a497-4715-a125-89c783fce002")
public class Post_placeOrder extends BasePage
{
	public Post_placeOrder (WebDriver driver)
	{
		super(driver);
	}




	
	public void Post_placeOrder_400(Integer petId,Integer quantity,String shipDate,String status,Boolean complete)
	{
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.contentType(ContentType.JSON);
        
        httpRequest = httpRequest.header("Content-Type", "application/json");
        
        
        httpRequest.body(" {" + 
        "  \"id\": 0 , " + 
        "  \"petId\": petId , " + 
        "  \"quantity\": quantity , " + 
        "  \"shipDate\": \"" + shipDate + "\" , " + 
        "  \"status\": \"" + status + "\" , " + 
        "  \"complete\": complete " + 
        " }");
        Response response = httpRequest.post("https://petstore.swagger.io/v2/store/order");
        
        if (!(response.getStatusCode() == 400)) {
            TestModellerLogger.FailResponseStep(response, "Post_placeOrder_400");

            failStep("Post_placeOrder_400","Status code invalid - expected 400 - found " + response.getStatusCode());
        }
 		ExtentReportManager.passStep(response, "Post_placeOrder_400");
 		TestModellerLogger.PassResponseStep(response, "Post_placeOrder_400");
	}
	public void Post_placeOrder_200(Integer petId,Integer quantity,String shipDate,String status,Boolean complete)
	{
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.contentType(ContentType.JSON);
        
        httpRequest = httpRequest.header("Content-Type", "application/json");
        
        
        httpRequest.body(" {" + 
        "  \"id\": 0 , " + 
        "  \"petId\": petId , " + 
        "  \"quantity\": quantity , " + 
        "  \"shipDate\": \"" + shipDate + "\" , " + 
        "  \"status\": \"" + status + "\" , " + 
        "  \"complete\": complete " + 
        " }");
        Response response = httpRequest.post("https://petstore.swagger.io/v2/store/order");
        
        if (!(response.getStatusCode() == 200)) {
            TestModellerLogger.FailResponseStep(response, "Post_placeOrder_200");

            failStep("Post_placeOrder_200","Status code invalid - expected 200 - found " + response.getStatusCode());
        }
 		ExtentReportManager.passStep(response, "Post_placeOrder_200");
 		TestModellerLogger.PassResponseStep(response, "Post_placeOrder_200");
	}}