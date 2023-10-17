/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author canelamah
 */
public class LoginController {

    private final Login View;
    private LoginHelper Helper;

    public LoginController(Login View) {
        this.View = View;
        this.Helper = new LoginHelper(View);
    }
    public void entrar(){
     Usuario usuario = Helper.ObterModelo();
     UsuarioDAO usuarioDAO = new UsuarioDAO();
     Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
    
    if (usuarioAutenticado != null){
    MenuPrincipal menu = new MenuPrincipal();
    menu.setVisible(true);
    this.View.dispose();
    }else{
    View.exibirmsg("Usuario ou senha invalidos");
    }
    }
    public void tarefa (){
    System.out.println("busquei no banco de dados");
    this.View.exibirmsg("Executei tarefa");
    }
}
