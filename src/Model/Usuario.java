/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author canelamah
 */
public class Usuario extends Pessoa {
    protected String Senha;
    protected String NivelAcesso;

    public Usuario(int id, String Nome,String Senha) {
        super(id, Nome);
        this.Senha = Senha;
    }

    public Usuario(int id, String Nome, char Sexo, String DataNascimento, String Telefone, String Email, String RG, String Senha, String NivelAcesso) {
        super(id, Nome, Sexo, DataNascimento, Telefone, Email, RG);
        this.Senha = Senha;
        this.NivelAcesso = NivelAcesso;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getNivelAcesso() {
        return NivelAcesso;
    }

    public void setNivelAcesso(String NivelAcesso) {
        this.NivelAcesso = NivelAcesso;
    }
   

    
    }

