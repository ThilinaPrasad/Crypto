/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Thilina Prasad

*/



public class Shuffle {
    
        public  static String shuffle(String text) {
        int size = text.length();
        ArrayList<Character> oddChars = new ArrayList<>();
        ArrayList<Character> evenChars = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 1) {
                oddChars.add(text.charAt(i));
            } else {
                evenChars.add(text.charAt(i));
            }
        }
        Collections.reverse(oddChars);
        String shuffled = "";
        for (int j = 0; j < evenChars.size(); j++) {
            if(j ==evenChars.size()-1 && oddChars.size()+1 == evenChars.size()){
                System.out.println(j);
                shuffled+=Character.toString(evenChars.get(j));
                break;
            }else{
            shuffled += Character.toString(evenChars.get(j)) + Character.toString(oddChars.get(j));
            }
        }
        //System.out.println(oddChars.toString());
        //System.out.println(evenChars.toString());
        //System.out.println(shuffled);
        return shuffled;
    }
}
