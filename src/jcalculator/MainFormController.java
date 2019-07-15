package jcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainFormController {
    private Expression expression;

    public MainFormController() {
        expression = new Expression();
    }

    @FXML
    private TextField inputTextField;

    @FXML
    private Button calculateButton;

    @FXML
    private TextArea outputTextArea;

    @FXML
    void onButtonClick(ActionEvent event) {
        try {
            String input = inputTextField.getText();
            String text = expression.execute(input);
            outputTextArea.setText(text);
        } catch (Exception e) {
            outputTextArea.setText(e.getMessage());
        }
    }

}
