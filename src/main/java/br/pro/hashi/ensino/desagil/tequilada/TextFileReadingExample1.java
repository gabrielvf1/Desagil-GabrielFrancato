package br.pro.hashi.ensino.desagil.tequilada;
 
import java.io.FileReader;
import java.io.IOException;
 
/**
 * This program demonstrates how to read characters from a text file.
 * @author www.codejava.net
 *
 */
public class TextFileReadingExample1 {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("oi.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                if ((char) character == '#'){
                	System.out.print("X");
                }
                if ((char) character != '#') {
                	System.out.print((char) character);
                }
                
                	
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}