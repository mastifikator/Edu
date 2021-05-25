package GUI;

import javax.swing.*;
import java.awt.*;

public class MadnessBall {
    //Изначальное положение
    int x = 1;
    int y = 1;

    public static void main(String[] args) {
        MadnessBall gui = new MadnessBall();
        gui.go();
    }

    public  void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(600,600);
        frame.setVisible(true);

        //меняем координаты
        boolean reverseX = false;
        boolean reverseY = false;
        int countX = 1;
        int countY = 1;

        while (true) {

            if(x == frame.getWidth() - 80 || x == 0){ reverseX = !reverseX; countX++;}
            if(y == frame.getHeight() - 80 || y == 0){ reverseY = !reverseY; countY++;}

            if(reverseX) x++;
            else x = y--;

            if(reverseY) y++;
            else y = y--;

            drawPanel.repaint();
            try {
                Thread.sleep(5);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.black);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            g.setColor(Color.red);
            g.fillOval(x,y,40,40);
        }
    }
}
