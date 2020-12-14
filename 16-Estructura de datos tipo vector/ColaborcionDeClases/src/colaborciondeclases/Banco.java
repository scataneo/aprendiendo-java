/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaborciondeclases;

/**
 *
 * @author alumno
 */
public class Banco {
    
    private Cliente cliente;
    
    public Banco(){}

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Banco{" + "cliente=" + cliente + '}';
    }
    
    
    
}
