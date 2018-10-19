package application;



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginController implements Initializable{
	
	@FXML
	private AnchorPane pane;
	
	
	@FXML
	private TextField text=null;
	
	@FXML
	private TextField pwd=null;
	
	@FXML
	private Label user=null;
	
	@FXML
	private Label status=null;
	
	
	
	public void Login(ActionEvent event)
	{
		System.out.println(text.getText()+" "+pwd.getText());
		
		if(text.getText().equals("Kanmani") && pwd.getText().equals("test")) {
		user.setText(text.getText());
		status.setText("Hii");
		}
		else
		{
			status.setText("");
			user.setText("U have entered wrong password or incorrect username");
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	

}
