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

import java.text.DecimalFormat;

public class GPACalculator extends Application {
    FlowPane flowPane = new FlowPane();
    Text textPointsForCourse = new Text("Welcome to my GPA Calculator!");
    Text textCumulativeGPA = new Text("Enter your 1ˢᵗ grade and credit hrs.");
    TextField textFieldCLG = new TextField("");
    TextField textFieldCCH = new TextField("");
    Text textCLG = new Text("Course letter grade:");
    Text textCCH = new Text("Course Credit hours:");
    Button buttonAddGPA = new Button("Add to GPA");
    Button buttonClearGPA = new Button("Clear GPA");
    double GPA;
    double totalCreditHours;
    double totalGradePoints;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("GPA Calculator");
        flowPane.setPadding(new Insets(10, 10, 10, 10));
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        flowPane.setAlignment(Pos.CENTER);

        buttonAddGPA.setOnAction(this::AddGPA);
        buttonClearGPA.setOnAction(this::ClearGPA);

        textFieldCCH.setPrefWidth(50);
        textFieldCCH.setOnAction(this::AddGPA);
        textFieldCLG.setPrefWidth(50);
        textFieldCLG.setOnAction(actionEvent -> textFieldCCH.requestFocus());

        flowPane.getChildren().addAll(
                textCLG, textFieldCLG,
                textCCH, textFieldCCH,
                buttonAddGPA, buttonClearGPA,
                textPointsForCourse,
                textCumulativeGPA);

        primaryStage.setScene(new Scene(flowPane, 210, 190));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void ClearGPA(ActionEvent actionEvent) {
        textCumulativeGPA.setText("Enter your 1ˢᵗ grade and credit hrs.");
        textPointsForCourse.setText("Totals have been reset");
        textFieldCCH.setText("");
        textFieldCLG.setText("");
        totalCreditHours = 0;
        totalGradePoints= 0;
        GPA = 0;
    }
    private void AddGPA(ActionEvent actionEvent) {
        double creditHours = Double.parseDouble(textFieldCCH.getText());
        double gradePoints = 0;
        String letterGrade = textFieldCLG.getText();
        switch (letterGrade.toUpperCase()) {
            case "A+":
                gradePoints = 4.3*creditHours; break;
            case "A":
                gradePoints = 4.0*creditHours; break;
            case "A-":
                gradePoints = 3.7*creditHours; break;
            case "B+":
                gradePoints = 3.3*creditHours; break;
            case "B":
                gradePoints = 3.0*creditHours; break;
            case "B-":
                gradePoints = 2.7*creditHours; break;
            case "C+":
                gradePoints = 2.3*creditHours; break;
            case "C":
                gradePoints = 2.0*creditHours; break;
            case "D":
                gradePoints = 1.0*creditHours; break;
            case "F":
            case "WF":
                gradePoints = 0.0; break;
            default:
                textPointsForCourse.setText("Invalid Grade - GPA not changed");
                break;
        }

        DecimalFormat df = new DecimalFormat("#.0");
        textPointsForCourse.setText("Points for this course: " + df.format(gradePoints));
        totalCreditHours = totalCreditHours + Double.parseDouble(textFieldCCH.getText());
        totalGradePoints = totalGradePoints + gradePoints;
        GPA = totalGradePoints/totalCreditHours;
        textCumulativeGPA.setText("Your cumulative GPA is: " + df.format(GPA));
    }
}