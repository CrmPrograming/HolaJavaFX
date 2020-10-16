package dad.javafx.holamundo;

import dad.javafx.holamundo.mvc.Controlador;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private Controlador controller = new Controlador();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new Controlador();
		
		Scene escena = new Scene(controller.getView(), 320, 200);
		
		Stage stage = new Stage();
		stage.setTitle("Hola Mundo Mejorado");
		stage.setScene(escena);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
