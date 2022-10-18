import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    static Person actualPerson;
    static ListSpisok result;


    static void zapusk() {
        System.out.println("Введите 1, чтобы создать аккаунт!");
        System.out.println("Введите 2, чтобы войти в аккаунт!");
        System.out.println("Введите 3, что бы выбрать тест!");
        System.out.println("Введите 4, что бы посмотреть результат!");
        System.out.println("Введите 5, что бы выйти!");
        switch (vyborPotsithion()) {
            case 1:
                WorkAccount.entyAccounts(createAccount());
                break;
            case 2:
                actualPerson = login();
                if (actualPerson != null) {
                    if (actualPerson.block != 3) {
                        System.out.println("Здравствуйте " + actualPerson.name);
                    } else if (actualPerson.block == 3) {
                        zapusk();
                    }
                }
                break;
            case 3:
                if (actualPerson == null) {
                    System.out.println("Сначала зарегистрируйтесь!");
                    break;
                }
                Tests.testy();
                break;
            case 4:
                if (actualPerson == null) {
                    System.out.println("Сначала зарегистрируйтесь!");
                    break;
                }
                result = new ListSpisok(PathFile.resultTest);
                try {
                    String[] massiv = Menu.result.OpenAndReader();
                    for (int i = 0; i < massiv.length; i++) {
                        if (massiv[i].contains(actualPerson.name + " ")) {
                            System.out.println(massiv[i]);
                        }
                    }
                } catch (IOException a) {
                    System.out.println(a.getMessage());
                }
                break;
            case 5:
                return;
            default:
                System.out.println("Error");
        }
        zapusk();
    }

    static int vyborPotsithion() {
        int n = 0;
        try {
            int potsithion = Start.inerg.nextInt();
            n = potsithion;
        } catch (Exception e) {
            System.out.println("Неверное введено значение");
        }
        return n;
    }
    static String scannerVvod() {
        String vvod = Start.in.nextLine();
        return vvod;
    }

    static Person createAccount() {
        System.out.println("Введите логин: ");
        String name = scannerVvod();
        System.out.println("Введите пароль: ");
        String password = scannerVvod();
        Person person = new Person(name, password, 0);
        return person;
    }

    static Person login() {
        System.out.println("Введите своё имя: ");
        String name = scannerVvod();
        System.out.println("Введите пароль: ");
        String password = scannerVvod();

        return WorkAccount.login(name, password);
    }


}
