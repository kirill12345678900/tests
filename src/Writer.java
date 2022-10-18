import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {
    private String path_to_file;
    private boolean append = true;//указатель разрешения на запись
    public Writer(String path, boolean value) { // добавит данные к имеющимся
        this.path_to_file = path;
        this.append = value;
    }
    public void fileWrite(String login, String nach, int text, String con) throws IOException{  //получает текст который хотим записать
        FileWriter write_to_file = new FileWriter(path_to_file,append);  //получает путь, имя, и разрешение на запись
        PrintWriter print = new PrintWriter(write_to_file);
        print.printf("%s",login);
        print.printf("%s",nach);//команда записи с использованием метода форматирования
        print.printf("%s",text);//команда записи с использованием метода форматирования
        print.printf("%s"+ "%n",con);//команда записи с использованием метода форматирования
        print.close();               //закрывает файл и чистит буфер
    }
}
