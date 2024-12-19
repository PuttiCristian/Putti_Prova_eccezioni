/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class Prova_eccezioni {

    /**
     * @param args the command line arguments
     */

        public static void main(String[] args) {
            usingInputStream instance = new usingInputStream();

            System.out.println("Esecuzione usingInputStream():");
            instance.usingInputStream();

            System.out.println("\nEsecuzione usingBufferedReader():");
            instance.usingInputStream();
        }
}
