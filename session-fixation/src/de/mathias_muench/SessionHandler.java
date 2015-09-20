package de.mathias_muench;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class SessionHandler implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private LoginSitzung sitzung;

	public LoginSitzung getSitzung() {
		return sitzung;
	}

	public void setSitzung(LoginSitzung sitzung) {
		this.sitzung = sitzung;
	}

	public String getIdentifikation() {
		return sitzung.getIdentifikation();
	}

	public void viewAction(String identification) {
		sitzung.setIdentifikation(identification);
	}
}
