module pl.com.danielsokanski {
    requires javafx.controls;
    requires javafx.fxml;
    exports pl.com.danielsokanski;
    opens main.java.pl.com.danielsokanski;
    opens main.java.pl.com.danielsokanski.view;
    opens main.java.pl.com.danielsokanski.controller;
    opens main.java.pl.com.danielsokanski.model;
}