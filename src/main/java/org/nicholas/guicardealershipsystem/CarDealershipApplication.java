/**
 * Nicholas Dhannie
 * CEN 3024C - Software Development 1
 * March 29, 2024
 * CarDealershipSystemApplication.java
 * This class is what will be about the Car Dealership Management System Software which
 * will be the entry to the JavaFX application. This will load the car-view.fxml file
 * in which we will see the GUI application.
 */

package org.nicholas.guicardealershipsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;

/**
 *
 * This class is what will be about the Car Dealership Management System Software which
 * will be the entry to the JavaFX application. This will load the car-view.fxml file
 * in which we will see the GUI application.
 *
 */
public class CarDealershipApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        //Load the FXML FILE
        FXMLLoader loader = new FXMLLoader(getClass().getResource("car-view.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Car Dealership Management System");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}