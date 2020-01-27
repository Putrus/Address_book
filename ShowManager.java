package com.jetbrains;

import javax.swing.*;
import java.io.FileNotFoundException;

public interface ShowManager{
    public void Display();
    public void DisplayAddPanel();
    public void DisplayDeletePanel();
    public void DisplayModPanel();
    public void AddPerson(Person person)throws FileNotFoundException;
    public void DeletePerson(int number)throws FileNotFoundException;
    public void ModPerson(int number,Person person)throws FileNotFoundException;

}
