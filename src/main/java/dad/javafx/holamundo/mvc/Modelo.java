package dad.javafx.holamundo.mvc;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Modelo {
	
	private StringProperty mensaje = new SimpleStringProperty();

	public final StringProperty mensajeProperty() {
		return this.mensaje;
	}	

	public final String getMensaje() {
		return this.mensajeProperty().get();
	}	

	public final void setMensaje(final String mensaje) {
		this.mensajeProperty().set(mensaje);
	}
}
