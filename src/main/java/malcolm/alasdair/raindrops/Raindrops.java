package malcolm.alasdair.raindrops;

import malcolm.alasdair.raindropsutil.StringOutputBuilder;

public class Raindrops {

    public static String raindrops(String input){
        StringOutputBuilder stringOutputBuilder = new StringOutputBuilder(input);
        return stringOutputBuilder.getOutput();
    }
}