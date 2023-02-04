import java.io.BufferedReader;
import java.io.FileReader;

public class program13 {
    public static void main(String[] args) {
        FileReader fr=new FileReader("/Users/dell/Desktop/rhyme.txt");
        BufferedReader br=new BufferedReader(fr);

        String line;
                       //Priya Singh 12012395//
        while((line=br.readLine()!=null)) {
            System.out.println(line);
        }
    }
}
