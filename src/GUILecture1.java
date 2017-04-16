import javax.swing.*;
import java.awt.*;

public class GUILecture1 {


    // 2 points
    public static JLabel Q1(){
        // return a JLabel with the text "Niagara Falls"

        return null;
    }


    // 3 points
    public static JLabel Q2(){
        // return a JLabel containing the image at the url
        // https://www.cse.buffalo.edu/cocoon2009/images/Niagara_Falls_American_Falls.jpg

        return null;
    }



    public static JFrame getGUI(){

        JFrame frame = new JFrame("Falls Frame");
        frame.setSize(600,500);
        frame.getContentPane().add(Q1(), BorderLayout.NORTH);
        frame.getContentPane().add(Q2());

        return frame;
    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                JFrame frame = getGUI();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

}
