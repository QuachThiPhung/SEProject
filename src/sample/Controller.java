package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button BS;

    @FXML
    private Button RS;

    @FXML
    private AnchorPane backScene2;

    @FXML
    private Button QS;

    @FXML
    private AnchorPane backScene1;

    @FXML
    private AnchorPane scenePane;

    @FXML
    private Button MS;

    @FXML
    private Button IS;

    @FXML
    private Button HS;

    @FXML
    private ImageView exitButtonImage;

    //Designed exit button
    Stage stage;
    @FXML
    public void exitMenu() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You are about to exit!");
        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePane.getScene().getWindow();
            stage.close();
        }
    }

    @FXML
    void MSScene(ActionEvent event) {
        try {
            Parent MSroot = FXMLLoader.load(getClass().getClassLoader().getResource("sample/Algorithm/MergeSort/MS.fxml"));
            Scene MSscene = new Scene(MSroot);
            Stage MSstage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            //RNstage.setTitle("RN");
            MSstage.setScene(MSscene);
            MSstage.centerOnScreen();
            MSstage.show();
            MSscene.getStylesheets().add("sample/Algorithm/style.css");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void HSscene(ActionEvent event) {
        try {
            Parent HSroot = FXMLLoader.load(getClass().getClassLoader().getResource("sample/Algorithm/HeapSort/HS.fxml"));
            Scene HSscene = new Scene(HSroot);
            Stage HSstage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            //HSstage.setTitle("HS");
            HSstage.setScene(HSscene);
            HSstage.centerOnScreen();
            HSstage.show();
            HSscene.getStylesheets().add("sample/Algorithm/style.css");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void BSscene(ActionEvent event) {
        try {
            Parent BSroot = FXMLLoader.load(getClass().getClassLoader().getResource("sample/Algorithm/BucketSort/BS.fxml"));
            Scene BSscene = new Scene(BSroot);
            Stage BSstage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            //BSstage.setTitle("BS");
            BSstage.setScene(BSscene);
            BSstage.centerOnScreen();
            BSstage.show();
            BSscene.getStylesheets().add("sample/Algorithm/style.css");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void RSscene(ActionEvent event) {
        try {
            Parent RNroot = FXMLLoader.load(getClass().getClassLoader().getResource("sample/Algorithm/RadixSort/RS.fxml"));
            Scene RNscene = new Scene(RNroot);
            Stage RNstage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            //RSstage.setTitle("RS");
            RNstage.setScene(RNscene);
            RNstage.centerOnScreen();
            RNstage.show();
            RNscene.getStylesheets().add("sample/Algorithm/style.css");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void QSscene(ActionEvent event) {
        try {
            Parent QSroot = FXMLLoader.load(getClass().getClassLoader().getResource("sample/Algorithm/QuickSort/QS.fxml"));
            Scene QSscene = new Scene(QSroot);
            Stage QSstage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            //QSstage.setTitle("QS");
            QSstage.setScene(QSscene);
            QSstage.centerOnScreen();
            QSstage.show();
            QSscene.getStylesheets().add("sample/Algorithm/style.css");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void ISscene(ActionEvent event) {
        try {
            Parent ISroot = FXMLLoader.load(getClass().getClassLoader().getResource("sample/Algorithm/InsertionSort/IS.fxml"));
            Scene ISscene = new Scene(ISroot);
            Stage ISstage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            //ISstage.setTitle("IS");
            ISstage.setScene(ISscene);
            ISstage.centerOnScreen();
            ISstage.show();
            ISscene.getStylesheets().add("sample/Algorithm/style.css");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
