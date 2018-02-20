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
public class Decrypt {

    public ArrayList<String> decrypt(String key, ArrayList<String> text) {
        int keyOrd = 0;
        ArrayList<String> decrypted = new ArrayList<>();
        for (int i = 0; i < key.length(); i++) {
            keyOrd += key.charAt(i);
        }
        for (int j = 0; j < text.size(); j++) {
            String xored = "";
            String selected = text.get(j);
            for (int i = 0; i < selected.length(); i++) {
                int charOrd = (int) selected.charAt(i);
                charOrd -= keyOrd;
                int deXored = charOrd ^ keyOrd;
                xored += Character.toString((char) deXored);
            }
            decrypted.add(xored);
        }
        return decrypted;
    }
}
