package workshop;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SecondTest {

    @Test
    public void statusCodeVerification_InvalidStatusCode() {
        given()
                .param("units", "imperial")
                .param("origins", "Washington,DC")
                .param("destinations", "New+York+City,NY")
                .param("key", "AIzaSyAFNxOzcDNEZ9coJzPc_9N-CA8Euun2fDA")
                .when()
                .get("/distancematrix/json")
                .then()
                .statusCode(201);
    }
}
