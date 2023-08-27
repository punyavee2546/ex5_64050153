package scoreusingbound;

import java.util.Scanner;

public class ScoreBound {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Subscriber sc1 = new Subscriber();
        Subscriber sc2 = new Subscriber();
        ScoreEvent sc3 = new ScoreEvent();
        
        sc3.addPropertyChangeListener(sc1);
        sc3.addPropertyChangeListener(sc2);

        String line;
        do
        {
            System.out.print("Enter Score ");
            line = in.nextLine();
            if(line.length() > 0)
            {
                sc3.setScoreLine(line);
            }
        } 
        while(line.length() > 0);
    }
    
}
