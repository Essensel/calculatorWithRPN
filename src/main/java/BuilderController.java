import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;


public class BuilderController {

    long numberOne;
    long numberTwo;
    @FXML
    private TextField textField;

    @FXML
    void number(ActionEvent event) {
        int index = event.getSource().toString().length();
        String text = Character.toString(event.getSource().toString().charAt(index - 2));
        String resultText = textField.getText();
        textField.setText(resultText + text);
    }

    @FXML
    void operation(ActionEvent event) {
        if (!textField.getText().equals("")) {
            numberOne = Long.parseLong(textField.getText());
            System.out.println(numberOne);
        }
        int index = event.getSource().toString().length();
        String text = Character.toString(event.getSource().toString().charAt(index - 2));
        textField.setText(text);

    }
    @FXML
    void cleanOperation(ActionEvent event) {
        textField.setText("");
    }
}


