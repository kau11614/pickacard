/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pickacard;

/**
 *
 * @author sandeep kaur
 */student id: 991657517
public class Card {
    private String suit;
    private int value;
    
    public static final String []SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit 
     */
    public String getSuit() {
        return suit;
        
    }

   public void setSuit(String suit) {
       this.suit = suit;
   }
   
   public int getValue() {
       return value;
       
   }
   
   public void setValue(int value) {
       this.value = value;
      
   }
   
   public int randomSuit() {
       int value = (int)(Math.random()*4)+0;
       return value;
   }
   public int randomValue()
   {
       int value = (int)(Math.random()*13)+1;
       return value;
   }

    }
   
        


