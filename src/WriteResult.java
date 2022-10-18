import java.io.FileWriter;
import java.io.IOException;

public class WriteResult {
    public static void writeResult(){
        try {
            Writer line = new Writer(PathFile.resultTest,true);  // Добавление к существующему текста
            line.fileWrite(Menu.actualPerson.name," Your test result ",PassingTheTest.result," correct answers from 10");
            Tests.testy();
        }
        catch (IOException b){
            System.out.println(b.getMessage());
        }
    }
}
