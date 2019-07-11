package week6hw5t5;

import java.util.Random;

public class Week6Hw5t5 {
    public static void main(String[] args) {
        Random random = new Random();
        int totalRounds = 10;
        int bot;
        int player1;
        int botScore = 0;
        int player1Score = 0;
        
        for ( int round = 1; round <= totalRounds; round++){
            bot = random.nextInt(6) + 1;
            player1 = random.nextInt(6) + 1;
            
            if( bot > player1){
                botScore++;
                System.out.println("Bot won round this round");
            } else if(player1 > bot){
                player1Score++;
                System.out.println("You won this round");
            } else{
                System.out.println("Tie!");
            }
        }
        
        if (botScore > player1Score){
            System.out.println("Bot is the grand winner!");
        } else if(player1Score > botScore){
            System.out.println("You are the grand winner!");
        } else if (botScore == player1Score){
            System.out.println("The game was a tie!");
        }
        
    }
    
}
