package com.example.demoapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import users.DataUsers;
import users.User;

public class HelloController {
    public Button enterButton;
    @FXML
    private TextField loginTextField;
    @FXML
    private PasswordField passwordTextField;

    public void enterSystemButtonClick() {
        if (checkInputData()) {
            System.out.println("Добро пожаловать в систему!");
            ;
        } else {
            System.out.println("Неверные данные, попробуйте еще");
        }
    }

    private boolean checkInputData() {
        for (User user : DataUsers.data) {
            if (loginTextField.getText().equals(user.getLogin()) && passwordTextField.getText().equals(user.getPassword())) {
                return true;
            } else {
            }
            return false;
        }
        return false;
    }
}