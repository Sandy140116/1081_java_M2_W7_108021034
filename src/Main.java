//

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sum = 0,i=1,j=1;
        for (i=1;i<=n;i++){
            for (j=1;j<n;j++){
                sum = i*j;
                System.out.print(sum+"\t");
            }
            System.out.println(i*(j));
        }
    }
}

    }
}


