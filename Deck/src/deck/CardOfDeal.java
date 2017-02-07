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
public class CardOfDeal extends ShuffleAndDeal{
    private static ArrayList<String> listt = new ArrayList<String>();
    
    public void deal()
    {
        listt=shuffle();
    }
    
}
