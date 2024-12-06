package org.example.glider2;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ForgotPasswordController {
    @FXML
    private TextField enterusername;

    @FXML
    private TextField securityQuestionField;

    @FXML
    private TextField securityAnswerField;

    @FXML
    private void handleSubmit() {
        String username = enterusername.getText();
        String securityQuestion = securityQuestionField.getText();
        String securityAnswer = securityAnswerField.getText();

        // Validate inputs
        if (username.isEmpty() || securityQuestion.isEmpty() || securityAnswer.isEmpty()) {
            showAlert("Error", "All fields must be filled out.");
            return;
        }


        if (username.equals("testuser") && securityQuestion.equalsIgnoreCase("What is your pet's name") &&
                securityAnswer.equalsIgnoreCase("Charlie")) {
            showAlert("Success", "Password recovery successful! Please check your email.");
        } else {
            showAlert("Error", "Invalid details provided. Please try again.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
