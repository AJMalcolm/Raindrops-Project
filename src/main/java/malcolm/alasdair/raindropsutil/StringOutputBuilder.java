package malcolm.alasdair.raindropsutil;

import static java.lang.Integer.parseInt;

public class StringOutputBuilder {

    private String output = "";
    private int input;

    public StringOutputBuilder(String input) {
        this.input = parseInt(input);
        createOutput();
    }

    private void createOutput(){
        if(input % 3 == 0){
            output = output + "Pling";
        }
        if(input % 5 == 0){
            output = output + "Plang";
        }
        if(input % 7 == 0){
            output = output + "Plong";
        }

        if(output.isEmpty()){
            output = Integer.toString(input);
        }
    }

    public String getOutput() {
        return this.output;
    }
}
