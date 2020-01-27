package com.jetbrains;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add_panel extends JPanel {
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel phoneLabel;
    private JLabel streetLabel;
    private JLabel nrHouseLabel;
    private JLabel nrFlatLabel;
    private JLabel postCodeLabel;
    private JLabel postOfficeLabel;

    private JTextField nameText;
    private JTextField surnameText;
    private JTextField phoneText;
    private JTextField streetText;
    private JTextField nrHouseText;
    private JTextField nrFlatText;
    private JTextField postCodeText;
    private JTextField postOfficeText;

    private JButton addBtn;

    public Add_panel()
    {
        Dimension dim = getPreferredSize();
        dim.width = 200;

        this.nameLabel = new JLabel("Imię: ");
        this.surnameLabel = new JLabel("Nazwisko: ");
        this.phoneLabel = new JLabel("Numer telefonu: ");
        this.streetLabel = new JLabel("Ulica: ");
        this.nrHouseLabel = new JLabel("Numer domu: ");
        this.nrFlatLabel = new JLabel("Numer mieszkania: ");
        this.postCodeLabel = new JLabel("Kod pocztowy: ");
        this.postOfficeLabel = new JLabel("Urząd pocztowy: ");
        this.addBtn = new JButton("Dodaj");


        this.nameText = new JTextField(20);
        this.surnameText = new JTextField(20);
        this.phoneText = new JTextField(20);
        this.streetText = new JTextField(20);
        this.nrHouseText = new JTextField(20);
        this.nrFlatText = new JTextField(20);
        this.postCodeText = new JTextField(20);
        this.postOfficeText = new JTextField(20);

        addBtn.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

        }
    });
    Border innerBorder = BorderFactory.createTitledBorder("Dodaj osobę");
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

        /////////////////////////Button//////////////////////////////

        gc.weightx = 1;
        gc.weighty = 2;

        gc.gridy = 8;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0,0,0,0);
        add(addBtn, gc);

    }

}
