package dev.clara.my_first_java_class;

public class Person {

    String firstName;
    String lastName;
    String idNumber;
    int birthYear;
    String birthCountry;
    char gender;

    
public void printDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Birth Year: " + birthYear);  
        System.out.println("Birth Country: " + birthCountry);
        System.out.println("Gender: " + gender);
    }


public Person(String firstName, String lastName, String idNumber, int birthYear, String birthCountry, char gender) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = idNumber;
    this.birthYear = birthYear;
    this.birthCountry = birthCountry;
    this.gender = gender;
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


public int getBirthYear() {
    return birthYear;
}


public String getBirthCountry() {
    return birthCountry;
}


public char getGender() {
    return gender;
}
}

