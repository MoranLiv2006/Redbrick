package Utilities;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiActions extends Base {

    private Response getRequestForAJoke() {
        response = given()
                .get(CHUCK_NORRIS_API_URL + "/jokes/random")
                .then()
                .statusCode(200)
                .extract()
                .response();
        return response;
    }

    public String getChuckNorrisJoke() {
        response = getRequestForAJoke();
        jsonPath = response.jsonPath();
        jsonPath.prettyPrint();
        return jsonPath.getString("value");
    }
}
