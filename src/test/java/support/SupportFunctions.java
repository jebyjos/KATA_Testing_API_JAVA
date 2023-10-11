package support;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import org.testng.annotations.Test;
import io.restassured.response.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.jayway.restassured.RestAssured;
//import com.jayway.restassured.http.ContentType;
//import com.jayway.restassured.response.Response;
//import com.jayway.restassured.response.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class SupportFunctions {
    private static Response response;
    private static ObjectMapper mapper = new ObjectMapper();

    public static String createFileLocationPath(String Json){
        return "src/test/resources/" + Json + ".json";
    }

    public static ResponseBody post(String url, String json) {
        response = RestAssured.given()
                .header("content-type", MyConfig.CONTENT_TYPE)
                .body(json)
                .contentType(ContentType.JSON)
                .when()
                .post(url);

        return response.getBody();
    }
    public static ResponseBody post(String url, Object json) {
        response = RestAssured.given()
                .header("content-type", MyConfig.CONTENT_TYPE)
                .body(json)
                .contentType(ContentType.JSON)
                .when()
                .post(url);
        
        
        return response.getBody();
    }
    public static ResponseBody put(String url, String json) {
        response = RestAssured.given()
                .header("content-type", MyConfig.CONTENT_TYPE)
                .body(json)
                .contentType(ContentType.JSON)
                .when()
                .put(url);
        return response.getBody();
    }

    public static ResponseBody delete(String url) {
        response = RestAssured.given()
                .header("content-type", MyConfig.CONTENT_TYPE)
                .contentType(ContentType.JSON)
                .when()
                .delete(url);

        return response.getBody();
    }

    public static ResponseBody get(String url){
    	  	 	response = RestAssured.given()
                .when()
                .get(url);
        return response.getBody();
    }

    public static <T> T convertResponse(Class<T> classObj) throws IOException {
        JSONObject jsonObject = new JSONObject(response.asString());
        return mapper.readValue(jsonObject.toString(), classObj);
    }

    public static <T> T[] convertResponseArray(Class<T[]> classObj) throws IOException {
        JSONArray jsonArray = new JSONArray(response.asString());
        System.out.println(jsonArray);
        return mapper.readValue(jsonArray.toString(), classObj);
    }
    public static String getResponseCode(){
    	System.out.println(response.getHeader("Response" ));
        return response.getHeader("Response" );
    }
    
    public static String getStatusCode(){
            return String.valueOf(response.getStatusCode());
    }
}
