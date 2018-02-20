/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

import java.util.ArrayList;

/**
 *
 * @author Thilina Prasad
 */
public class Encrypt {

    public ArrayList<String> encrypt(String key, ArrayList<String> text) {
        int keyOrd = 0;
        ArrayList<String> crypted = new ArrayList<String>();

        for (int i = 0; i < key.length(); i++) {
            keyOrd += key.charAt(i);
        }
        for (int j = 0; j < text.size(); j++) {
            String xored = "";
            String selected = text.get(j);
            for (int i = 0; i < selected.length(); i++) {
                //Random generator = new Random(); 
                //int rand = generator.nextInt(50) + 1;
                int temp = (keyOrd ^ ((int) selected.charAt(i))) + keyOrd;
                //random.add(rand);
                xored += (Character.toString((char) temp));
            }
            crypted.add(xored);
        }
        //System.out.println(random.toString());
        //System.out.println(xored.toString());
        /*for(int i=0;i<textOrd.size();i++){
            System.out.println((keyOrd^textOrd.get(i)));
            System.out.println((char)(keyOrd^textOrd.get(i)));
        }*/

        //System.out.println(keyOrd.toString());
        //System.out.println(textOrd.toString());
        return crypted;
    }
}
