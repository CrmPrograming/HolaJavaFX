package dad.javafx.holamundo.mvc;

import javafx.event.ActionEvent;

public class Controlador {
	
	private Vista view = new Vista();
	private Modelo model = new Modelo();
	
	public Controlador() {
		model.mensajeProperty().set("Aquí saldrá el saludo");
		
		model.saludoProperty().bind(view.getTfSaludo().textProperty());
		view.getLbMensaje().textProperty().bind(model.mensajeProperty());
		
		view.getBtSaludar().setOnAction(e -> onSaludarAction(e));
	}
	
	private void onSaludarAction(ActionEvent e) {
		if (model.saludoProperty().getValue().equals("")) {
			model.mensajeProperty().setValue("Aquí saldrá el saludo");
			view.getLbMensaje().setStyle("");
		} else {
			model.mensajeProperty().setValue("¡Hola " + model.saludoProperty().getValue() + "!");
			view.getLbMensaje().setStyle("-fx-text-fill: blue; -fx-font: italic bold 30 sans-serif;");
		}
	}

	public Vista getView() {
		return view;
	}

	public Modelo getModel() {
		return model;
	}

}
