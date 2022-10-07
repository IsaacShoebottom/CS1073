import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * GUI Class
 * @author Isaac Shoebottom (3429069)
 */

public class Driver extends Application {
    FlowPane flowPane = new FlowPane();
    Text textInstructions = new Text("Enter a hex value or English word or phrase:");
    TextField textFieldMain = new TextField("");
    Button buttonH2D= new Button("Hex To Decimal");
    Button buttonE2E = new Button("English to Encrypted");
    Text textResult = new Text("Welcome to the Converter App!");

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Package Calculator");
        flowPane.setPadding(new Insets(10, 10, 10, 10));
        flowPane.setHgap(10);
        flowPane.setVgap(15);
        flowPane.setAlignment(Pos.CENTER);

        buttonH2D.setOnAction(this::calculateHex);
        buttonE2E.setOnAction(this::calculateEncrypted);

        textFieldMain.setPrefWidth(150);

        flowPane.getChildren().addAll(
                textInstructions,
                textFieldMain,
                buttonH2D, buttonE2E,
                textResult
                );

        primaryStage.setScene(new Scene(flowPane, 250, 200));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void calculateHex(ActionEvent actionEvent) {
        long input = Converter.hex2Decimal(textFieldMain.getText());
        if (input == -1) {
            textResult.setText("Invalid input");
        }
        else {
            textResult.setText(Long.toString(input));
        }
    }
    private void calculateEncrypted(ActionEvent actionEvent) {
        textResult.setText(Converter.english2Encrypted(textFieldMain.getText()));
    }
}
