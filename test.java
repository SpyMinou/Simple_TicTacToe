package test;

import java.util.Scanner;

import Game.game;


public class test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String N1,N2;
        System.out.println("Donner le nom du joueur qui jouera avec le X :  ");
        N1 = scn.nextLine();
        System.out.println("Donner le nom du joueur qui jouera avec le O :  ");
        N2 = scn.nextLine();

        game XOXO = new game(N1, N2);
        XOXO.play();

        scn.close();
    }
}
