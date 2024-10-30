import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Steps {
    DataForTests dataForTests = new DataForTests();
    Path path = new Path();

    @Step("Create a new pet")
    public Response createNewPet() {
        Response response = given().spec(BaseHttpClient.baseRequestSpec()).and().body(dataForTests.newPet).when().post(path.getBasePathPet());
        return response;
    }

    @Step("Update status for the pet")
    public Response updatePet() {
        Response response = given().spec(BaseHttpClient.baseRequestSpec()).and().body(dataForTests.UpdatePet).when().put(path.getBasePathPet());
        return response;
    }

    @Step("Delete created pet")
    public Response deletePet(String id) {
        Response deletePet = given().spec(BaseHttpClient.baseRequestSpec()).when().delete(path.getBasePathPet() + "/" + id);
        return deletePet;
    }

    @Step("Check status of the pet")
    public void checkStatus(Response response, int code, String status) {
        response.then().statusCode(code).and().assertThat().body("status", equalTo(status));
    }

    public void printResponseBodyToConsole(Response response) {
        System.out.println(response.body().asString());
    }
}