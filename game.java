package Game;


import java.util.Scanner;

import field.field;
import player.player;

public class game {
   private player P1,P2;
   private field TAB;
    public game(String p1,String p2) {
        P1 = new player(p1);
        P2 = new player(p2);
        TAB = new field();
    }

    public boolean win(){
        return TAB.matchLine1() || TAB.matchLine2() || TAB.matchLine3() || TAB.matchColumn1() || TAB.matchColumn2() || TAB.matchColumn3()||TAB.matchaxe1()||TAB.matchaxe2();    
    }
    public void play1(){
        TAB = new field();
        int i = 0;
        TAB.afficherGrid();
        while(i<9) {
            P1.move(i, TAB);
            i++;
            if(this.win() || i == 9){
                TAB.afficherGrid();
                break;
            }
            TAB.afficherGrid();
            P2.move(i, TAB);
            i++;
            if(this.win() || i == 9){
                TAB.afficherGrid();
                break;
            }
            TAB.afficherGrid();
        }
        
        if(i==9){System.out.println("TIE");}
        else{
            if(i%2==0){
                System.out.println("Winner is : " + P2.getName());
                P2.scoreUP();
            }else{
                System.out.println("Winner is : " + P1.getName());
                P1.scoreUP();
            }
        }
    }
    public void play2  (){
        TAB = new field();
        int i = 0;
        TAB.afficherGrid();
        while(i<9) {
            P2.move(i+1, TAB);
            i++;
            if(this.win() || i == 9){
                TAB.afficherGrid();
                break;
            }
            TAB.afficherGrid();
            P1.move(i+1, TAB);
            i++;
            if(this.win() || i == 9){
                TAB.afficherGrid();
                break;
            }
            TAB.afficherGrid();
        }
        
        if(i==9){System.out.println("TIE");}
        else{
            
            if(i%2==0){
                System.out.println("Winner is : " + P1.getName());
                P1.scoreUP();
            }else{
                System.out.println("Winner is : " + P2.getName());
                P2.scoreUP();
            }
        }
    
    }

    public void play(){
        Scanner scn = new Scanner(System.in);
        String S;
        play1();
        P1.afficherPlayer();
        P2.afficherPlayer();
        System.out.println("Voulez vous jouer encore une fois : 'oui' 'non' ");
        S = scn.next();
        if(S.toLowerCase().equals("oui")){
            while(S.toLowerCase().equals("oui")){
                play2();
                P1.afficherPlayer();
                P2.afficherPlayer();
                System.out.println("Voulez vous jouer encore une fois : 'oui' 'non' ");
                S = scn.next();
                if(S.toLowerCase().equals("oui")){    
                    play1();
                    P1.afficherPlayer();
                    P2.afficherPlayer();
                    System.out.println("Voulez vous jouer encore une fois : 'oui' 'non' ");
                }else{break;}
            }
        }
        scn.close();
    }
   
}

