package smiley_lab_problem_2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Smiley extends JFrame{

    int height, width;
    public Smiley(int height, int width)
    {
        this.height = height;
        this.width = width;
        super.setTitle("Smile");
        super.setSize(height, width);
        super.setVisible(true);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
    }

    public static void main(String[] args)
    {
        new Smiley(400, 400);
    }

    public void paint(Graphics g)
    {
        //g.drawArc(100, 100, 200, 200, 0, 360);
        g.setColor(Color.gray);
        g.fillRect(0, 0, height, width);
        g.setColor(Color.YELLOW);
        g.fillArc(100, 100, 200, 200, 0, 360);
        g.setColor(Color.BLUE);
        g.fillArc(140, 150, 40, 40, 0, 360);
        g.fillArc(220, 150, 40, 40, 0, 360);
        g.setColor(Color.red);
        g.drawArc(160, 180, 80, 80, 200, 140);
    }
}
