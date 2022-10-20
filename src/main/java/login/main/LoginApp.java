package login.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.session.SessionController;
import login.session.SessionView;

public class LoginApp extends Application {
	
	public static Stage stage;

	@Override
	public void start(Stage stage) throws Exception {
		
		this.stage = stage;
		
		SessionController sessionController = new SessionController();
		
		stage.setTitle("Modificar");
		stage.setScene(new Scene(sessionController.getView(),400,250));
		stage.show();
		
		
//		sessionController.getModel().userNameProperty().addListener((o,ov,on) -> System.out.println(on));
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
