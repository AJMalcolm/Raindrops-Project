package malcolm.alasdair.startup;

import malcolm.alasdair.raindrops.Raindrops;

public class RunRaindrops
{
    public static void main(String[] args )
    {
        String input = "35";
        String output = Raindrops.raindrops(input);
        System.out.println("With an input of " + input + " an output of " + output + " is generated.");
    }
}