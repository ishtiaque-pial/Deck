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

/**
 *
 * @author Pial
 */


public class Deck {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> hands = new ArrayList<String>();
        BufferedReader inFromUser=new BufferedReader(new InputStreamReader(System.in));
        ShuffleAndDeal shuffleAndDeal=new ShuffleAndDeal();
        
        list=shuffleAndDeal.shuffle();
        
        for(int i=0;i<list.size();i++)
        {
            System.out.println(""+list.get(i));
        }
        do
        {
        System.out.print("Enter number of player");
        int n=Integer.parseInt(inFromUser.readLine());
            
        hands=shuffleAndDeal.deal(n);
            
        }while(hands.isEmpty());
        
        for(int i=0;i<hands.size();i++)
        {
            System.out.println(hands.get(i));
        }
        
    }
    
}

