package malcolm.alasdair.raindropsutil;

public class Printer {
    public static void printMessage(String message){
        System.out.println(message);
    }

    public static void printNewLine(){
        System.out.println();
    }

    public static void printWelcomeMessage(){
        Printer.printMessage("Welcome to the Raindrops Application!");
        Printer.printNewLine();
        Printer.printMessage("This application will provide you with an output of either:");
        Printer.printMessage("Pling, Plang or Plong");
        Printer.printMessage("Depending upon your input.");
        Printer.printNewLine();
    }

    public static void printFarewellMessage(){
        Printer.printMessage("Thank you for using the Raindrops Application!");
    }
}
