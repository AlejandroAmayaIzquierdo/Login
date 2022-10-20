package login.session;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import login.db.AuthService;
import login.db.FileAuthService;
import login.db.LdapAuthService;
import login.main.LoginApp;

public class SessionController {
	
	private SessionView view = new SessionView();
	private SessionModel model = new SessionModel();
	
	public SessionController() {
		view.getUserTextField().textProperty().bindBidirectional(model.userNameProperty());
		view.getPassWordTextField().textProperty().bindBidirectional(model.passWordProperty());
		view.getLdapCheackBox().selectedProperty().bindBidirectional(model.ldapProperty());
		
		view.getAccederButton().setOnAction(e -> {
			try {
				onLogin(e);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	}
	
	private void onLogin(ActionEvent e) throws Exception {
		boolean useLdap = model.getLdap();
		
		AuthService auth = useLdap ? new LdapAuthService() : new FileAuthService();
		if(auth.login(model.getUserName().toString(),model.getPassWord().toString())) {
			Alert alert = createAlert(AlertType.INFORMATION, "Acceso permitido", "La credenciales de acceso son válidas.");
			alert.show();
		}else {
			Alert alert = createAlert(AlertType.ERROR, "Acceso denegado", "El usuario y/o la contraseña no son válidos.");
			alert.show();
		}
	}
	public static Alert createAlert(AlertType at,String header,String text) {
		Alert alert = new Alert(at);
		alert.setHeaderText(header);
		alert.setContentText(text);
		alert.initOwner(LoginApp.stage);
		return alert;
		
	}

	public SessionView getView() {
		return view;
	}
	public SessionModel getModel() {
		return model;
	}

}
