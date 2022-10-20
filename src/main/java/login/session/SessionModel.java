package login.session;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SessionModel {
	
	private StringProperty userName = new SimpleStringProperty();
	private StringProperty passWord = new SimpleStringProperty();
	private BooleanProperty ldap = new SimpleBooleanProperty();
	public final StringProperty userNameProperty() {
		return this.userName;
	}
	
	public final String getUserName() {
		return this.userNameProperty().get();
	}
	
	public final void setUserName(final String userName) {
		this.userNameProperty().set(userName);
	}
	
	
	public final StringProperty passWordProperty() {
		return this.passWord;
	}
	
	public final String getPassWord() {
		return this.passWordProperty().get();
	}
	
	public final void setPassWord(final String passWord) {
		this.passWordProperty().set(passWord);
	}
	
	public final BooleanProperty ldapProperty() {
		return this.ldap;
	}
	
	public final boolean getLdap() {
		return this.ldapProperty().get();
	}
	
	public final void setLdap(final boolean ldap) {
		this.ldapProperty().set(ldap);
	}
	
	

}
