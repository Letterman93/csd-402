import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Module 11.2 JavaFX Example
 *
 * Demonstrates two JavaFX layout panes:
 * 1. GridPane - organizes form controls into rows and columns.
 * 2. HBox - organizes action buttons in a horizontal row.
 *
 * The program creates a simple student registration form.
 */
public class JavaFXLayoutExample extends Application {

    @Override
    public void start(Stage stage) {

        // -----------------------------
        // GridPane Example
        // -----------------------------

        // GridPane arranges controls in rows and columns.
        GridPane formGrid = new GridPane();

        // Horizontal and vertical spacing between grid cells.
        formGrid.setHgap(10);
        formGrid.setVgap(10);

        // Adds space around the outside of the GridPane.
        formGrid.setPadding(new Insets(20));

        // Create labels and text fields for the form.
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Label majorLabel = new Label("Major:");
        TextField majorField = new TextField();

        // Add each control to the GridPane using column and row positions.
        // Column 0 contains labels; column 1 contains input fields.
        formGrid.add(nameLabel, 0, 0);
        formGrid.add(nameField, 1, 0);

        formGrid.add(emailLabel, 0, 1);
        formGrid.add(emailField, 1, 1);

        formGrid.add(majorLabel, 0, 2);
        formGrid.add(majorField, 1, 2);

        // -----------------------------
        // HBox Example
        // -----------------------------

        Button submitButton = new Button("Submit");
        Button clearButton = new Button("Clear");

        // HBox arranges its child controls horizontally.
        // The constructor value creates 10 pixels of spacing.
        HBox buttonBox = new HBox(10);

        // Align the buttons to the right side of the HBox.
        buttonBox.setAlignment(Pos.CENTER_RIGHT);

        // Add both buttons to the HBox.
        buttonBox.getChildren().addAll(submitButton, clearButton);

        // Add the HBox to the GridPane.
        // It begins in column 1 on row 3.
        formGrid.add(buttonBox, 1, 3);

        // -----------------------------
        // Button Actions
        // -----------------------------

        // Displays the entered student information in the console.
        submitButton.setOnAction(event -> {
            System.out.println("Student Registration");
            System.out.println("Name: " + nameField.getText());
            System.out.println("Email: " + emailField.getText());
            System.out.println("Major: " + majorField.getText());
        });

        // Clears all form fields.
        clearButton.setOnAction(event -> {
            nameField.clear();
            emailField.clear();
            majorField.clear();
        });

        // Create the scene and display the application window.
        Scene scene = new Scene(formGrid, 420, 230);
        stage.setTitle("Student Registration");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Launches the JavaFX application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
