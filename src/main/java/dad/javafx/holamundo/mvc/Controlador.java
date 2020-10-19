package dad.javafx.holamundo.mvc;

import javafx.event.ActionEvent;

public class Controlador {
	
	private Vista view = new Vista();
	private Modelo model = new Modelo();
	
	public Controlador() {
		model.setMensaje("Aquí saldrá el saludo");
		
		model.saludoProperty().bind(view.getTfSaludo().textProperty());
		view.getLbMensaje().textProperty().bind(model.mensajeProperty());
		
		view.getBtSaludar().setOnAction(e -> onSaludarAction(e));
	}
	
	private void onSaludarAction(ActionEvent e) {
		if (model.saludoProperty().getValue().equals("")) {
			model.setMensaje("Aquí saldrá el saludo");
			view.getLbMensaje().setStyle("");
		} else {
			model.setMensaje("¡Hola " + model.getSaludo() + "!");
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
