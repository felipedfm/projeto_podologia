/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;

/**
 *
 * @author canelamah
 */
public class main {
    public static void main(String[] args){
        Servico servico =new Servico (1,"calosidade", 50);
    Cliente cliente = new Cliente("rua teste",1,"Felipe");
    System.out.println(cliente.getNome());
    Agendamento agendamento = new Agendamento(1,cliente,servico,50, "14/07/2023 09:15");
    System.out.println(agendamento.getCliente().getNome());
    } 

}
