import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JMenuBar implements ActionListener {
    private JMenu menu;
    private JMenuItem item;
    private JMenuItem item2;
    private JMenuItem item3;
    private JMenuItem item4;
    public MainMenu() {
        menu = new JMenu("The Menu");
        item = new JMenuItem("Item 1");
        item.addActionListener(this);
        add(menu);
        menu.add(item);

        item2 = new JMenuItem("Item 1");
        item2.addActionListener(this);
        menu.add(item2);

        item3 = new JMenuItem("Item 1");
        item3.addActionListener(this);
        menu.add(item3);

        item4 = new JMenuItem("Item 1");
        item4.addActionListener(this);
        menu.add(item4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
