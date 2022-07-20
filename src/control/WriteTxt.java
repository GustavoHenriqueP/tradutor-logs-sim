package control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteTxt {

    public void gravador(String nome, String logs) 
    {
        try
        {
            // Create new file
            File file = new File(System.getProperty("user.home") + System.getProperty("file.separator")+ "Desktop" + "\\"
            + "A_" + nome);
            // If file doesn't exists, then create it
            if (!file.exists()) 
            {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
            bw.write(logs);

            // Close connection
            bw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}