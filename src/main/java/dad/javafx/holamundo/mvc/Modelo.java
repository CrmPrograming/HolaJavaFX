package dad.javafx.holamundo.mvc;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Modelo {
	
	private StringProperty saludo = new SimpleStringProperty();
	private StringProperty mensaje = new SimpleStringProperty();

	public final StringProperty saludoProperty() {
		return this.saludo;
	}
	

	public final String getSaludo() {
		return this.saludoProperty().get();
	}
	

	public final void setSaludo(final String saludo) {
		this.saludoProperty().set(saludo);
	}
	
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
