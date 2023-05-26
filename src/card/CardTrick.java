/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Modifier - Parminder Singh
 * Student ID - 991699873
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*(14-1)+1));
             c.setSuit(Card.SUITS[(int)(Math.random()*Card.SUITS.length)]);
             magicHand [i] = c;
          
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
      
         
         Card luckyCard = new Card();
         luckyCard.setValue(11);
         luckyCard.setSuit("Spades");
         
         int chance = 0 ;
         
         for( int i=0; i<magicHand.length; i++){
             
             if(magicHand[i].equals(luckyCard)){
                 chance = 1;
             }
         }
         
        if (chance != 0){
           System.out.println("You win");
        }else{
           System.out.println("You lose");
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
