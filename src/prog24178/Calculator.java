package prog24178;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Calculator {
	@FXML TextField txtV1,txtV2;
	@FXML Button btMultiply,btAdd,btDivide,btSubtract;
	@FXML Label lblResult;
	
	@FXML
	public void doMultiply(ActionEvent e) {
		double aaa = Double.parseDouble(txtV1.getText());
		double bbb = Double.parseDouble(txtV2.getText());

		//to get the name of button in result
		Button btnClicked = (Button)e.getSource();
		//to remove mnemonics '_' in result
		String ddd = btnClicked.getText().substring(1);
		
		double ccc=aaa*bbb;
		lblResult.setText("the " + ddd + " of "+ aaa + " and "+ bbb + " is " + ccc);
	}
	
	@FXML
	public void doAdd(ActionEvent e) {
		double aaa = Double.parseDouble(txtV1.getText());
		double bbb = Double.parseDouble(txtV2.getText());

		//to get the name of button in result
		Button btnClicked = (Button)e.getSource();
		//to remove mnemonics '_' in result
		String ddd = btnClicked.getText().substring(1);
		
		double ccc=aaa+bbb;
		lblResult.setText("the "+ ddd + " of "+ aaa + " and "+ bbb + " is " + ccc);
	}
	
	@FXML
	public void doDivide(ActionEvent e) {
		double aaa = Double.parseDouble(txtV1.getText());
		double bbb = Double.parseDouble(txtV2.getText());

		//to get the name of button in result
		Button btnClicked = (Button)e.getSource();
		//to remove mnemonics '_' in result
		String ddd = btnClicked.getText().substring(1);
		
		double ccc=aaa/bbb;
		lblResult.setText("the "+ ddd + " of "+ aaa + " and "+ bbb + " is " + ccc);
	}
	
	@FXML
	public void doSubtract(ActionEvent e) {
		double aaa = Double.parseDouble(txtV1.getText());
		double bbb = Double.parseDouble(txtV2.getText());

		//to get the name of button in result
		Button btnClicked = (Button)e.getSource();
		//to remove mnemonics '_' in result
		String ddd = btnClicked.getText().substring(1);
		
		double ccc=aaa-bbb;
		lblResult.setText("the " + ddd + " of "+ aaa + " and "+ bbb + " is " + ccc);
	}
	
}
