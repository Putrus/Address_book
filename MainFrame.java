package com.jetbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
public class MainFrame extends JFrame {
    private Toolbar toolbar;
    private Book book;
    private Add_panel add_panel;
public MainFrame() throws FileNotFoundException
{
    super("Książka adresowa");

    this.toolbar = new Toolbar();
    add(toolbar, BorderLayout.PAGE_START);

    this.book = new Book("Data.txt");
    this.add_panel = new Add_panel();
    toolbar.setShowManager(new ShowManager(){
        public void Display() {
            remove(add_panel);
            add(book.getJPanel(), BorderLayout.CENTER);
            revalidate();
            repaint();
        }
        public void DisplayAddPanel(){
            remove(book.getJPanel());
            add(add_panel, BorderLayout.CENTER);
            revalidate();
            repaint();
        }

    });
    setSize(1000,700);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}


}
