package logic;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {

private BufferedReader r = null;
protected ArrayList<Integer> a = new ArrayList<Integer>();
private String nameFile= "Game1.txt";

public ArrayList<Integer> read() throws IOException{

try
{
    r = new BufferedReader(new java.io.FileReader(nameFile)); 
    String N;
    while ((N = r.readLine()) != null)
        a.add(Integer.parseInt(N)); //Poner puros numeros
}

finally
{
    if (r != null)
        r.close(); 
}
return a; 
}


}



