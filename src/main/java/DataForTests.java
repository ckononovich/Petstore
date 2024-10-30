public class DataForTests {
    private final int petId = 2;
    private final int categoryId =3;
    private final String categoryName = "testCategory";
    private final String petName = "Lucky";
    private final String[] photoUrl = new String[]{"testUrl.jpeg"};
    private final String status = "available";
    private final String changeStatus = "sold";

    protected PetCategory newCategory = new PetCategory(categoryId, categoryName);
    protected Pet newPet = new Pet (petId, newCategory, petName, photoUrl,status);
    protected Pet UpdatePet = new Pet (petId, newCategory, petName, photoUrl,changeStatus);
}