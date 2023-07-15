package subsequences_ag;

import java.util.Scanner;

class AGsequence
{
    public void agSequence(String sequence)
    {

        int count=0,result=0;
        for(int i=0;i<sequence.length();i++)
        {
            if(sequence.charAt(i)=='A')
            {
                count++;

            }
            if(sequence.charAt(i)=='G')
            {
                result+= count;
            }

        }
        System.out.println(result);

    }
}

public class Sequences
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String sequence =scanner.next();
        scanner.close();
        AGsequence sol =new AGsequence();
        sol.agSequence(sequence);
    }
}