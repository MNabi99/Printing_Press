// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Printing_Action printAction = new Printing_Action(20,true);
        printAction.to_fill_Toner(90);
        printAction.to_fill_Toner(15);
        printAction.to_fill_Toner(1);
        printAction.to_fill_Toner(40);
        printAction.to_fill_Toner(50);
        printAction.to_fill_Toner(30);
        printAction.to_fill_Toner(10);
        printAction.to_fill_Toner(120);
        printAction.to_fill_Toner(90);
        printAction.to_fill_Toner(30);
        printAction.pagesPrinted(2,true);
        printAction.pagesPrinted(22,true);
        printAction.pagesPrinted(31,false);
        printAction.pagesPrinted(41,true);
        printAction.pagesPrinted(2,false);
    }
}