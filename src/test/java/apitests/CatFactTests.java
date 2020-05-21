package apitests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class CatFactTests {

    /**
     * Preform GET action to specified REST request URL
     * Validate the returned response body form specified URL is not empty
     */
    @Test(description = "TC004 - Validate returned response body is not empty")
    public void GetCatFact_checkBodyIsNotEmpty() {
        given().
                contentType("JSON").
                when().
                get("https://alexwohlbruck.github.io/cat-facts/").
                then().
                assertThat().
                statusCode(200).
                body("text", notNullValue()).
                log().body();
//        Assert.assertFalse("Text".isEmpty());
    }
}