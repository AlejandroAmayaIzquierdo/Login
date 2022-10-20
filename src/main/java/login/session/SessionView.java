package login.session;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class SessionView extends GridPane {
	
	private TextField userTextField;
	
	private PasswordField passWordField;

	private CheckBox LdapCheackBox = new CheckBox("Usar LDAP");
	
	private Button accederButton = new Button("Acceder");
	private Button cancelarButton = new Button("Cancelar");
	
	public SessionView() {
		super();
		
		
		userTextField = new TextField();
		userTextField.setPromptText("Nombre de usuario");
		
		
		passWordField = new PasswordField();
		passWordField.setPromptText("Contraseña del usuario");
		
		accederButton.setDefaultButton(true);
		
		this.setAlignment(Pos.CENTER);
		
		this.setVgap(5);
		this.setHgap(5);
		this.setPadding(new Insets(5));
		this.setAlignment(Pos.CENTER);
//		this.setGridLinesVisible(true);
		
		this.addRow(0, new Label("Usuario: "), userTextField);
		this.addRow(1, new Label("Contraseña: "), passWordField);
		this.addRow(2, LdapCheackBox);
		HBox buttonsHBox = new HBox(accederButton,cancelarButton);
		buttonsHBox.setSpacing(5);
		buttonsHBox.setAlignment(Pos.CENTER);
		buttonsHBox.setFillHeight(false);
		buttonsHBox.setPadding(new Insets(5));
		this.addRow(3, buttonsHBox);
		
		
		GridPane.setHalignment(LdapCheackBox, HPos.CENTER);
		GridPane.setColumnSpan(LdapCheackBox, 2);
		GridPane.setColumnSpan(buttonsHBox, 2);
		
	}
	public TextField getUserTextField() {
		return userTextField;
	}

	public PasswordField getPassWordTextField() {
		return passWordField;
	}

	public CheckBox getLdapCheackBox() {
		return LdapCheackBox;
	}

	public Button getAccederButton() {
		return accederButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}

}
