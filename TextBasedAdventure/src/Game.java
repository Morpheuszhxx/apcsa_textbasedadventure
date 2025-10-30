import java.util.Scanner;

public class Game {
    public static void main(String[] args){  
        
        System.out.println("Welcome to Adventure game");     


        Scanner s = new Scanner(System.in);
        status f = new status();
        int i = f.getStatus();
        while (i == 0){
            for (int j = 0; j <= 20; j++){
                System.out.println("");
                
            }        
        
            System.out.println("Choose a weapon. 1 For Sword, 2 For Greatsword, 3 For Bow, 4 For Staff, 5 For Dual sword.");
            int weapon1 = s.nextInt();
            
            
        }
    
    }
    // Made by Alexander 
public void rollDice() {
        boolean diceSuccess=true;
        int diceNum=(int) (Math.random()*20)+1;
        int goodNum=(int) (Math.random()*20)+1;
        System.out.println("You need at least a " + goodNum + " to succeed.");
        if (diceNum>=goodNum) {
            System.out.println("Sucess! You rolled a " + diceNum+".");
        }
        else {
            System.out.println("Failure! You rolled a "+diceNum+".");
            diceSuccess=false;
        }
}

public int weapon() {
//  Scanner s = new Scanner(System.in);
//  if (weapon1 == 0)
        
    return -1;
}


}





