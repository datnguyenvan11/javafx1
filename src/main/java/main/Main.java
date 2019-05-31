package main;

import entity.Register;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.RegisterModel;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        RegisterModel registerModel = new RegisterModel();
        Pane pane = new Pane();
        Label labelName = new Label("username");
        Label labelpassword = new Label("password");
        Label labelconfirmpassword = new Label("confirm-password");
        Label email = new Label("email");
        Label phone = new Label("phone");
        Label fullname = new Label("fullname");
        TextField usernameField = new TextField();
        PasswordField confirmpasswordField = new PasswordField();
        TextField emailField = new TextField();
        TextField phoneField = new TextField();
        TextField fullnameField = new TextField();
        PasswordField passwordField = new PasswordField();
        Button button = new Button("register");
        Button reset = new Button("resest");
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(labelName, 1, 1);
        gridPane.add(labelconfirmpassword, 1, 3);
        gridPane.add(email, 1, 4);
        gridPane.add(phone, 1, 5);
        gridPane.add(fullname, 1, 6);
        gridPane.add(labelpassword, 1, 2);
        gridPane.add(usernameField, 2, 1);
        gridPane.add(passwordField, 2, 2);
        gridPane.add(confirmpasswordField, 2, 3);
        gridPane.add(emailField, 2, 4);
        gridPane.add(phoneField, 2, 5);
        gridPane.add(fullnameField, 2, 6);
        gridPane.setAlignment(Pos.CENTER);
        HBox hBox = new HBox();
        hBox.getChildren().addAll(button, reset);
        hBox.setSpacing(10);
        gridPane.add(hBox, 2, 8);
        Scene scene = new Scene(gridPane, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Register register = new Register(usernameField.getText(), passwordField.getText(), confirmpasswordField.getText(), emailField.getText(), phoneField.getText(), fullnameField.getText());
                registerModel.insert(register);
            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}


