/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishchitchat1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static jdk.nashorn.internal.parser.TokenType.EOF;

/**
 *
 * @author nemesis
 */
public class EnglishChitChat1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String location = "F:\\my paradise\\hacking\\worldlist\\mit 10000 words.txt";
        File file = new File(location);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        FileReader fis = new FileReader(file);
        char[] cache = new char[100];
        for(int i = 0; i < 100; i++)
        {
            cache[i] = '\0';
        }
        StringBuilder sb = new StringBuilder();
        String line;
        String word = "";
        while( (word= br.readLine()) != null)
        {

            if(
                    (word.startsWith("b") || 
                    word.startsWith("B"))                
                &&(word.endsWith("d") ||
               word.endsWith("D"))
            )
            {
                sb.append(word+"\n");
            }
        }
        System.out.println(sb.toString());
    }
    
}
