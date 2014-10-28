/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Dao;

import Conexion.conexion;
import Pack_Bean.bean_trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class dao_trabajador {
       public  static  ArrayList<bean_trabajador> listartrabajador(){
        ArrayList<bean_trabajador> lista= new ArrayList<bean_trabajador>();
        
        conexion c= new conexion();
         Connection cn= c.abrir();
        try {
            PreparedStatement consulta = cn.prepareStatement("select * from trabajador where estado=1");
           
            ResultSet rs=consulta.executeQuery();
            while(rs.next()){
              bean_trabajador bean = new bean_trabajador();
              bean.setCod_trab(rs.getInt("cod_trab"));
              bean.setApe_pater(rs.getString("ape_pater"));
              bean.setApe_mater(rs.getString("ape_mater"));
              bean.setNombre(rs.getString("nombre"));
              bean.setSexo(rs.getString("sexo"));
              bean.setPuesto(rs.getString("puesto"));
              bean.setEstado(rs.getString("estado"));
              bean.setTrab_onp(rs.getString("trab_onp"));
              bean.setCod_afp(rs.getInt("cod_afp"));
              bean.setTipo_pago(rs.getString("tipo_pago"));
              bean.setSueldo(rs.getFloat("sueldo"));
              bean.setCant_hijos(rs.getInt("cant_hijos"));
//              bean.setF_ingre(rs.getString("f_ingre"));
              lista.add(bean);
            }
        } catch (SQLException ex) {
//           JOptionPane.showMessageDialog(null, "error al listar del personal");
            JOptionPane.showMessageDialog(null, "error");
        }
                  
        
        
        return  lista;
        
    }
       public  static  ArrayList<bean_trabajador> buscartrabajador(int cod1){
        ArrayList<bean_trabajador> lista= new ArrayList<bean_trabajador>();
        
        conexion c= new conexion();
         Connection cn= c.abrir();
        try {
            PreparedStatement consulta = cn.prepareStatement("select * from trabajador where estado=1 and cod_trab="+cod1+"");
           
            ResultSet rs=consulta.executeQuery();
            while(rs.next()){
              bean_trabajador bean = new bean_trabajador();
              bean.setCod_trab(rs.getInt("cod_trab"));
              bean.setApe_pater(rs.getString("ape_pater"));
              bean.setApe_mater(rs.getString("ape_mater"));
              bean.setNombre(rs.getString("nombre"));
              bean.setSexo(rs.getString("sexo"));
              bean.setPuesto(rs.getString("puesto"));
              bean.setEstado(rs.getString("estado"));
              bean.setTrab_onp(rs.getString("trab_onp"));
              bean.setCod_afp(rs.getInt("cod_afp"));
              bean.setTipo_pago(rs.getString("tipo_pago"));
              bean.setSueldo(rs.getFloat("sueldo"));
              bean.setCant_hijos(rs.getInt("cant_hijos"));
              bean.setF_ingre(rs.getString("f_ingre"));
              lista.add(bean);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al listar del personal");
        }
                  
        
        
        return  lista;
        
    }
       public static double calcularhoraextra(int extra,String tipo_pago,int cant_hijos,float sueldo)
       {
           double horaextra=0;
            String tipo=tipo_pago;
            int horas=extra;
                if(tipo.equals("salario")){
                            if(cant_hijos>0){
                            if(horas<=2){
                                double cant1=(((sueldo+75)/30)/8)*(horas*1.25);
                      horaextra=cant1;
                            }
                           else{      
                           double cant1=(((sueldo+75)/30)/8)*(2*1.25+(horas-2)*1.35);
                           horaextra=cant1;
                           }
                            }
                            
                           else{
                               
                                if(horas<=2){
                                double cant1=(((sueldo)/30)/8)*(horas*1.25);
                                horaextra=cant1;
                            }
                           else{      
                           double cant1=(((sueldo)/30)/8)*(2*1.25+(horas-2)*1.35);
                           horaextra=cant1;
                           }
                                                       }
                            }
                               if(tipo.equals("jornal")){
                                if(horas<=2){
                                double cant1=((sueldo)/8)*(horas*1.25);    
                                horaextra=cant1;

                               }else{
                                    double cant1=(sueldo/8)*((2*1.25+(horas-2)*1.35));
                                                horaextra=cant1;
  }
                          
                
  
        
       }   return horaextra;
       }
       public static int AsignacionFamiliar(int cant){
           int asigna=0;
                if(cant>0){
                   asigna=75;    
                }else{
                     asigna=0;
               
                }

           return asigna;
       }
       public static double total(String tipo,float sueldo1, double pagoextra,int asigna)
       {    double total=0;
       if(tipo.equals("jornal")){
                        double sueldos=sueldo1*30;     
                    total=sueldos+pagoextra+asigna;
                                   }
                        else{
                       total=sueldo1+pagoextra+asigna;}
       return total;
       }
       public static void agregarTrabajador(bean_trabajador ast)
       {
           Connection cn=null;
        String sql="insert into trabajador(ape_pater,ape_mater,nombre,sexo,puesto,estado,trab_onp,cod_afp,tipo_pago,sueldo,cant_hijos,f_ingre) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        conexion con= new conexion();
        cn=con.abrir();
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1, ast.getApe_pater());
            ps.setString(2, ast.getApe_mater());
            ps.setString(3, ast.getNombre());
            ps.setString(4, ast.getSexo());
            ps.setString(5, ast.getPuesto());
            ps.setString(6, ast.getEstado());
            ps.setString(7, ast.getTrab_onp());
            ps.setInt(8, ast.getCod_afp());
            ps.setString(9, ast.getTipo_pago());
            ps.setFloat(10, ast.getSueldo());
            ps.setInt(11, ast.getCant_hijos());
            ps.setString(12, ast.getF_ingre());
    
            // ejecuta objeto ps
            ps.executeUpdate();
            
        } catch (SQLException ex) {
         System.out.println("error");
        }
       }
}
   
