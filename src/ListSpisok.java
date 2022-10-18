import java.io.*;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ListSpisok {
    private String path_to_file;

    public ListSpisok(String path) {
        this.path_to_file = path;
    }

    public String[] OpenAndReader() throws IOException{
        Reader x = new InputStreamReader(new FileInputStream(path_to_file), StandardCharsets.UTF_8);
        BufferedReader varRead = new BufferedReader(x);
        int num = numString();
        String [] lines = new String[num];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = varRead.readLine();
        }
        varRead.close();
        return lines;
    }
    int numString() throws IOException{
        Reader text = new InputStreamReader(new FileInputStream(path_to_file), StandardCharsets.UTF_8);
        BufferedReader y = new BufferedReader(text);
        String one;
        int num = 0;
        while ((one = y.readLine()) != null){
            num++;
        }
        y.close();
        return num;
    }
}
