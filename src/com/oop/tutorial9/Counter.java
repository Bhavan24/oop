package com.oop.tutorial9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {

    private int count = 0;

    private final JLabel lblCount;
    private final JTextField tfCount;
    private final JButton btnCountUp;
    private final JButton btnCountDown;
    private final JButton btnCountReset;

    private final String countUpLbl = "Count Up";
    private final String countDownLbl = "Count down";
    private final String countResetLbl = "Reset";

    public Counter() {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.setBackground(Color.YELLOW);

        lblCount = new JLabel("Counter");
        add(lblCount);
        tfCount = new JTextField(String.valueOf(count), 10);
        tfCount.setEditable(false);
        add(tfCount);
        btnCountUp = new JButton(countUpLbl);
        add(btnCountUp);
        btnCountDown = new JButton(countDownLbl);
        add(btnCountDown);
        btnCountReset = new JButton(countResetLbl);
        add(btnCountReset);

        MyListener handler = new MyListener();
        btnCountUp.addActionListener(handler);
        btnCountDown.addActionListener(handler);
        btnCountReset.addActionListener(handler);
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.setTitle("My Counter");
        counter.setVisible(true);
        counter.setSize(600, 100);
        counter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {

            String btnLabel = evt.getActionCommand();

            if (btnLabel.equals(countUpLbl)) {
                ++count;
            } else if (btnLabel.equals(countDownLbl)) {
                --count;
            } else if (btnLabel.equals(countResetLbl)) {
                count = 0;
            }

            tfCount.setText(String.valueOf(count));
        }
    }

}