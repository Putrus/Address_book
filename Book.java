package com.jetbrains;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {

    private List<Person> persons;
    private JPanel panel_address_book;

    public Book(String file_name) throws FileNotFoundException {
        this.loadFromFile(file_name);
        this.panel_address_book = new JPanel();
        this.update();

        Border innerBorder = BorderFactory.createTitledBorder("Cała książka adresowa");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        panel_address_book.setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));


    }

    public void loadFromFile(String file_name) throws FileNotFoundException {
        this.persons = new ArrayList<Person>();
        File file = new File(file_name);
        Scanner scanner = new Scanner(file);
        String line = " ";
        String info[] = new String[8];
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            info = line.split(" ");
            System.out.println(info[0]);
            this.persons.add(new Person(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7]));
        }
    }

    public void add(Person person) throws FileNotFoundException {
        this.persons.add(person);
        try {
            Writer out = new BufferedWriter(new FileWriter("Data.txt", true));
            out.append(person.getName() + " " + person.getSurname() + " " + person.getPhone_number() + " " + person.getAddress().getStreet() + " " + person.getAddress().getNr_house() + " " + person.getAddress().getNr_flat() + " " + person.getAddress().getPost_code() + " " + person.getAddress().getPost_office() + "\n");
            out.close();
            this.update();
        } catch (IOException e) {
        }
    }

    public void delete(int num)throws FileNotFoundException{

        this.persons.remove(num);
        try {
            PrintWriter out1 = new PrintWriter("Data.txt");
            out1.print("");
            out1.close();
            Writer out = new BufferedWriter(new FileWriter("Data.txt", true));
            for (int i = 0; i < persons.size(); i++) {
                out.append(persons.get(i).getName() + " " + persons.get(i).getSurname() + " " +persons.get(i).getPhone_number() + " " + persons.get(i).getAddress().getStreet() + " " + persons.get(i).getAddress().getNr_house() + " " + persons.get(i).getAddress().getNr_flat() + " " + persons.get(i).getAddress().getPost_code() + " " + persons.get(i).getAddress().getPost_office() + "\n");
            }

            out.close();
            this.update();
        }
        catch(IOException e){

        }
    }

    public void update()
    {
        String array[][] = new String[persons.size()][8];
        for (int i = 0; i < persons.size(); i++) {
            array[i][0] = persons.get(i).getName();
            array[i][1] = persons.get(i).getSurname();
            array[i][2] = persons.get(i).getPhone_number();
            array[i][3] = persons.get(i).getAddress().getStreet();
            array[i][4] = persons.get(i).getAddress().getNr_house();
            array[i][5] = persons.get(i).getAddress().getNr_flat();
            array[i][6] = persons.get(i).getAddress().getPost_code();
            array[i][7] = persons.get(i).getAddress().getPost_office();
        }
        String[] column_names = {"Imię", "Nazwisko", "Telefon", "Ulica", "Nr domu", "Nr mieszkania", "Kod pocztowy", "Urząd pocztowy"};
        JTable table = new JTable(array, column_names);
        panel_address_book.removeAll();
        table.setEnabled(false);
        panel_address_book.add(table.getTableHeader(), BorderLayout.PAGE_START);
        panel_address_book.add(table, BorderLayout.CENTER);
    }

    public JPanel getJPanel() {
        return this.panel_address_book;
    }

    public List<Person> getPersons()
    {
        return persons;
    }



}
