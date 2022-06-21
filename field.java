package field;


public class field {
    private String Grid1,Grid2,Grid3,Grid4,Grid5,Grid6,Grid7,Grid8,Grid9;
    //getters and setters and constructeur 


    public field() {
        Grid1 = "1";
        Grid2 = "2";
        Grid3 = "3";
        Grid4 = "4";
        Grid5 = "5";
        Grid6 = "6";
        Grid7 = "7";
        Grid8 = "8";
        Grid9 = "9";
    }
    
    public String getGrid1() {
        return Grid1;
    }
    public void setGrid1(String grid1) {
        Grid1 = grid1;
    }
    public String getGrid2() {
        return Grid2;
    }
    public void setGrid2(String grid2) {
        Grid2 = grid2;
    }
    public String getGrid3() {
        return Grid3;
    }
    public void setGrid3(String grid3) {
        Grid3 = grid3;
    }
    public String getGrid4() {
        return Grid4;
    }
    public void setGrid4(String grid4) {
        Grid4 = grid4;
    }
    public String getGrid5() {
        return Grid5;
    }
    public void setGrid5(String grid5) {
        Grid5 = grid5;
    }
    public String getGrid6() {
        return Grid6;
    }
    public void setGrid6(String grid6) {
        Grid6 = grid6;
    }
    public String getGrid7() {
        return Grid7;
    }
    public void setGrid7(String grid7) {
        Grid7 = grid7;
    }
    public String getGrid8() {
        return Grid8;
    }
    public void setGrid8(String grid8) {
        Grid8 = grid8;
    }
    public String getGrid9() {
        return Grid9;
    }
    public void setGrid9(String grid9) {
        Grid9 = grid9;
    }

    public void afficherGrid(){
        System.out.println("\n\n");
        System.out.print("          ");
        System.out.println("  "+this.getGrid1() + "   |   "+this.getGrid2() + "   |   "+this.getGrid3());
        System.out.print("          ");
        System.out.println("---------------------");
        System.out.print("          ");
        System.out.println("  "+this.getGrid4() + "   |   "+this.getGrid5() + "   |   "+this.getGrid6());
        System.out.print("          ");
        System.out.println("---------------------");
        System.out.print("          ");
        System.out.println("  "+this.getGrid7() + "   |   "+this.getGrid8() + "   |   "+this.getGrid9());
        
        System.out.println("\n\n");

    }

    public void Change(String X,String G){
            if(this.getGrid1().equals(G)){this.setGrid1(X);}
        else if(this.getGrid2().equals(G)){this.setGrid2(X);}
        else if(this.getGrid3().equals(G)){this.setGrid3(X);}
        else if(this.getGrid4().equals(G)){this.setGrid4(X);}
        else if(this.getGrid5().equals(G)){this.setGrid5(X);}
        else if(this.getGrid6().equals(G)){this.setGrid6(X);}
        else if(this.getGrid7().equals(G)){this.setGrid7(X);}
        else if(this.getGrid8().equals(G)){this.setGrid8(X);}
        else if(this.getGrid9().equals(G)){this.setGrid9(X);}
    }
    
    public boolean exist(String G){
            if(this.getGrid1().equals(G)){ return true;
        }else if(this.getGrid2().equals(G)){ return true;
        }else if(this.getGrid3().equals(G)){ return true;
        }else if(this.getGrid4().equals(G)){ return true;
        }else if(this.getGrid5().equals(G)){ return true;
        }else if(this.getGrid6().equals(G)){ return true;
        }else if(this.getGrid7().equals(G)){ return true;
        }else if(this.getGrid8().equals(G)){ return true;
        }else if(this.getGrid9().equals(G)){ return true;
        }else { return false;}
    }

    public boolean matchLine1(){
        return (this.getGrid1().equals(this.getGrid2()) && this.getGrid1().equals(this.getGrid3()));
    }
    public boolean matchLine2(){
        return (this.getGrid4().equals(this.getGrid5()) && this.getGrid4().equals(this.getGrid6()));
    }
    public boolean matchLine3(){
        return (this.getGrid7().equals(this.getGrid8()) && this.getGrid7().equals(this.getGrid9()));
    }
    public boolean matchColumn1(){
        return (this.getGrid1().equals(this.getGrid4()) && this.getGrid1().equals(this.getGrid7()));
    }
    public boolean matchColumn2(){
        return (this.getGrid2().equals(this.getGrid5()) && this.getGrid2().equals(this.getGrid8()));
    }
    public boolean matchColumn3(){
        return (this.getGrid3().equals(this.getGrid6()) && this.getGrid3().equals(this.getGrid9()));
    }
    public boolean matchaxe1(){
        return (this.getGrid1().equals(this.getGrid5()) && this.getGrid1().equals(this.getGrid9()));
    }
    public boolean matchaxe2(){
        return (this.getGrid3().equals(this.getGrid5()) && this.getGrid3().equals(this.getGrid7()));
    }
}