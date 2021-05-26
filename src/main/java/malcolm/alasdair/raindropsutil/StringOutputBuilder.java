package malcolm.alasdair.raindropsutil;

import static java.lang.Integer.parseInt;

public class StringOutputBuilder {

    private static String output;
    private static int input;

    public StringOutputBuilder(String input) {
        this.input = parseInt(input);
        createOutput();
    }

    private static void createOutput(){
        //TODO: Core functionality occurs here
    }

    public static String getOutput() {
        return output;
    }
}
