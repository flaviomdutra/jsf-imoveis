package br.com.fiapon.imoveis.bean;

import java.io.Serializable;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LinguagemBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Locale locale;
	
	@PostConstruct
	private void init(){
		locale = FacesContext.getCurrentInstance().getViewRoot()
			.getLocale();
	}

	public void mudarParaIngles() {
		FacesContext context = FacesContext.getCurrentInstance();
		UIViewRoot view = context.getViewRoot();
		locale = Locale.ENGLISH;
		view.setLocale(locale);
	}

	public void mudarParaPortugues() {

		FacesContext context = FacesContext.getCurrentInstance();
		UIViewRoot view = context.getViewRoot();
		locale = new Locale("pt", "BR");
		view.setLocale(locale);
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}
}