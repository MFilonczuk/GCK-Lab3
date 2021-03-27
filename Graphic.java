package pl.michal;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;


public class Graphic extends JPanel
{
    int[] cordsX = new int[8];
    int[] cordsY = new int[8];
    double pointX;
    double pointY;

    @Override
    public void paint(Graphics g)
    {

        super.paintComponent(g);
        this.setBackground(new Color(3, 3, 24));
        g.setColor(Color.yellow);
        try
        {
            Scanner scan = new Scanner(new File("F:\\Programowanie\\Programowanie w Java\\Bezier\\src\\pl\\michal\\bezier.txt"));
            for(int i = 0; i < 15; i++)
            {
                for(int j = 0; j < 4; j++)
                {
                    cordsX[j] = scan.nextInt();
                    cordsY[j] = scan.nextInt();
                }
                    for (double t = 0.0; t < 1.0; t += 0.001)
                    {
                        pointX = (1 - t) * (1 - t) * (1 - t) * cordsX[0] + 3 * (1 - t) * (1 - t) * t * cordsX[1] + 3 * t * t * (1 - t) * cordsX[2] + t * t * t * cordsX[3];
                        pointY = (1 - t) * (1 - t) * (1 - t) * cordsY[0] + 3 * (1 - t) * (1 - t) * t * cordsY[1] + 3 * t * t * (1 - t) * cordsY[2] + t * t * t * cordsY[3];
                        g.drawRect((int)pointX,(int)pointY, 1, 1);
                    }
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}