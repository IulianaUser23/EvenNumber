// Write a Java program to determine whether an input number is an even number

public class Main {

    public static void main(String[] args) {

        System.out.println("Introduceti un numar: ");
        NumarPar numarul = new NumarPar();
        try {
            numarul.verificaNr();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error. This is not a number. Retry");
        }

    }
}


