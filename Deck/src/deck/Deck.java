/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Deck {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> hands = new ArrayList<String>();
        BufferedReader inFromUser=new BufferedReader(new InputStreamReader(System.in));
        ShuffleAndDeal shuffleAndDeal=new ShuffleAndDeal();
        int n;
        
        list=shuffleAndDeal.shuffle();
        
        // Display the all the shuffle cards
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        do
        {
            //taking number of players from user
            System.out.print("Enter number of player ");
            n=Integer.parseInt(inFromUser.readLine());
            hands=shuffleAndDeal.deal(n);
        }while(hands.isEmpty());// checking if no of the hands is out of the bound 
        
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n","Player1","Player2","Player3","Player4","Player5");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n","-------","-------","-------","-------","-------");
        for(int i=0;i<5;i++)
        {
            switch(n)
            {
                case 2:
                System.out.printf("%-20s %-20s %-20s %-20s %-20s \n",hands.get(i+0),hands.get(i+1),"---","---","---");
                break;
                
                case 3:
                System.out.printf("%-20s %-20s %-20s %-20s %-20s \n",hands.get(i+0),hands.get(i+1),hands.get(i+2),"---","---");
                break;
                
                case 4:
                System.out.printf("%-20s %-20s %-20s %-20s %-20s \n",hands.get(i+0),hands.get(i+1),hands.get(i+2),hands.get(i+3),"---");
                break;
                
                case 5:
                System.out.printf("%-20s %-20s %-20s %-20s %-20s \n",hands.get(i+0),hands.get(i+1),hands.get(i+2),hands.get(i+3),hands.get(i+4));
                break;
                    
            }
            
        }
    }
}


