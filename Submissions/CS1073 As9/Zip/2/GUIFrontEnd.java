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

public class GUIFrontEnd extends Application {
    FlowPane flowPane = new FlowPane();
    Text textBuildingNumber = new Text("Welcome to Paradise Palms!");
    Text textTotalCost = new Text("Enter your booking information.");
    TextField textFieldName = new TextField("");
    TextField textFieldALCM = new TextField("");
    TextField textFieldNSV = new TextField("");
    Text textName = new Text("Guest Name:");
    Text textALCM = new Text("Number of \u00E0 la Carte Meals:");
    Text textNSV = new Text("Number of Spa Visits:");
    Button buttonTourist = new Button("Tourist");
    Button buttonElite = new Button("Elite");
    Button buttonReset = new Button("Reset");

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

        buttonElite.setOnAction(this::calculateElite);
        buttonTourist.setOnAction(this::calculateTourist);
        buttonReset.setOnAction(this::reset);

        textFieldName.setPrefWidth(120);
        textFieldALCM.setPrefWidth(50);
        textFieldNSV.setPrefWidth(50);

        flowPane.getChildren().addAll(
                textName, textFieldName,
                textALCM, textFieldALCM,
                textNSV, textFieldNSV,
                buttonTourist, buttonElite, buttonReset,
                textBuildingNumber,
                textTotalCost);

        primaryStage.setScene(new Scene(flowPane, 220, 250));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void calculateElite(ActionEvent actionEvent) {
        ElitePackageBooking tourist = new ElitePackageBooking(Long.parseLong(textFieldALCM.getText()), Long.parseLong(textFieldNSV.getText()));
        ResortBooking resort = new ResortBooking(tourist, textFieldName.getText());
        textBuildingNumber.setText(resort.getBuildingNumber(tourist));
        textTotalCost.setText(resort.getTotalCost(tourist));

    }
    private void calculateTourist(ActionEvent actionEvent) {
        TouristPackageBooking tourist = new TouristPackageBooking(Long.parseLong(textFieldALCM.getText()), Long.parseLong(textFieldNSV.getText()));
        ResortBooking resort = new ResortBooking(tourist, textFieldName.getText());
        textBuildingNumber.setText(resort.getBuildingNumber(tourist));
        textTotalCost.setText(resort.getTotalCost(tourist));
    }
    private void reset(ActionEvent actionEvent) {
        textFieldName.setText("");
        textFieldALCM.setText("");
        textFieldNSV.setText("");
        textBuildingNumber.setText("Welcome to Paradise Palms!");
        textTotalCost.setText("Enter your booking information.");
    }
}