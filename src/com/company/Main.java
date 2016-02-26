package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Some form");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class Myform extends JFrame{
    private JTextArea textArea;
    private JButton button;
private int a;

    public Myform(){
        super("Some form");



        textArea = new JTextArea();
        button = new JButton("push");
        setLayout(new BorderLayout());
        add(textArea, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);




    }
}