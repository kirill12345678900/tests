public class Tests {
    static ListSpisok vopros;
    static ListSpisok otvet;
    static void testy(){
        System.out.println("Введите 1, чтобы пройти тест по футболу!");
        System.out.println("Введите 2, чтобы пройти тест по программированию!");
        System.out.println("Введите 3, Чтобы пройти тест про животных!");
        System.out.println("Введите 4, Чтобы вернуться в меню!");
        switch (Menu.vyborPotsithion()) {
            case 1:
                vopros = new ListSpisok(PathFile.footbol);
                otvet = new ListSpisok(PathFile.otvety);
                PassingTheTest.passing();
                break;

            case 2:
                vopros = new ListSpisok(PathFile.codding);
                otvet = new ListSpisok(PathFile.otvety);
                PassingTheTest.passing();
                break;
            case 3:
                vopros = new ListSpisok(PathFile.animal);
                otvet = new ListSpisok(PathFile.otvety);
                PassingTheTest.passing();
                break;
            case 4:
            default:
                Menu.zapusk();
        }
    }

}
