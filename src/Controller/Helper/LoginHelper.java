/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Usuario;
import View.Login;

/**
 *
 * @author canelamah
 */
public class LoginHelper {
    private final Login View;
    public LoginHelper(Login View){
    this.View = View;
    }
    public Usuario ObterModelo(){
       String nome = View.getTextUsuario().getText();
        String senha = View.getTextSenha().getText();
        Usuario modelo = new Usuario(0,nome,senha);
        return modelo;
    }
    public void SetarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        View.getTextUsuario().setText(nome);
        View.getTextSenha().setText(senha);
    }
    public void Limpar(){
    View.getTextUsuario().setText("");
    View.getTextSenha().setText("");
    }
}

