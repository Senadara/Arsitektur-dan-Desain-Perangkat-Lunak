package model;

public class Person {
   private String firstName;
   private String lastName;
   private String idNumber;

   public Person(String firstName, String lastName, String idNumber) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.idNumber = idNumber;
   }

   public String getFirstName() {
      return firstName;
   }
   public String getLastName() {
      return lastName;
   }

   public String getIdNumber() {
      return idNumber;
   }
   
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   public void setIdNumber(String idNumber) {
      this.idNumber = idNumber;
   }

}
