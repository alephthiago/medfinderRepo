package fiap.login;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {
	private static final long serialVersionUID = -5218684954275557298L;

	private String usuario;
	private String senha;

	public void inicializar() {
		LoginBean login = new LoginBean();
	}
	
	

	public void validaDado(FacesContext context, UIComponent component,
			Object value) {
		String valor = value.toString();
		if (!valor.contains("a")) {
			((UIInput) component).setValid(false);
			FacesMessage message = new FacesMessage(
					"Erro de Consistência Lógica");
			context.addMessage(component.getClientId(context), message);
		}
	}

	public String autorizar() {

		FacesContext fc = FacesContext.getCurrentInstance();
		FacesMessage mensagem = new FacesMessage(
				"Usuário e/ou Senha Inválidos!");
		String retorno = null;

		if (this.usuario.equals(new String("Jefferson"))
				&& this.senha.equals(new String("Senha1"))) {
			retorno = "pesquisaProduto";
		} else {
			if (this.usuario.equals(new String("Admin"))
					&& this.senha.equals(new String("senhaAdm"))) {
				retorno = "pesquisaProduto";
			} else {
				if (this.usuario.equals(new String("Admin1"))
						&& this.senha.equals(new String("fiapA"))) {
					retorno = "pesquisaProduto";
				} else {
					try {
						retorno = "";
						fc.addMessage("", mensagem);

					} catch (NullPointerException e) {
						e.printStackTrace();
					}

				}
			}
		}
		return retorno;
	}

	public String deslogar() {
		FacesContext fc = FacesContext.getCurrentInstance();
		fc.getExternalContext().invalidateSession();
		//fc.getCurrentInstance().getExternalContext().getSessionMap().get("LoginBean");

		return "login";
	}

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

}
