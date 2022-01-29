/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pickacard;

import java.util.Scanner;

/**
 *
 * @author sandeep kaur
 */student id:991657517
         
public class cardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++) {
            
            Card c = new Card();
            
            c.setvalue(c.randomValue());
            c.setSuit(Card.SUITS[c.randomSuit()]);
            magicHand[i] =c;
        }
        for (Card magicHand1 : magicHand) {
            System.out.println("pick a card, any card");
            System.out.println("pick the card value");
            System.out.println("1 = Hearts, 2 = Diamonds, 3 = Spades, 4 = Clubs");
            
            int UserSuit = input.nextInt();
            String UserValue = null;
            System.out.println("your card is: " + UserValue + "of" + UserSuit);
            System.out.println("let's see if my card is in ttttthe magic hand");
            
if(!(UserValue== magicHand1.getValue() && UserSuit == magicHand1())) {
//</editor-fold>
            } else {
                System.out.println("nice work");
            }
        }
    }

    
    
            
            
            
        
        
        
        // TODO code application logic here
    


