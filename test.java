

import java.util.Scanner;




public class test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String N1,N2;
        System.out.println("Type the name of player one : X :  ");
        N1 = scn.nextLine();
        System.out.println("Type the name of player two : O :  ");
        N2 = scn.nextLine();

        game XOXO = new game(N1, N2);
        XOXO.play();

        scn.close();
    }
}
