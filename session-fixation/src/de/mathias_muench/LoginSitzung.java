package de.mathias_muench;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class LoginSitzung implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String identifikation;

	public String getIdentifikation() {
		return identifikation;
	}

	public void setIdentifikation(String identifikation) {
		this.identifikation = identifikation;
	}
}
