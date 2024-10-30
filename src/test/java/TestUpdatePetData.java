import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.Response;
import org.junit.After;
import org.junit.Test;

public class TestUpdatePetData {
    Steps steps = new Steps();


    @Test
    @DisplayName("Update data of pet")
    @Description("Updating status of the pet to sold")
    public void testUpdatePetStatus() {
        Response createPet = steps.createNewPet();
        Response updatePet = steps.updatePet();
        steps.printResponseBodyToConsole(updatePet);
        steps.checkStatus(updatePet, 200, "sold");
    }

    @After
    public void deletePet() {
        Response deletePet = steps.deletePet("2");
    }
}