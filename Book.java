package com.jetbrains;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book{

    private List<Person> persons;
    private JTable table;
    public Book(String file_name) throws FileNotFoundException{
        this.loadFromFile(file_name);
        String array[][] = new String[persons.size()][8];
        for(int i=0;i<persons.size();i++)
        {
            array[i][0] = persons.get(i).getName();
            array[i][1] = persons.get(i).getSurname();
            array[i][2] = persons.get(i).getPhone_number();
            array[i][3] = persons.get(i).getAddress().getStreet();
            array[i][4] = persons.get(i).getAddress().getNr_house();
            array[i][5] = persons.get(i).getAddress().getNr_flat();
            array[i][6] = persons.get(i).getAddress().getPost_code();
            array[i][7] = persons.get(i).getAddress().getPost_office();
        }
        String[] column_names = {"Imię", "Nazwisko", "Telefon", "Ulica", "Nr domu", "Nr mieszkania","Kod pocztowy", "Urząd pocztowy"};
        this.table = new JTable(array, column_names);
    }

    public void loadFromFile(String file_name) throws FileNotFoundException
    {
        this.persons = new ArrayList<Person>();
        File file = new File(file_name);
        Scanner scanner = new Scanner(file);
        String line = " ";
        String info[] = new String[8];
        while(scanner.hasNext())
        {
            line = scanner.nextLine();
            info = line.split(" ");
            this.persons.add(new Person(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7]));
        }
    }

    public void add(Person person)
    {
        this.persons.add(person);
    }

    public JTable getJTable()
    {
        return this.table;
    }


}
