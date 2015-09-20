package de.mathias_muench;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named
@RequestScoped
public class LoginHandler implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String identifikation;
	private String kennwort;

	public String getKennwort() {
		return kennwort;
	}

	public void setKennwort(String kennwort) {
		this.kennwort = kennwort;
	}

	public String getIdentifikation() {
		return identifikation;
	}

	public void setIdentifikation(String identifikation) {
		this.identifikation = identifikation;
	}

	public String submit() {
		renewSession();
		return "session";
	}

	private void renewSession() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		HttpSession session = (HttpSession) externalContext.getSession(false);

		if (session != null) {
			System.err.println("Session before authentication request: " + session.getId());
			session.invalidate();
		}

		session = (HttpSession) externalContext.getSession(true);
		System.err.println("Session after authentication request: " + (session == null ? session : session.getId()));
	}
}
