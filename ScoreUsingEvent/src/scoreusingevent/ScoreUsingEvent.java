package scoreusingevent;

import java.util.Scanner;

public class ScoreUsingEvent
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
   
        Subscriber sc1 = new Subscriber();
        Subscriber sc2 = new Subscriber();
        Subscriber sc3 = new Subscriber();

        ScoreSource scoresource = new ScoreSource();
        
        scoresource.addObserver(sc1);
        scoresource.addObserver(sc2);
        scoresource.addObserver(sc3);
        
        scoresource.removeObserver(sc1);

        String line;
        do
        {
            System.out.print("Enter Score ");
            line = in.nextLine();
            if(line.length() > 0)
            {
                scoresource.setScoreLine(line);
            }
        } 
        while(line.length() > 0);
    }
}
