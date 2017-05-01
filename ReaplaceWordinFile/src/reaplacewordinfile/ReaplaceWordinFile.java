/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reaplacewordinfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mac
 */
public class ReaplaceWordinFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                try
             {
             File file = new File("file.txt");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line = "", oldtext = "";
             while((line = reader.readLine()) != null)
                 {
                 oldtext += line + "\r\n";
             }
             reader.close();
             // replace a word in a file
             String newtext = oldtext.replaceAll("yahooo.com", "yahoo.com").replaceAll("gmial.com", "gmail.com")
                     .replaceAll("hotmal.com", "hotmail.com").replaceAll("gmil.com","gmail.com").replaceAll("yahool.com.com", "yahoo.com")
                     .replaceAll("ymaik.cmo", "ymail.com");
            
             //To replace a line in a file
             //String newtext = oldtext.replaceAll("This is test string 20000", "blah blah blah");
             
             //added this new
             
            
             FileWriter writer = new FileWriter("file.txt");
             writer.write(newtext);writer.close();
         }
         catch (IOException ioe)
             {
             ioe.printStackTrace();
         }
     }
}
        
    
    

