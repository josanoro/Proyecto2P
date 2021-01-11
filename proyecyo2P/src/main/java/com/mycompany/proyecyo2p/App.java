package com.mycompany.proyecyo2p;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label1 = new Label("Username");
        TextField user = new TextField(); 
        HBox hbox1 = new HBox(); 
        hbox1.getChildren().add(label1); 
        hbox1.getChildren().add(user); 
        var label2 = new Label("password");
        TextField pass = new TextField();
        HBox hbox2 = new HBox(); 
        hbox1.getChildren().add(label2); 
        hbox1.getChildren().add(pass); 
        
        Button b1 = new Button("log in");
        GridPane gP = new GridPane();
        gP.add(hbox1, 2, 0, 1, 1);
        gP.add(hbox2, 1, 2, 1, 1);
        gP.add(b1, 0, 4, 1, 1);
        
        var scene = new Scene(new StackPane(gP), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}