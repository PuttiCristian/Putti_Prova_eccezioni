/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_eccezioni;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author cristian
 */
public class usingInputStream {

    /**
     * @param args the command line arguments
     */
        public static void usingInputStream(){
		Scanner in = new Scanner(System.in); // lo scanner gestisce autonomamente le eccezioni
		System.out.println("Digita un intero:");
		
		String line = in.next();
	    
		try {
			int intValue = Integer.parseInt(line);
                        System.out.println("Valore: " + intValue);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("SONO IN FINALLY!!!");
			in.close();
		}
		
		System.out.println("DOPO CATCH");
		in.close();
		
	}   
        
        public static void usingBufferedReader(){
            BufferedReader inR = new BufferedReader(new InputStreamReader(System.in));
            
            try{
                int lineR = inR.read();
                System.out.println("Valore inserito con BufferedReader: " + lineR);
            } catch (IOException ex) {
                Logger.getLogger(usingInputStream.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("errore in lettura");
            }
            try {
                inR.close();
            } catch (IOException ex) {
                Logger.getLogger(usingInputStream.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("errore in scrittura");
            }
        }
        
    
}

