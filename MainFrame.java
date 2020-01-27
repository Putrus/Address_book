package com.jetbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
public class MainFrame extends JFrame {
    private Toolbar toolbar;
    private Book book;
    private Add_panel add_panel;
    private Delete_panel delete_panel;
    private Mod_panel mod_panel;
    private ShowManager manager;
public MainFrame() throws FileNotFoundException
{
    super("Książka adresowa");

    this.toolbar = new Toolbar();
    add(toolbar, BorderLayout.PAGE_START);

    this.book = new Book("Data.txt");
    this.add_panel = new Add_panel();
    this.delete_panel = new Delete_panel();
    this.mod_panel = new Mod_panel();

    this.manager = new ShowManager(){
        public void Display(){
            remove(add_panel);
            remove(delete_panel);
            remove(mod_panel);
            add(book.getJPanel(), BorderLayout.CENTER);
            revalidate();
            repaint();
        }
        public void DisplayAddPanel(){
            remove(book.getJPanel());
            remove(delete_panel);
            remove(mod_panel);
            add(add_panel, BorderLayout.CENTER);
            revalidate();
            repaint();
        }
        public void DisplayDeletePanel(){
            remove(add_panel);
            remove(book.getJPanel());
            remove(mod_panel);
            add(delete_panel,BorderLayout.CENTER);
            revalidate();
            repaint();
        }
        public void DisplayModPanel(){
            remove(add_panel);
            remove(delete_panel);
            remove(book.getJPanel());
            add(mod_panel,BorderLayout.CENTER);
            revalidate();
            repaint();

        }
        public void AddPerson(Person person) throws FileNotFoundException{
            book.add(person);
        }
        public void DeletePerson(int num) throws FileNotFoundException{
            book.delete(num);
        }
        public void ModPerson(int num, Person person)throws FileNotFoundException{
            if(!person.getName().isEmpty())
            {
                book.getPersons().get(num).setName(person.getName());
            }
            if(!person.getSurname().isEmpty())
            {
                book.getPersons().get(num).setSurname(person.getPhone_number());
            }
            if(!person.getPhone_number().isEmpty())
            {
                book.getPersons().get(num).setPhone_number(person.getPhone_number());
            }
            if(!person.getAddress().getStreet().isEmpty())
            {
                book.getPersons().get(num).getAddress().setStreet(person.getAddress().getStreet());
            }
            if(!person.getAddress().getNr_house().isEmpty())
            {
                book.getPersons().get(num).getAddress().setNr_house(person.getAddress().getNr_house());
            }
            if(!person.getAddress().getNr_flat().isEmpty())
            {
                book.getPersons().get(num).getAddress().setNr_flat(person.getAddress().getNr_flat());
            }
            if(!person.getAddress().getPost_code().isEmpty())
            {
                book.getPersons().get(num).getAddress().setPost_code(person.getAddress().getPost_code());
            }
            if(!person.getAddress().getPost_office().isEmpty())
            {
                book.getPersons().get(num).getAddress().setPost_office(person.getAddress().getPost_office());
            }
            book.update();



        }

    };


    toolbar.setShowManager(manager);
    add_panel.setShowManager(manager);
    delete_panel.setShowManager(manager);
    mod_panel.setShowManager(manager);




    setSize(1000,700);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}


}
