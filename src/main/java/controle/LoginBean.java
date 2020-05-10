package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import entidade.Usuario;

@ManagedBean(name = "LoginBean")
@SessionScoped
public class LoginBean {

//	Usuario usuario = new Usuario();

	// private String usarioAdmin = "admin";
	// private String senhaAdmin = "admin";
	private String cpfAdm = "";
	private String senhaAdm = "";
	private List<Usuario> listaUsuarios;
	private String mensagem;
	private Usuario usuario;

	public LoginBean() {
		this.usuario = new Usuario();
		this.listaUsuarios = new ArrayList<Usuario>();
	}

	public void entrar() throws IOException {

		System.out.println("---------------------");
		System.out.println("Credenciais: " + this.getCpfAdm() + this.getSenhaAdm());

		boolean achou = false;

		for (Usuario usuarioLista : listaUsuarios) {
			if (usuarioLista.getCpf().equals(this.getCpfAdm()) && usuarioLista.getSenha().equals(this.senhaAdm)) {

				achou = true;
				// FacesContext.getCurrentInstance().getExternalContext().redirect(Calculadora);
			}
		}

		if (achou) {
			System.out.println("Achou Usuario!!!");
		} else {
			System.out.println("Não existe Usuario!!, precisa Cadastrar");
		}
	}

	/**
	 * Metodo utilizado para salvar o usuario criado
	 * 
	 * @throws Exception
	 */

	public String salvar() throws Exception {

		Usuario novo = new Usuario();
		// List<Usuario> listaUsuarios = new ArrayList<Usuario>();

		System.out.println("Usuario digitado: " + this.usuario.getCpf() + ", " + this.usuario.getSenha());
		novo.setNome(this.usuario.getNome());
		novo.setCpf(this.usuario.getCpf());
		novo.setSenha(this.usuario.getSenha());

		// this.listaUsuarios.add(getUsuario());

		System.out.println("Usuario cadastrado: " + novo.getCpf() + ", " + novo.getSenha());
		this.listaUsuarios.add(novo);
		System.out.println("Usuario cadastrado2: " + this.listaUsuarios);

		this.usuario = new Usuario();

		return "login.xhtml?faces-redirect=true";

	}

	public void removeBean(String LoginBean) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove(LoginBean);
	}

	public String getCpfAdm() {
		return cpfAdm;
	}

	public void setCpfAdm(String cpfAdm) {
		this.cpfAdm = cpfAdm;
	}

	public String getSenhaAdm() {
		return senhaAdm;
	}

	public void setSenhaAdm(String senhaAdm) {
		this.senhaAdm = senhaAdm;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@PostConstruct
	public void init() {
		this.usuario = new Usuario();
		this.listaUsuarios = new ArrayList<Usuario>();

	}
}
