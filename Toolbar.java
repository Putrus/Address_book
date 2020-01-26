package com.jetbrains;

import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel {
    private JButton b_add;
    private JButton b_delete;
    private JButton b_mod;
    private JButton b_display;
    private JButton b_search;

    public Toolbar()
    {
        setBorder(BorderFactory.createEtchedBorder());
        this.b_add = new JButton("Dodaj");
        this.b_delete = new JButton("Usuń");
        this.b_mod = new JButton("Modyfikuj");
        this.b_display = new JButton("Wyświetl");
        this.b_search = new JButton("Szukaj");
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(b_add);
        add(b_delete);
        add(b_mod);
        add(b_display);
        add(b_search);

        /*setVisible(true);*/

    }
}
