import java.awt.Color;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame obj=new JFrame();
        Gameplay gamePlay = new Gameplay();

        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Block Shooter");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        obj.setVisible(true);

        try{
            File fnew = new File("C:\\Users\\qfaheem\\Desktop\\OOP project\\File.txt");
            FileWriter fileWriter = new FileWriter(fnew);
            fileWriter.write("Block Shooter Game \n\n ***Developed by*** \nMuneeb Qureshi \nSyed Anas Munir \nSyed Arhum Hussain");
            fileWriter.close();
            FileReader fileReader = new FileReader("C:\\Users\\qfaheem\\Desktop\\OOP project\\File.txt");
            int data = 0;
            String text = "";
            while((data = fileReader.read()) != -1)
            {
                text += (char)data;
                System.out.print((char)data);
            }
            System.out.println();
            fileReader.close();
            System.out.println(text);
        }
        catch (Exception exc)
        {
            System.out.println(exc.getMessage());
        }

    }

}