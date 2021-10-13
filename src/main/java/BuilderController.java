import javafx.fxml.FXML;
 import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BuilderController {

    @FXML
    private Button multiButton;

    @FXML
    private Button resullButton;

    @FXML
    private Button zeroNumber;

    @FXML
    private Button cleanButton;

    @FXML
    private Button fiveNumber;

    @FXML
    private Button sixNumber;

    @FXML
    private Button twoNumber;

    @FXML
    private TextField textField;

    @FXML
    private Button oneNumber;

    @FXML
    private Button nineNumber;

    @FXML
    private Button plusButton;

    @FXML
    private Button fourNumber;

    @FXML
    private Button sevenNumber;

    @FXML
    private Button eightNumber;

    @FXML
    private Button minButton;

    @FXML
    private Button threeNumber;

    @FXML
    private Button splitButton;

    @FXML
    void num1(ActionEvent event) {
String currentText = textField.getText();
textField.setText(currentText +"1");
    }

    @FXML
    void num2(ActionEvent event) {
        String currentText = textField.getText();
        textField.setText(currentText +"2");
    }

    @FXML
    void num3(ActionEvent event) {
        String currentText = textField.getText();
        textField.setText(currentText +"3");
    }


    @FXML
    void num4(ActionEvent event) {
        String currentText = textField.getText();
        textField.setText(currentText +"4");
    }

    @FXML
    void num5(ActionEvent event) {
        String currentText = textField.getText();
        textField.setText(currentText +"5");
    }

    @FXML
    void num6(ActionEvent event) {
        String currentText = textField.getText();
        textField.setText(currentText +"6");
    }

    @FXML
    void num7(ActionEvent event) {
        String currentText = textField.getText();
        textField.setText(currentText +"7");
    }

    @FXML
    void num8(ActionEvent event) {
        String currentText = textField.getText();
        textField.setText(currentText +"8");
    }

    @FXML
    void num9(ActionEvent event) {
        String currentText = textField.getText();
        textField.setText(currentText +"9");
    }

    @FXML
    void num10(ActionEvent event) {
        String currentText = textField.getText();
        textField.setText(currentText +"0");
    }
    @FXML
    void plusOperation(ActionEvent event) {

    }
    @FXML
    void minusOperation(ActionEvent event) {

    }


    @FXML
    void multiOperation(ActionEvent event) {

    }

    @FXML
    void resulltOperation(ActionEvent event) {

    }

    @FXML
    void cleanOperation(ActionEvent event) {
textField.setText("");
    }


    @FXML
    void splitOperation(ActionEvent event) {

    }

}
