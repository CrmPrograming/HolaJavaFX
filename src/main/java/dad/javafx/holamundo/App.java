package dad.javafx.holamundo;

import dad.javafx.holamundo.mvc.Vista;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private Vista view = new Vista();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene escena = new Scene(view, 320, 200);
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Hola Mundo Mejorado");
		primaryStage.show();
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
