package com.jetbrains;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	JFrame mainFrame = new MainFrame();
	Book book = new Book("Data.txt");


    }
}
