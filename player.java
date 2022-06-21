
// importations : 
import java.util.Scanner;
import field.field;

public class player {
    private String name;    // nom du joueur 
    private int score ;     // score de joueur  initialise a 0 au debut de jeu

        // le constructeurs et accesseurs  :
    public player(String N) {
        name = N;
        score = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    
        // le joueur selectionne quel case a jouer : 
    public void move(int x,field XO){
        System.out.println(this.getName()+" : Quelle est la case a joue : ");
        Scanner scn = new Scanner(System.in);
        String S;
        S = scn.next();
        if(x%2==0){             // on donne le X a joueur avec le our pair 
            while(!XO.exist(S)){
                
                if(XO.exist(S)){
                    break;
                }else{
                    System.out.println("Case deja pris ou introuvable ... veuillez ressayer : ");
                    S = scn.next();
                }
            }
            XO.Change("X", S);
            
        }else{                    // on donne le X a joueur avec le our pair
            while(!XO.exist(S)){
                  
                if(XO.exist(S)){
                    break;
                }else{
                    System.out.println("Case deja pris ou introuvable ... veuillez ressayer : ");
                    S = scn.next();
                }
            }
            XO.Change("O", S);
        }
    }

    public void scoreUP(){
        setScore(getScore()+1);
    }

    public void afficherPlayer(){
        System.out.println(this.getName()+ " : " +this.getScore());
        }
}
