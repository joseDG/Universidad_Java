
package domain;

import java.util.Date;


public class Cliente extends Persona{
    
    private int idCliente;
    private Date fechaRegsitro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(Date fechaRegsitro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.fechaRegsitro = fechaRegsitro;
        this.idCliente = ++Cliente.contadorCliente;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegsitro() {
        return fechaRegsitro;
    }

    public void setFechaRegsitro(Date fechaRegsitro) {
        this.fechaRegsitro = fechaRegsitro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegsitro=").append(fechaRegsitro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    } 
    
}
