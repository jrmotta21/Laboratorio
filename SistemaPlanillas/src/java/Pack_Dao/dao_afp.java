/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Dao;

import Conexion.conexion;
import Pack_Bean.bean_afp;
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
public class dao_afp {
      public  static  ArrayList<bean_afp> listartrabajador(int code){
        ArrayList<bean_afp> lista= new ArrayList<bean_afp>();
        
        conexion c= new conexion();
         Connection cn= c.abrir();
        try {
            PreparedStatement consulta = cn.prepareStatement("select * from afp where cod_afp="+code+"");
           
            ResultSet rs=consulta.executeQuery();
            while(rs.next()){
              bean_afp bean = new bean_afp();
              bean.setCod_afp(rs.getInt("cod_afp"));
              bean.setAfp_descrip(rs.getString("afp_descrip"));
              bean.setAfp_tasa(rs.getFloat("afp_tasa"));
               
              lista.add(bean);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al listar del personal");
        }
                  
        
        
        return  lista;
        
    }
       public  static  ArrayList<bean_afp> buscarporcentaje(String code){
        ArrayList<bean_afp> lista= new ArrayList<bean_afp>();
        
        conexion c= new conexion();
         Connection cn= c.abrir();
        try {
            PreparedStatement consulta = cn.prepareStatement("select * from afp where afp_descrip="+code+"");
           
            ResultSet rs=consulta.executeQuery();
            while(rs.next()){
              bean_afp bean = new bean_afp();
              bean.setCod_afp(rs.getInt("cod_afp"));
              bean.setAfp_descrip(rs.getString("afp_descrip"));
              bean.setAfp_tasa(rs.getFloat("afp_tasa"));
               
              lista.add(bean);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al listar del personal");
        }
                  
        
        
        return  lista;
        
    }
       public static ArrayList<bean_afp> porcentaje(int cod4){
            ArrayList<bean_afp> lista= new ArrayList<bean_afp>();
        
        conexion c= new conexion();
         Connection cn= c.abrir();
        try {
            PreparedStatement consulta = cn.prepareStatement("select * from afp where cod_afp="+cod4+"");
           
            ResultSet rs=consulta.executeQuery();
            while(rs.next()){
              bean_afp bean = new bean_afp();
              bean.setCod_afp(rs.getInt("cod_afp"));
              bean.setAfp_descrip(rs.getString("afp_descrip"));
              bean.setAfp_tasa(rs.getFloat("afp_tasa"));
               
              lista.add(bean);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error al listar del personal");
        }
                  
        
        
        return  lista;
           
       }
       public static double porcentajes(String trab, double total, float por){
           double total1=0;
            if(trab.equals("s"))
                { 
                    total1=total*0.13;
                }
                if(trab.equals("n")){
                 total1=total*por*0.01;
                }
                               
               
           return total1;
       }
       public static bean_afp buscarcodigo(int i) throws SQLException
       { bean_afp ver=new bean_afp();
       conexion c=new conexion();
       Connection cn=c.abrir();
       String sql="select * from afp where cod_afp="+i+"";
       PreparedStatement ps=cn.prepareStatement(sql);
       ResultSet rs=ps.executeQuery();
       while(rs.next()){
       ver.setAfp_descrip(rs.getString("afp_descrip"));
       ver.setAfp_tasa(rs.getFloat("afp_tasa"));
       ver.setCod_afp(rs.getInt("cod_afp"));
       }
       return ver;
       }
       public static double quintacategoria(float sueldo5,String pago7,double total){
       double quinta=0;
       if(pago7.equals("jornal")){
           double pagos=sueldo5*30;
           if(pagos<=1900){
          quinta=0;
           }
           else
           {
               quinta=(total*14)-(7*3800)*0.15/12;
           }
       }
       if(pago7.equals("salario")){
           double pagos1=sueldo5;
           if(pagos1<=1900){
          quinta=0;
           }
           else
           {
               quinta=((total*14)-(7*3800))*0.15/12;
           }
       }
       return quinta;
       }
       
}
