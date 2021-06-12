package sample.Algorithm.BucketSort;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Controller {
    //all buttons
    @FXML
    private Button executeButton;
    @FXML
    private Button gobackButton;
    @FXML
    private Button randomButton;

    //all cells
    @FXML
    private Label a1;
    @FXML
    private Label a2;
    @FXML
    private Label a3;
    @FXML
    private Label a4;
    @FXML
    private Label a5;
    @FXML
    private Label a6;
    @FXML
    private Label a7;
    @FXML
    private Label a8;
    @FXML
    private Label a9;
    @FXML
    private Label a10;
    @FXML
    private Label a11;
    @FXML
    private Label a12;
    @FXML
    private Label b1;
    @FXML
    private Label b2;
    @FXML
    private Label b3;
    @FXML
    private Label b4;
    @FXML
    private Label b5;
    @FXML
    private Label b6;
    @FXML
    private Label b7;
    @FXML
    private Label b8;
    @FXML
    private Label b9;
    @FXML
    private Label b10;
    @FXML
    private Label b11;
    @FXML
    private Label b12;
    @FXML
    private Label c1;
    @FXML
    private Label c2;
    @FXML
    private Label c3;
    @FXML
    private Label c4;
    @FXML
    private Label c5;
    @FXML
    private Label c6;
    @FXML
    private Label c7;
    @FXML
    private Label c8;
    @FXML
    private Label c9;
    @FXML
    private Label c10;
    @FXML
    private Label c11;
    @FXML
    private Label c12;
    @FXML
    private Label d1;
    @FXML
    private Label d2;
    @FXML
    private Label d3;
    @FXML
    private Label d4;
    @FXML
    private Label d5;
    @FXML
    private Label d6;
    @FXML
    private Label d7;
    @FXML
    private Label d8;
    @FXML
    private Label d9;
    @FXML
    private Label d10;
    @FXML
    private Label d11;
    @FXML
    private Label d12;
    @FXML
    private Label e1;
    @FXML
    private Label e2;
    @FXML
    private Label e3;
    @FXML
    private Label e4;
    @FXML
    private Label e5;
    @FXML
    private Label e6;
    @FXML
    private Label e7;
    @FXML
    private Label e8;
    @FXML
    private Label e9;
    @FXML
    private Label e10;
    @FXML
    private Label e11;
    @FXML
    private Label e12;
    @FXML
    private Label f1;
    @FXML
    private Label f2;
    @FXML
    private Label f3;
    @FXML
    private Label f4;
    @FXML
    private Label f5;
    @FXML
    private Label f6;
    @FXML
    private Label f7;
    @FXML
    private Label f8;
    @FXML
    private Label f9;
    @FXML
    private Label f10;
    @FXML
    private Label f11;
    @FXML
    private Label f12;

    //all TextField
    @FXML
    private TextField timeField;
    @FXML
    private TextField stepField;
    @FXML
    private TextField swapField;
    @FXML
    private TextField compareField;

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
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
