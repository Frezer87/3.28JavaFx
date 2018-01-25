package com.frezer;

import javafx.application.Application;
import javafx.stage.Stage;
import javax.swing.*;
public class Main extends Application {
    @Override

    public void start(Stage primaryStage) {
        int age;
        int height;

        String input1 = JOptionPane.showInputDialog(null, "Enter your age ");

        String input2 = JOptionPane.showInputDialog(null, "Enter your height in inches");

        age = Integer.parseInt(input1);
        height = Integer.parseInt(input2);

        if ((age > 50 || height > 60 ) ) {
            JOptionPane.showMessageDialog(null, "True you are over 50 years or your height is over 60 inches");
        } else {
            JOptionPane.showMessageDialog(null, "False you are under 50 years or your height is under 60 inches " );


        }
    }
}


