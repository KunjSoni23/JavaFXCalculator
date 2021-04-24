package prog24178;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Task2 extends javafx.application.Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage ps) throws Exception {
		// TODO Auto-generated method stub
		URL url = this.getClass().getResource("Calculator.fxml");
		Parent root = FXMLLoader.load(url);
		Scene scene = new Scene(root);
		ps.setScene(scene);
		ps.setTitle("Calculator");
		ps.show();
	}

}
