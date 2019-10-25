package com.practice26streams.app;
import java.io.*;
import java.util.Scanner;

public class WriterApp
{
    public static void main(String[] args)
    {

        final int LIMIT = 24;
        int table = 0;

        File myFile = null;
        FileWriter myWriter = null;
        BufferedWriter myBuffer = null;

        Scanner in = new Scanner(System.in);

        try
        {
            myFile = new File("C:\\a\\b.txt");
            myWriter = new FileWriter(myFile,true);
            myBuffer = new BufferedWriter(myWriter);

            System.out.println("Input the multiplication table: ");
            table = in.nextInt();

            for(int i = 0; i <= LIMIT; i++ )
            {
                myWriter.append(String.format("%d X %d = %d",table, i, table * i));
            }


        }
        catch (IOException e)
        {
            e.printStackTrace();;
        }
        finally {
            try {
                myBuffer.close();
                myWriter = null;
                myFile = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
