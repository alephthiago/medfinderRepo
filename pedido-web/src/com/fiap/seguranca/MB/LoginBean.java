package com.fiap.seguranca.MB;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {
	
	private String usuario;
	private String senha;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void validaDado(FacesContext context, UIComponent component, Object value) {
		String valor = value.toString();
		if (!valor.contains("a")) { //* qualquer validação lógica
			((UIInput)component).setValid(false);
			FacesMessage message = new FacesMessage("Erro de Consistência Lógica");
			context.addMessage(component.getClientId(context), message);
		}
	}
	
	public String logar() {
		
		String retorno;
		
		FacesContext fc = FacesContext.getCurrentInstance();
		FacesMessage mensagem = new FacesMessage("Usuário e/ou Senha Inválidos!");
		
		if(usuario.equals("Usuario") && senha.equals("senha")) {
			retorno = "emissaoPedido";
		} else {
//			retorno = "falhaLogin";
			retorno = "";
			fc.addMessage("", mensagem);
		}
		return retorno;
	}
}