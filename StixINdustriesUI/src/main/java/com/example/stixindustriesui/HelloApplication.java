package com.example.stixindustriesui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Date;

public class HelloApplication extends Application {

    // Keeping your original variables
    private int counter = 5;
    private String password = "Ndabile101";
    private String userName = "Konke.Ndabile";

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("STIX INDUSTRIES 4 (●'◡'●)❤️");

        // 1. Create the Layout Pane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // 2. Create and Add UI Controls
        Text sceneTitle = new Text("WELCOME TO STIX INDUSTRIES - LOGIN");
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label userLabel = new Label("Username:");
        grid.add(userLabel, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pwLabel = new Label("Password:");
        grid.add(pwLabel, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button loginBtn = new Button("Sign In");
        grid.add(loginBtn, 1, 4);

        // Feedback text for errors/success messages
        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);

        // 3. The Event Handler (Replacing your while(true) loop)
        loginBtn.setOnAction(e -> {
            String inputUser = userTextField.getText().trim();
            String inputPass = pwBox.getText().trim();

            if (counter <= 0) {
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("SESSION TERMINATED! Ncese, lol");
                loginBtn.setDisable(true); // Disable the button
                return;
            }

            if (inputUser.equals(userName) && inputPass.equals(password)) {
                actionTarget.setFill(Color.GREEN);
                actionTarget.setText("WELCOME! " + inputUser + "\nLogged in at: " + new Date());
            } else {
                counter--;
                actionTarget.setFill(Color.FIREBRICK);
                if (counter > 1) {
                    actionTarget.setText("INCORRECT! " + counter + " TRIALS LEFT!");
                } else if (counter == 1) {
                    actionTarget.setText("CAREFUL! " + counter + " TRIAL LEFT!!!");
                } else {
                    actionTarget.setText("LOGIN SESSION TERMINATED! Ncese, lol");
                    loginBtn.setDisable(true);
                }
            }
        });

        // 4. Set the Scene and Show the Stage
        Scene scene = new Scene(grid, 450, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launches the JavaFX Application
    }
}