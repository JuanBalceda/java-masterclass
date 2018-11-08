package com.example;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;


public class Window extends Frame {
    public Window(String s) {
        super(s);
        setSize(400,150);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
