package sample.Algorithm.BucketSort;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button executeButton;

    @FXML
    private TextField timeField;

    @FXML
    private TextField swapField;

    @FXML
    private TextField stepField;

    @FXML
    private TextField compareField;

    @FXML
    private Button returnButton;

    @FXML
    private Button randomizeButton;

    @FXML
    void randomize(ActionEvent event) {

    }

    @FXML
    void execute(ActionEvent event) {

    }

    @FXML
    void goBack(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/sample.fxml"));
            Scene scene = new Scene(root);
            scene.setFill(Color.TRANSPARENT);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
