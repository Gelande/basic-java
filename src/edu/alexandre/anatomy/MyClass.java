package edu.alexandre.anatomy;

public class MyClass {

    public static void main(String[] args) {
        String firstName = "Alexandre";
        String lastName = "Souza";

        String fullName = fullName(firstName, lastName);
        System.out.print(fullName);
    }

    public  static String fullName(String name1, String name2) {
        return name1.concat(" ").concat(name2);
    }
}
