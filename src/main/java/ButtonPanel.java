import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {

    private JButton but1;
    private JButton but2;

    public ButtonPanel() {
        but1 = new JButton("Press me");
        but2 = new JButton("Button 2");
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("Hello");
            }
        });

        add(but1);
        add(but2);
        setLayout(new GridLayout(5,1));
    }

}
