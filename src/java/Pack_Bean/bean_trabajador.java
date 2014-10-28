/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Bean;

import java.util.Date;

/**
 *
 * @author Junior
 */
public class bean_trabajador {
    int cod_trab,cod_afp,cant_hijos;
    String ape_pater,ape_mater,nombre,sexo,puesto,estado,trab_onp,
            tipo_pago,f_ingre;
    float sueldo;

    public String getF_ingre() {
        return f_ingre;
    }

    public void setF_ingre(String f_ingre) {
        this.f_ingre = f_ingre;
    }
   
    public int getCod_trab() {
        return cod_trab;
    }

    public void setCod_trab(int cod_trab) {
        this.cod_trab = cod_trab;
    }

    public String getApe_mater() {
        return ape_mater;
    }

    public void setApe_mater(String ape_mater) {
        this.ape_mater = ape_mater;
    }

    public String getApe_pater() {
        return ape_pater;
    }

    public void setApe_pater(String ape_pater) {
        this.ape_pater = ape_pater;
    }

    public int getCant_hijos() {
        return cant_hijos;
    }

    public void setCant_hijos(int cant_hijos) {
        this.cant_hijos = cant_hijos;
    }

    public int getCod_afp() {
        return cod_afp;
    }

    public void setCod_afp(int cod_afp) {
        this.cod_afp = cod_afp;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public String getTrab_onp() {
        return trab_onp;
    }

    public void setTrab_onp(String trab_onp) {
        this.trab_onp = trab_onp;
    }
    
            
}
