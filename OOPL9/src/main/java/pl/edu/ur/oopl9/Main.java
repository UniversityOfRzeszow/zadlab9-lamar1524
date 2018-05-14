/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author LamaR
 */
import java.util.HashMap;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        HashMap<String, String> slowa = new HashMap<>();
        Scanner skaner = new Scanner(System.in);
        slowa.put("dom", "house");
        slowa.put("mleko", "milk");
        slowa.put("kamien", "rock");
        slowa.put("krzak", "bush");
        slowa.put("szklanka", "glass");
        slowa.put("puszka", "can");
        slowa.put("zespol", "band");
        slowa.put("komputer", "computer");
        slowa.put("telewizor", "television");
        slowa.put("swieczka", "candle");
        slowa.put("dywan", "carpet");
        slowa.put("piwo", "beer");
        slowa.put("impreza", "party");
        slowa.put("koncert", "gig");
        slowa.put("telefon", "telephone");
        slowa.put("woda", "water");
        slowa.put("rzecz", "thing");
        slowa.put("eutanazja", "euthanasia");
        slowa.put("bol", "pain");
        slowa.put("szczescie", "happiness");
         System.out.println("Podaj slowo ktore chcesz przetlumaczyc z ");
        while (true) {
            String x = skaner.next();
            if ("koniec!".equals(x)) {
                break;
            } else {
                System.out.println("W jezyku angielskim brzmi :"+slowa.get(x));
            }

        }

    }

    
}
