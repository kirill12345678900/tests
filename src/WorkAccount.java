public class WorkAccount {
        static Person[] annigilist = new Person[10];
        static void entyAccounts(Person person){
            for (int i = 0; i < annigilist.length; i++) {

                if (annigilist[i] == null) {
                    annigilist[i] = person;
                    System.out.println("Аккаунт сохранён");
                    break;
                } else if (!annigilist[i].name.equals(person.name)) {
                    continue;
                }else {
                    System.out.println("Такой логин уже существует, повторите попытку");
                    break;
                }

            }
        }
    static Person login(String name, String password) {

        for (int i = 0; i < annigilist.length; i++) {

            if (annigilist[i] != null) {
                if (annigilist[i].name.equals(name) && annigilist[i].password.equals(password)) {
                    if(annigilist[i].block == 3){
                        System.out.println("Ваш аккаунт заблокирован, обратитесь в техподдержку");
                        Menu.zapusk();
                    }
                    return annigilist[i];
                } else if (annigilist[i].name.equals(name)) {
                    annigilist[i].block += 1;
                    if (annigilist[i].block == 3){
                        System.out.println("Ваш аккаунт заблокирован");
                        return annigilist[i];
                    }
                }
            }
        }
        return null;
    }

    }
