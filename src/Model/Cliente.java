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
public class Cliente extends Pessoa {

    private String endereco;

    public Cliente(int id, String Nome, char Sexo, String DataNascimento, String Telefone, String Email, String RG, String endereco) {
        super(id, Nome, Sexo, DataNascimento, Telefone, Email, RG);
        this.endereco = endereco;
    }

   

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cliente(String endereco, int id, String Nome) {
        super(id, Nome);
        this.endereco = endereco;
    }

    
    }
