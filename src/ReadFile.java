
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yasitha
 */
public class ReadFile {

    public String getFile() {
        String content="";

        try {
            content = new String(Files.readAllBytes(Paths.get("D:\\panindrom.txt")));
        } catch (IOException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("File not found " + ex);
        }
        return content;
    }
    

}
