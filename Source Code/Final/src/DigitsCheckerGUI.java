import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;

public class DigitsCheckerGUI extends Application { 
	
	private Button[] buttons = new Button[2];
	private TextField inputField;
	private Text answer;
	
	public void start (Stage primaryStage) {  		
		
		primaryStage.setTitle("Digit Checker"); 
		
		Label fieldLabel = new Label ("Enter an integer to check:");
		inputField = new TextField ();
    	inputField.setPrefWidth (100);
		
		String[] buttonsText = {"Number of Odd Digits?", "Adjacent Duplicate Digits?"};		    
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new Button(buttonsText[i]); 
			// ********** Add ONE line of source code here (inside the for loop):
			buttons[i] = buttons[i].setOnAction(this::processDigitsCheck);
			
		}
		
		answer = new Text ("Ready to help you!");  
  
		FlowPane pane = 
			new FlowPane (fieldLabel, inputField, buttons[0], buttons[1], answer); 
		pane.setAlignment(Pos.CENTER);
    	pane.setHgap (10);
    	pane.setVgap (20);
    	
    	Scene scene = new Scene (pane, 400, 200);
    	
    	// ********** Add TWO lines of source code here (inside the start method):
		primaryStage.setScene(scene);
		primaryStage.show();


	}//end start method


	public void processDigitsCheck (ActionEvent event) { 
		// ********** Complete the body of this processDigitsCheck method:
		// (Add as many lines as you need inside this method.)
		
		
		
		
		
	}//end processDigitsCheck method
							  
}//end class