//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = n/2;
        boolean flog = true;

        for (int i=2;i<m;i++){
            if (n%i == 0){
                flog = false;
                break;
            }
        }
        if (flog){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}


