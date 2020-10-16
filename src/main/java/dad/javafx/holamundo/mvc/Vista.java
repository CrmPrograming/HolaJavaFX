package dad.javafx.holamundo.mvc;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Vista extends VBox {
	
	private TextField tfSaludo;
	private Button btSaludar;
	private Label lbMensaje;
	
	public Vista() {
		super();
		
		tfSaludo = new TextField();
		
		btSaludar = new Button("Saludar");
		btSaludar.setDefaultButton(true);
		
		lbMensaje = new Label("Aquí saldrá el saludo");
		
		this.setSpacing(5);
		this.setFillWidth(false);
		this.getChildren().addAll(tfSaludo, btSaludar, lbMensaje);
		this.setAlignment(Pos.CENTER);
	}

	public TextField getTfSaludo() {
		return tfSaludo;
	}

	public Button getBtSaludar() {
		return btSaludar;
	}

	public Label getLbMensaje() {
		return lbMensaje;
	}

}
