import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PartyPlanner extends JFrame implements ActionListener {
    JMenuBar mainBar = new JMenuBar();
    JMenuItem menu1 = new JMenu("File");
    JMenu menu2 = new JMenu("Event Type");
    JMenuItem exit = new JMenuItem("Exit");
    JMenu adult = new JMenu("Adult");
    JMenu child = new JMenu("Child");
    JMenuItem adultBday = new JMenuItem("Birthday");
    JMenuItem aniv = new JMenuItem("Anniversary");
    JMenuItem retirement = new JMenuItem("Retirement");
    JMenuItem adultOther = new JMenuItem("Other");
    JMenuItem childBday = new JMenuItem("Birthday");
    JMenuItem childOther = new JMenuItem("Other");

    JPanel currentPanel = new JPanel();
    JPanel otherPanel = new JPanel();

    JLabel currentLabel = new JLabel();
    JLabel otherLabel = new JLabel("We have lots of idea for memorable events.");


    public PartyPlanner() {
        super("Party Planner");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        composMenus();
        addActionListener();
        layoutComponents();

    }

    public void composMenus() {
        setJMenuBar(mainBar);
        mainBar.add(menu1);
        mainBar.add(menu2);
        menu1.add(exit);
        menu2.add(adult);
        menu2.add(child);
        adult.add(adultBday);
        adult.add(aniv);
        adult.add(retirement);
        adult.add(adultOther);
        // child
        child.add(childBday);
        child.add(childOther);

    }

    public void addActionListener() {
        exit.addActionListener(this);
        adultBday.addActionListener(this);
        aniv.addActionListener(this);
        retirement.addActionListener(this);
        adultOther.addActionListener(this);
        childBday.addActionListener(this);
        childOther.addActionListener(this);


    }

    public void layoutComponents() {
        currentPanel.add(currentLabel);
        currentPanel.add(otherLabel);
        add(currentPanel);
        add(otherPanel);

    }

    public static void main(String[] args) {
        PartyPlanner p = new PartyPlanner();
        p.setVisible(true);
        p.setSize(400, 200);
        p.setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == exit) {
            System.exit(0);
        } else if (obj == adultBday) {
            currentLabel.setText("Celebrate another year!");
            currentPanel.setBackground(Color.RED);
            otherPanel.setBackground(Color.PINK);

        } else if (obj == aniv) {
            currentLabel.setText("Look forward to golden years");
            currentPanel.setBackground(Color.YELLOW);
            otherPanel.setBackground(Color.PINK);

        } else if (obj == retirement) {
            currentLabel.setText("Cheers to Hardwork");
            currentPanel.setBackground(Color.BLUE);
            otherPanel.setBackground(Color.PINK);

        } else if (obj == adultOther) {
            currentLabel.setText("");
            currentPanel.setBackground(Color.PINK);
            otherPanel.setBackground(Color.PINK);


        }else if (obj == childBday) {
            currentLabel.setText("Throw the best birthday party");
            currentPanel.setBackground(Color.RED);
            otherPanel.setBackground(Color.WHITE);


        }else if (obj == childOther) {
            currentLabel.setText("");
            currentPanel.setBackground(Color.WHITE);
            otherPanel.setBackground(Color.WHITE);


        }
    }
}
