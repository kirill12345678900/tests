import java.io.FileWriter;
import java.io.IOException;

public class PassingTheTest {
static int result;
    static int count;
    public static void passing() {

        try {

            String[] massivVopros = Tests.vopros.OpenAndReader();
            String[] massivOtvet = Tests.otvet.OpenAndReader();
            for (int i = 0; i < massivVopros.length; i++) {
                System.out.println(massivVopros[i]);
                if (i % 5 == 0 && i!= 0) {
                    System.out.println("Выберите вариант ответа!");
                    count = Start.in.nextInt();
                    for (int j = 0; j < massivOtvet.length; j++) {
                        if (count == 1 && massivVopros[i-3].equals(massivOtvet[j])) {
                            System.out.println("Правильный ответ: " + massivOtvet[j] +"\n");
                            result++;
                            count =0;
                            break;
                        } else if (count == 2 && massivVopros[i-2].equals(massivOtvet[j])) {
                            System.out.println("Правильный ответ: " + massivOtvet[j]+"\n");
                            result++;
                            count =0;
                            break;
                        } else if (count == 3 && massivVopros[i-1].equals(massivOtvet[j])) {
                            System.out.println("Правильный ответ: " + massivOtvet[j]+"\n");
                            result++;
                            count =0;
                            break;
                        } else if(massivVopros[i-3].equals(massivOtvet[j])||massivVopros[i-2].equals(massivOtvet[j])|| massivVopros[i-1].equals(massivOtvet[j])){
                            System.out.println("Правильный ответ: " + massivOtvet[j]+"\n");
                            count =0;
                            break;
                        } else {
                            continue;
                        }
                    }

                }
            }
            System.out.println("Your test result " + result + " correct answers from 10\n");
            WriteResult.writeResult();
        } catch (IOException a) {
            System.out.println(a.getMessage());
        }
    }
}