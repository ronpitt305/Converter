package com.ronone;

import com.ronone.currency.CurrencyConverter;
import com.ronone.temp.TempConverter;
import com.ronone.weight.WeighConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Frame extends JFrame {


    private JTextField jTextField, showField;
    private JComboBox<String> comboBoxOption1, comboBoxOption2;
    private JButton currencyButton, tempButton, massButton, convertButton, eraseButton;

    

    public Frame(){
        super("Super Converter");

        CurrencyConverter currencyConverter = new CurrencyConverter();
        TempConverter tempConverter = new TempConverter();
        WeighConverter weighConverter = new WeighConverter();

        String[] currencyOptions = new String[] {"-Select Currency-","Dollars", "Pounds", "Yens", "Euros", "Renmenbi"};
        String[] currencyOptions2 = new String[] {"-Select Currency-","Dollars", "Pounds", "Yens", "Euros", "Renmenbi"};
        String[] tempatureOptions = new String[] {"-Select Tempature-","Fahrenheit", "Celsius", "Kelvin"};
        String[] tempatureOptions2 = new String[] {"-Select Tempature-","Fahrenheit", "Celsius", "Kelvin"};
        String[] massOptions = new String[]{"-Select Mass-","Pounds", "Stones", "Kilograms"};
        String[] massOptions2 = new String[]{"-Select Mass-","Pounds", "Stones", "Kilograms"};


        jTextField = new JTextField("Enter amount to convert");
        showField = new JTextField("...");
        showField.setEditable(false);
        jTextField.setPreferredSize(new Dimension(100, 20));


        currencyButton = new JButton("Currency");
        tempButton = new JButton("Temperature");
        massButton = new JButton("Mass");
        convertButton = new JButton("Convert");
        eraseButton = new JButton("Clear");

        //Boxes for option buttons
        Box box = Box.createVerticalBox();
        box.add(currencyButton);
        box.add(tempButton);
        box.add(massButton);
        // Boxes for text field
        Box panel = Box.createVerticalBox();
        panel.add(jTextField);
        panel.add(showField);


        comboBoxOption1 = new JComboBox<>();
        comboBoxOption2 = new JComboBox<>();

        //Boxes for convert
        Box convertBox = Box.createVerticalBox();
        convertBox.add(comboBoxOption1);
        convertBox.add(convertButton);
        convertBox.add(eraseButton);
        convertBox.add(comboBoxOption2);

        eraseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("");
                showField.setText("");
                comboBoxOption1.removeAllItems();
                comboBoxOption2.removeAllItems();
            }
        });

        currencyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(currencyOptions);
                DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel(currencyOptions2);
                comboBoxOption1.setModel(defaultComboBoxModel);
                comboBoxOption2.setModel(defaultComboBoxModel2);
                System.out.println("Action Event for " + currencyOptions[0] + " works");
            }
        });

        tempButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(tempatureOptions);
                DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel(tempatureOptions2);
                comboBoxOption1.setModel(defaultComboBoxModel);
                comboBoxOption2.setModel(defaultComboBoxModel2);
                System.out.println("Action Event for " + tempatureOptions[0] + " works");
            }
        });

        massButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(massOptions);
                DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel(massOptions2);
                comboBoxOption1.setModel(defaultComboBoxModel);
                comboBoxOption2.setModel(defaultComboBoxModel2);
                System.out.println("Action Event for " + massOptions[0] + " works");
            }
        });


        showField.setPreferredSize(new Dimension(100, 20));


        add(convertBox, BorderLayout.EAST);
        add(box, BorderLayout.NORTH);
        add(panel, BorderLayout.SOUTH);


        setVisible(true);
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        //Convert button listener
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBoxOption1.getSelectedItem();
                comboBoxOption2.getSelectedItem();

                if (comboBoxOption1.getSelectedItem().equals("-Select Currency-")|| comboBoxOption2.getSelectedItem().equals("-Select Currency-")){
                    showField.setEditable(true);
                    showField.setText("Select an actual currency Option");
                    System.out.println("Convert button was pressed");
                } else if (comboBoxOption1.getSelectedItem().equals("Dollars") && comboBoxOption2.getSelectedItem().equals("Pounds")){
                    double answer = currencyConverter.dollarsToPounds(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Dollars") && comboBoxOption2.getSelectedItem().equals("Yens")){
                    double answer = currencyConverter.dollarsToYens(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Dollars") && comboBoxOption2.getSelectedItem().equals("Euros")){
                    double answer = currencyConverter.dollarsToEuros(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Dollars") && comboBoxOption2.getSelectedItem().equals("Renmenbi")){
                    double answer = currencyConverter.dollarsToRenminbi(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Pounds") && comboBoxOption2.getSelectedItem().equals("Dollars")){
                    double answer = currencyConverter.poundsToDollars(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Pounds") && comboBoxOption2.getSelectedItem().equals("Euros")){
                    double answer = currencyConverter.poundsToEuros(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Pounds") && comboBoxOption2.getSelectedItem().equals("Yens")){
                    double answer = currencyConverter.poundsToYen(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Pounds") && comboBoxOption2.getSelectedItem().equals("Renmenbi")){
                    double answer = currencyConverter.poundsToRenminbi(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Euros") && comboBoxOption2.getSelectedItem().equals("Pounds")){
                    double answer = currencyConverter.eurosToPounds(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Euros") && comboBoxOption2.getSelectedItem().equals("Dollars")){
                    double answer = currencyConverter.eurosToDollars(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Euros") && comboBoxOption2.getSelectedItem().equals("Yens")){
                    double answer = currencyConverter.eurosToYen(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Euros") && comboBoxOption2.getSelectedItem().equals("Yens")){
                    double answer = currencyConverter.eurosToRenminbi(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Yens") && comboBoxOption2.getSelectedItem().equals("Dollars")){
                    double answer = currencyConverter.yensToDollars(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Yens") && comboBoxOption2.getSelectedItem().equals("Euros")){
                    double answer = currencyConverter.yensToEuros(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Yens") && comboBoxOption2.getSelectedItem().equals("Pounds")){
                    double answer = currencyConverter.yensToPounds(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Yens") && comboBoxOption2.getSelectedItem().equals("Renmenbi")){
                    double answer = currencyConverter.yensToRenminbi(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Renmenbi") && comboBoxOption2.getSelectedItem().equals("Dollars")){
                    double answer = currencyConverter.renminbiToDollars(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Renmenbi") && comboBoxOption2.getSelectedItem().equals("Euros")){
                    double answer = currencyConverter.renminbiToEuros(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Renmenbi") && comboBoxOption2.getSelectedItem().equals("Pounds")){
                    double answer = currencyConverter.renminbiToPounds(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Renmenbi") && comboBoxOption2.getSelectedItem().equals("Yens")){
                    double answer = currencyConverter.renminbiToYen(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Celsius") && comboBoxOption2.getSelectedItem().equals("Fahrenheit")){
                    double answer = tempConverter.celsiusToFahrenheit(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Celsius") && comboBoxOption2.getSelectedItem().equals("Kelvin")){
                    double answer = tempConverter.celsiusToKelvin(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Fahrenheit") && comboBoxOption2.getSelectedItem().equals("Celsius")){
                    double answer = tempConverter.fahrenheitToCelsius(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Fahrenheit") && comboBoxOption2.getSelectedItem().equals("Kelvin")){
                    double answer = tempConverter.fahrenheitToKelvin(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Pounds") && comboBoxOption2.getSelectedItem().equals("Stones")){
                    double answer = weighConverter.poundsToStones(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Pounds") && comboBoxOption2.getSelectedItem().equals("Kilograms")){
                    double answer = weighConverter.poundsToKgrams(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Stones") && comboBoxOption2.getSelectedItem().equals("Pounds")){
                    double answer = weighConverter.stonesToPounds(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Stones") && comboBoxOption2.getSelectedItem().equals("Kilograms")){
                    double answer = weighConverter.stonesToKgrams(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Kilograms") && comboBoxOption2.getSelectedItem().equals("pounds")){
                    double answer = weighConverter.kgramsToPounds(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else if (comboBoxOption1.getSelectedItem().equals("Kilograms") && comboBoxOption2.getSelectedItem().equals("Stones")){
                    double answer = weighConverter.kgramsToStones(Double.parseDouble(jTextField.getText()));
                    showField.setEditable(true);
                    showField.setText("" + answer);
                } else {
                    showField.setEditable(true);
                    showField.setText("[Invalid options selected]");
                }

            }
        });


    }

}
