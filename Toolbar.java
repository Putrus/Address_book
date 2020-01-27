package com.jetbrains;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Toolbar extends JPanel implements ActionListener{
    private JButton b_add;
    private JButton b_delete;
    private JButton b_mod;
    private JButton b_display;
    private JButton b_search;
    private ShowManager manager;
    public Toolbar()
    {
        setBorder(BorderFactory.createEtchedBorder());
        this.b_add = new JButton("Dodaj");
        this.b_delete = new JButton("Usuń");
        this.b_mod = new JButton("Modyfikuj");
        this.b_display = new JButton("Wyświetl");
        this.b_search = new JButton("Szukaj");
        setLayout(new FlowLayout(FlowLayout.LEFT));

        this.b_add.addActionListener(this);
        this.b_delete.addActionListener(this);
        this.b_mod.addActionListener(this);
        this.b_display.addActionListener(this);
        this.b_search.addActionListener(this);
        add(b_add);
        add(b_delete);
        add(b_mod);
        add(b_display);
        add(b_search);





    }
    public void setShowManager(ShowManager showmanager){
        this.manager = showmanager;
    }
    public void actionPerformed(ActionEvent actionEvent) {
        JButton clicked = (JButton)actionEvent.getSource();
        if(clicked == this.b_display)
        {
            this.manager.Display();
        }
        else if(clicked == this.b_add)
        {
            this.manager.DisplayAddPanel();
        }
        else if(clicked == this.b_delete)
        {
            this.manager.DisplayDeletePanel();
        }
        else if(clicked == this.b_mod)
        {
            this.manager.DisplayModPanel();
        }

    }



}
