/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LogicaNegocios;

/**
 *
 * @author 8
 */
public class RaizCuadrada {
    double numero;
    double resultado;
    
    public void asignum(double num){
        this.numero=num;
    }
    
    public double resultado(){
        resultado = Math.sqrt(numero);
        return resultado;
    }
}
