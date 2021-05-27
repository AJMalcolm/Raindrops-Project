package malcolm.alasdair.startup;

import malcolm.alasdair.raindrops.Raindrops;
import malcolm.alasdair.raindropsutil.Printer;
import java.util.Scanner;

public class RunRaindrops
{
    public static void main(String[] args)
    {
        Printer.printWelcomeMessage();

        boolean terminateRaindropsApplication = false;

        while(!terminateRaindropsApplication){
            Printer.printMessage("Please enter an input value");
            Scanner userInput = new Scanner(System.in);
            String input = userInput.nextLine();
            Printer.printMessage("Raindrops will now process your input...");
            String output = Raindrops.raindrops(input);
            Printer.printMessage(output);
            Printer.printNewLine();

            String response = "";

            while(response.isEmpty()){
                Printer.printMessage("Would you like to go again? Please enter y/n");
                String tempResponse = userInput.nextLine();
                if(tempResponse.equals("y") || tempResponse.equals("n")){
                    response = tempResponse;
                }
                else{
                    Printer.printMessage("Please enter a valid response (y/n).");
                }
            }
            if(response.equals("n")){
                terminateRaindropsApplication = true;
            }
        }
        Printer.printFarewellMessage();
    }
}