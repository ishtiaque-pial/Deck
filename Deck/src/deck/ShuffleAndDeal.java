/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deck;

import java.util.ArrayList;

/**
 *
 * @author Pial
 */
public class ShuffleAndDeal {
    private static int[] deck = new int[52];
    private static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private static ArrayList<String> list = new ArrayList<String>();
    private static ArrayList<String> hands = new ArrayList<String>();
    public ArrayList<String> shuffle(){
    
        // Initialize cards
        for (int i = 0; i < deck.length; i++) 
        {
            deck[i] = i;
        }
        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) 
        {
            int index =(int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        //get all shuffle cards
        for (int i = 0; i < 52; i++) 
        {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            list.add(rank + " of " + suit);
            
        }
        return list;
    }
    //deal method with no of hands argument
    public ArrayList<String> deal(int n)
    {
        if(n>=2&&n<=5)
        {
            for(int i=0;i<n*5;i++)
            {
                hands.add(list.get(i));
            }
            return hands;
        }
        else
        {
            return hands;
        }
        
        
    }
}
