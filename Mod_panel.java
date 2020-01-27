package com.jetbrains;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class Mod_panel extends JPanel {
    private JLabel indexLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel phoneLabel;
    private JLabel streetLabel;
    private JLabel nrHouseLabel;
    private JLabel nrFlatLabel;
    private JLabel postCodeLabel;
    private JLabel postOfficeLabel;

    private JTextField indexText;
    private JTextField nameText;
    private JTextField surnameText;
    private JTextField phoneText;
    private JTextField streetText;
    private JTextField nrHouseText;
    private JTextField nrFlatText;
    private JTextField postCodeText;
    private JTextField postOfficeText;

    private JButton modBtn;


    private ShowManager manager;
    public Mod_panel() throws FileNotFoundException
    {
        Dimension dim = getPreferredSize();
        dim.width = 200;

        this.indexLabel = new JLabel("Indeks: ");
        this.nameLabel = new JLabel("Nowe imię: ");
        this.surnameLabel = new JLabel("Nowe nazwisko: ");
        this.phoneLabel = new JLabel("Nowy numer telefonu: ");
        this.streetLabel = new JLabel("Nowa ulica: ");
        this.nrHouseLabel = new JLabel("Nowy numer domu: ");
        this.nrFlatLabel = new JLabel("Nowy numer mieszkania: ");
        this.postCodeLabel = new JLabel("Nowy kod pocztowy: ");
        this.postOfficeLabel = new JLabel("Nowy urząd pocztowy: ");
        this.modBtn = new JButton("Modyfikuj");


        this.indexText = new JTextField(20);
        this.nameText = new JTextField(20);
        this.surnameText = new JTextField(20);
        this.phoneText = new JTextField(20);
        this.streetText = new JTextField(20);
        this.nrHouseText = new JTextField(20);
        this.nrFlatText = new JTextField(20);
        this.postCodeText = new JTextField(20);
        this.postOfficeText = new JTextField(20);

        modBtn.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                JButton clicked = (JButton)e.getSource();
                if(clicked == modBtn)
                {
                    if(manager!=null)
                    {

                        String name = nameText.getText();
                        String surname = surnameText.getText();
                        String phone_number = phoneText.getText();
                        String street = streetText.getText();
                        String nr_house = nrHouseText.getText();
                        String nr_flat = nrFlatText.getText();
                        String post_code = postCodeText.getText();
                        String post_office = postOfficeText.getText();
                        String index = indexText.getText();
                        Person person = new Person(name, surname, phone_number, street, nr_house, nr_flat, post_code, post_office);
                            try {
                                manager.ModPerson(Integer.parseInt(index),person);
                            } catch (FileNotFoundException ex) {

                            }
                        }
                    }
                }
        });
        Border innerBorder = BorderFactory.createTitledBorder("Modyfikuj osobę");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();


        /////////////Name//////////////////////////
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 0;

        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,5);
        add(nameLabel,gc);


        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0,0,0,0);
        add(nameText, gc);

        ///////////////////////Surname//////////////////////////////
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridy = 1;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,5);
        add(surnameLabel, gc);

        gc.gridy = 1;
        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(surnameText, gc);
        ///////////////////////Phone number//////////////////////////////
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridy = 2;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,5);
        add(phoneLabel, gc);

        gc.gridy = 2;
        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(phoneText, gc);

        ///////////////////////Street//////////////////////////////
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridy = 3;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,5);
        add(streetLabel, gc);

        gc.gridy = 3;
        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(streetText, gc);
        ///////////////////////House number//////////////////////////////
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridy = 4;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,5);
        add(nrHouseLabel, gc);

        gc.gridy = 4;
        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(nrHouseText, gc);
        ///////////////////////Flat number//////////////////////////////
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridy = 5;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,5);
        add(nrFlatLabel, gc);

        gc.gridy = 5;
        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(nrFlatText, gc);
        ///////////////////////Post code//////////////////////////////
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridy = 6;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,5);
        add(postCodeLabel, gc);

        gc.gridy = 6;
        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(postCodeText, gc);
        ///////////////////////Post office//////////////////////////////
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridy = 7;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,5);
        add(postOfficeLabel, gc);

        gc.gridy = 7;
        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(postOfficeText, gc);

        ///////////////////////Index//////////////////////////////
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridy = 8;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,5);
        add(indexLabel, gc);

        gc.gridy = 8;
        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(indexText, gc);
        /////////////////////////Button//////////////////////////////

        gc.weightx = 1;
        gc.weighty = 2;

        gc.gridy = 9;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0,0,0,0);
        add(modBtn, gc);

    }
    public void setShowManager(ShowManager manager){
        this.manager = manager;
    }
}
