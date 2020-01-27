package com.jetbrains;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class Delete_panel extends JPanel {
    private JLabel number;
    private JTextField numberField;
    private JButton delBtn;

    private ShowManager manager;

    public Delete_panel()
    {
        Dimension dim = getPreferredSize();
        dim.width = 200;

        this.number = new JLabel("Podaj nr indeksu osoby: ");
        this.numberField = new JTextField(20);
        this.delBtn = new JButton("Usuń");
        this.delBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JButton clicked = (JButton) e.getSource();
                if (clicked == delBtn)
                {
                    if(manager!=null) {
                        int num = Integer.parseInt(numberField.getText());
                        try {
                            manager.DeletePerson(num);
                        } catch (FileNotFoundException ex) {

                        }
                    }
                }

            }
        });

        Border innerBorder = BorderFactory.createTitledBorder("Usuń osobę");
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
        add(number,gc);


        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0,0,0,0);
        add(numberField, gc);

        /////////////////////////Button//////////////////////////////

        gc.weightx = 1;
        gc.weighty = 2;

        gc.gridy = 8;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0,0,0,0);
        add(delBtn, gc);



    }

    public void setShowManager(ShowManager manager){
        this.manager = manager;
    }


}
