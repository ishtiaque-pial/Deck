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
        switch(n)
        {
            case 2://no of hands 2
                for(int i=0;i<n*5;i++)//used 10 cards out of 52 cards
                {
                    int playerNo=(i%2)+1;// get player no
                    hands.add("Player"+playerNo+" gets "+list.get(i));
                }
                break;
                
            case 3://no of hands 3
                for(int i=0;i<n*5;i++)//used 15 cards out of 52 cards
                {
                    int playerNo=(i%3)+1;
                    hands.add("Player"+playerNo+" gets "+list.get(i));
                }
                break;
            case 4://no of hands 4
                for(int i=0;i<n*5;i++)//used 20 cards out of 52 cards
                {
                    int playerNo=(i%4)+1;
                    hands.add("Player"+playerNo+" gets "+list.get(i));
                }
                break;
            case 5://no of hands 5
               for(int i=0;i<n*5;i++)////used 25 cards out of 52 cards
                {
                    int playerNo=(i%5)+1;
                    hands.add("Player"+playerNo+" gets "+list.get(i));
                }
                break;
                
            default:
                //for other no of hands,it will set arrylist hands empty
                break;
        }
        
        return hands;
    }
}
