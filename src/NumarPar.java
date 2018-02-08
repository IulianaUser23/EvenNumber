import java.util.Scanner;

/**
 * Created by User on 08.02.2018.
 */
public class NumarPar {

    public void verificaNr() {

        Scanner scan = new Scanner(System.in);
        int nrInput = 0;
        nrInput = scan.nextInt();

        int par = nrInput%2;
        if (par == 0) {
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
}

