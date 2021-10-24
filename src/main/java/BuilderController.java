

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextField;


public class BuilderController {
    private CulcModel culcModel = new CulcModel();
    private String operationSymbol = "";
    private String curentResult = "";
    private boolean haveResult = false;

    @FXML
    private TextField textField;

    protected String getButtonText(ActionEvent event) {
        String resultText = textField.getText();
        int index = event.getSource().toString().length();
        String text = Character.toString(event.getSource().toString().charAt(index - 2));
        return text;
    }

    @FXML
    void number(ActionEvent event) {
        String resultText = textField.getText();
        String text = getButtonText(event);
        if (!haveResult) {
            if (resultText.equals("")) {
                textField.setText(text);
            } else {
                textField.setText(resultText + text);
            }
            haveResult = false;
        } else {
            textField.setText(text);
            haveResult = false;
        }
    }

    @FXML
    void operation(ActionEvent event) {
        haveResult = false;
        String resultText = textField.getText();

        String text = getButtonText(event);
        if (!resultText.equals("")) {
            char lastElement = resultText.charAt(resultText.length() - 1);
            String lastStringElement = Character.toString(lastElement);
            if (!lastStringElement.equals("+") && !lastStringElement.equals("*") && !lastStringElement.equals("/") && !lastStringElement.equals("-")) {
                textField.setText(resultText + text);
            } else if ((lastStringElement.equals("/") || lastStringElement.equals("*")) && resultText.length() > 2) {
                if (text.equals("-")) {
                    textField.setText(resultText + text);
                }
            }
        } else {
            if (text.equals("-")) {
                textField.setText(resultText + text);
            }
        }
    }

    @FXML
    void cleanOperation(ActionEvent event) {
        textField.setText("");
        operationSymbol = "";
        curentResult = "";
    }

    @FXML
    void result(ActionEvent event) {
        String resultText = textField.getText();
        if (!resultText.equals("")) {
            char lastElement = resultText.charAt(resultText.length() - 1);
            String lastStringElement = Character.toString(lastElement);
            if (!lastStringElement.equals("+") && !lastStringElement.equals("*") && !lastStringElement.equals("/") && !lastStringElement.equals("-") && !lastStringElement.equals(".")) {
                String result = culcModel.getResult(textField.getText());
                textField.setText(result);
                haveResult = true;
            }
        }
    }

    @FXML
    void cleanOneSymbol(ActionEvent event) {
        String resultText = textField.getText();
        if (!resultText.equals("")) {
            textField.setText(resultText.substring(0, resultText.length() - 1));
        }

    }

    @FXML
    void addFraction(ActionEvent event) {
        String resultText = textField.getText();
        if (!resultText.equals("")) {
            char lastElement = resultText.charAt(resultText.length() - 1);
            String lastStringElement = Character.toString(lastElement);
            if (!lastStringElement.equals("+") && !lastStringElement.equals("*") && !lastStringElement.equals("/") && !lastStringElement.equals("-") && !lastStringElement.equals(".")) {

                String text = getButtonText(event);
                textField.setText(resultText + text);
            }
        }
    }
}


