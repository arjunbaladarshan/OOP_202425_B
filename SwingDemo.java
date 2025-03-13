import javax.swing.*;        
import java.awt.*;

class DUButton extends JButton{
    public DUButton(String temp){
        super(temp);
        this.setBackground(Color.RED);
        this.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        this.setForeground(Color.WHITE);
    }
}

public class SwingDemo {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(createMainPanel());

        //Display the window.
        // frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    private static JPanel createMainPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        DUButton myButton1 = new DUButton("BTN 1");
        panel.add(myButton1, BorderLayout.NORTH);        

        DUButton myButton2 = new DUButton("BTN 2");
        panel.add(myButton2, BorderLayout.SOUTH);

        DUButton myButton3 = new DUButton("BTN 3");
        panel.add(myButton3, BorderLayout.WEST);

        DUButton myButton4 = new DUButton("BTN 4");
        panel.add(myButton4, BorderLayout.EAST);


        return panel;
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}