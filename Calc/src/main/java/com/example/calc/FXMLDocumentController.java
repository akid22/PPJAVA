package com.example.calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController {
    @FXML
    private TextField tfNumber1, tfNumber2, tfResult;
    @FXML
    private Label labelNumber1, labelNumber2, labelResult;

    @FXML
    protected void addButtonAction(ActionEvent event) {
        tfResult.setText(getResult('+') + " ");
    }

    @FXML
    protected void subtractButtonAction(ActionEvent event) {
        tfResult.setText(getResult('-') + " ");
    }

    @FXML
    protected void multiplyButtonAction(ActionEvent event) {
        tfResult.setText(getResult('*') + " ");
    }

    @FXML
    protected void divideButtonAction(ActionEvent event) {
        tfResult.setText(getResult('/') + " ");
    }

    private double getResult(char op) {
        double number1 = Double.parseDouble(tfNumber1.getText());
        double number2 = Double.parseDouble(tfNumber2.getText());
        switch (op) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                return number1 / number2;
        }
        return Double.NaN;
    }
}