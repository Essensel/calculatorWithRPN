import javafx.fxml.FXML;
import javafx.event.ActionEvent;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;


public class BuilderController {
    private CulcModel culcModel = new CulcModel();
    private Double numberOne;
    private Double numberTwo;
    private String numOneSt = "";
    private String numTwoSt = "";
    String operationSymbol = "";
    String curentResult = "";

    @FXML
    private TextField textField;
    @FXML
    private TextField curentTextField;

    @FXML
    void number(ActionEvent event) {

        String resultText = textField.getText();
        int index = event.getSource().toString().length();
        String text = Character.toString(event.getSource().toString().charAt(index - 2));

        if ((!resultText.contains("+")) & (!resultText.contains("-")) & (!resultText.contains("/")) & (!resultText.contains("X"))) {
            textField.setText(resultText + text);
        } else {
            textField.setText(text);
        }
        if (!numOneSt.equals("") && !operationSymbol.equals("")) {
            Double result;
            numTwoSt = textField.getText();
            numberOne = Double.parseDouble(numOneSt);
            numberTwo = Double.parseDouble(numTwoSt);
            result = culcModel.mathOperation(numberOne, numberTwo, operationSymbol);
            curentResult = result.toString();
            curentTextField.setText(curentResult);
        }
    }

    @FXML
    void operation(ActionEvent event) {

        String resultText = textField.getText();
        if(curentResult.equals("")){
        if (numOneSt.equals("")) {
            numOneSt = resultText;
        } else {
            numTwoSt = resultText;
        }} else {
            numOneSt = curentResult;
        }

        if ((!resultText.equals("")) & (!resultText.contains("-")) & (!resultText.contains("+")) & (!resultText.contains("/")) & (!resultText.contains("X"))) {
            int index = event.getSource().toString().length();
            String text = Character.toString(event.getSource().toString().charAt(index - 2));
            textField.setText(text);
            operationSymbol = text;
            curentTextField.setText(numOneSt + " " + operationSymbol);
        }
    }

    @FXML
    void cleanOperation(ActionEvent event) {
        textField.setText("");
        curentTextField.setText("");
        numberOne=0.0;
        numberTwo=0.0;
         numOneSt = "";
         numTwoSt = "";
       operationSymbol = "";
       curentResult = "";
    }
}


