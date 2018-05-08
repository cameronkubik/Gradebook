package com.kubik;

import javax.swing.*;
import java.awt.event.*;

public class Home extends JDialog {
    private JPanel contentPane;
    private JPanel contentContainer;
    private JLabel windowTitle;
    private JButton newCourseButton;

    public Home() {
        setContentPane(contentPane);
        setModal(true);

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        newCourseButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //TODO switch panels

            }
        });
    }

    private void onOK() {
        // add your code here
        Printer.displayOpening();
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        Home dialog = new Home();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
