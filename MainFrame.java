package com.jetbrains;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Toolbar toolbar;

public MainFrame()
{
    super("Książka adresowa");
    setSize(700,700);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.toolbar = new Toolbar();
    add(toolbar, BorderLayout.PAGE_START);

    setVisible(true);

}


}
