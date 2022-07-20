package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxt {
		
	public String leitor(File file)
	{
		char digito = 0;
		String aux1 = "";
		String aux2 = "";
		String line = "";
		String auxlinha = "";
		String linhafinal = "";
		String txt = "";
		String resultado = "";
		
		try
		{	
			FileReader fr=new FileReader(file);   //reads the file  
			BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
			StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
			while((line=br.readLine())!=null)  
			{  
				auxlinha = line + ";";
				for (int i=0;i<auxlinha.length();i++) 
				{
					if (auxlinha.charAt(i) != ';') 
					{
						digito = auxlinha.charAt(i);
						aux1 = aux1+digito;
					}
					else
					{
						aux2 = aux1;
						aux1 = "";
						Switch switchaux = new Switch();
						txt = txt + switchaux.alterar(linhafinal, aux2);
					}
				}
			sb.append(txt);      //appends line to string buffer
			sb.append("\n");     //line feed
			txt = "";
			}  
			fr.close();    //closes the stream and release the resources  
			//System.out.println(sb.toString());   //returns a string that textually represents the object
			resultado = sb.toString();
		}  
		catch(IOException e)  
		{  
			e.printStackTrace();  
		}
		return resultado;
	}
}
