/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author canelamah
 */
abstract public class Pessoa {
    protected int id;
    protected String Nome;
    protected char Sexo;
    protected Date DataNascimento;
    protected String Telefone;
    protected String Email;
    protected String RG;

    public Pessoa(int id, String Nome) {
        this.id = id;
        this.Nome = Nome;
    }

    public Pessoa(int id, String Nome, char Sexo, String DataNascimento, String Telefone, String Email, String RG) {
        this.id = id;
        this.Nome = Nome;
        this.Sexo = Sexo;
        try {
            this.DataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(DataNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.Telefone = Telefone;
        this.Email = Email;
        this.RG = RG;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

   
}
