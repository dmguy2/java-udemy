public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName (){
        return firstName;
    }
    public String getLastName (){
        return lastName;
    }
    public int getAge (){
        return age;
    }
    public void setFirstName (String newFirstName){
        firstName = newFirstName;
    }
    public void setLastName (String newLastName){
        lastName = newLastName;
    }
    public void setAge (int newAge) {
        age = newAge;
    }
    public boolean isTeen (){
        return age > 12 && age < 20;
    }
    public String getFullName (){
        if (firstName.isEmpty()){
            return lastName;
        }
        if (lastName.isEmpty()){
            return firstName;
        }
        else {
            return firstName + " " + lastName;
        }
    }

}
