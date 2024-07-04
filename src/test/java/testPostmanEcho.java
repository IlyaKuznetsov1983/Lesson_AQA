import org.junit.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class testPostmanEcho {
    @Test
    public void testGetRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .log().all()
                .assertThat()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void testPostRawText() {
        Response response = given()
                .log().all()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body("value")
                .when()
                .post("/post")
                .then()
                .log().all()
                .statusCode(200)
                .body("data", equalTo("value"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.postman-token", nullValue())
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("headers.cookie", nullValue())
                .extract().response();
    }
}
