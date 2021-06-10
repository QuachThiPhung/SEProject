package sample.Algorithm.QuickSort;

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
    //all rectangle
    @FXML
    private Rectangle pillar1;
    @FXML
    private Rectangle pillar2;
    @FXML
    private Rectangle pillar3;
    @FXML
    private Rectangle pillar4;
    @FXML
    private Rectangle pillar5;
    @FXML
    private Rectangle pillar6;
    @FXML
    private Rectangle pillar7;
    @FXML
    private Rectangle pillar8;
    @FXML
    private Rectangle pillar9;
    @FXML
    private Rectangle pillar10;
    @FXML
    private Rectangle pillar11;
    @FXML
    private Rectangle pillar12;
    @FXML
    private Rectangle pillar13;
    @FXML
    private Rectangle pillar14;
    @FXML
    private Rectangle pillar15;
    @FXML
    private Rectangle pillar16;
    @FXML
    private Rectangle pillar17;
    @FXML
    private Rectangle pillar18;
    @FXML
    private Rectangle pillar19;
    @FXML
    private Rectangle pillar20;
    @FXML
    private Rectangle pillar21;
    @FXML
    private Rectangle pillar22;
    @FXML
    private Rectangle pillar23;
    @FXML
    private Rectangle pillar24;
    @FXML
    private Rectangle pillar25;
    @FXML
    private Rectangle pillar26;
    @FXML
    private Rectangle pillar27;
    @FXML
    private Rectangle pillar28;
    @FXML
    private Rectangle pillar29;
    @FXML
    private Rectangle pillar30;
    @FXML
    private Rectangle pillar31;
    @FXML
    private Rectangle pillar32;
    @FXML
    private Rectangle pillar33;
    @FXML
    private Rectangle pillar34;
    @FXML
    private Rectangle pillar35;
    @FXML
    private Rectangle pillar36;
    @FXML
    private Rectangle pillar37;
    @FXML
    private Rectangle pillar38;
    @FXML
    private Rectangle pillar39;
    @FXML
    private Rectangle pillar40;
    @FXML
    private Rectangle pillar41;
    @FXML
    private Rectangle pillar42;
    @FXML
    private Rectangle pillar43;
    @FXML
    private Rectangle pillar44;
    @FXML
    private Rectangle pillar45;
    @FXML
    private Rectangle pillar46;
    @FXML
    private Rectangle pillar47;
    @FXML
    private Rectangle pillar48;
    @FXML
    private Rectangle pillar49;
    @FXML
    private Rectangle pillar50;
    @FXML
    private Rectangle pillar51;
    @FXML
    private Rectangle pillar52;
    @FXML
    private Rectangle pillar53;

    //all Buttons
    @FXML
    private Button executeButton;
    @FXML
    private Button randomizeButton;
    @FXML
    private Button returnButton;

    //all Textfield
    @FXML
    private TextField compareField;
    @FXML
    private TextField swapField;
    @FXML
    private TextField timeField;
    @FXML
    private TextField stepField;
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
