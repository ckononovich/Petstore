public class Pet {
 private int id;
 private PetCategory category;
 private String name;
 private String[] photoUrls;
 private String status;

 public PetCategory getCategory() {
  return category;
 }

 public void setCategory(PetCategory category) {
  this.category = category;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String[] getPhotoUrls() {
  return photoUrls;
 }

 public void setPhotoUrls(String[] photoUrls) {
  this.photoUrls = photoUrls;
 }

 public String getStatus() {
  return status;
 }

 public void setStatus(String status) {
  this.status = status;
 }

 public Pet(int id, PetCategory category, String name, String[] photoUrls, String status) {
  this.id = id;
  this.category = category;
  this.name = name;
  this.photoUrls = photoUrls;
  this.status = status;
 }
}