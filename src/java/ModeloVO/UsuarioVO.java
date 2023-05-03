/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author sergio saenz
 * IdCargoFK
 */
public class UsuarioVO {
    private String IdUsuario,NombreUsuario,CorreoDatos,ClaveUsuario,IdCargoFK,EstadoUsu,rol;

    
    public UsuarioVO(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public UsuarioVO(String IdCargoFK, String rol) {
        this.IdCargoFK = IdCargoFK;
        this.rol = rol;
    }
    
    //Constructor 
    public UsuarioVO() {
    }
    //constructor lleno

    public UsuarioVO(String IdUsuario, String NombreUsuario, String CorreoDatos, String ClaveUsuario, String IdCargoFK, String EstadoUsu) {
        this.IdUsuario = IdUsuario;
        this.NombreUsuario = NombreUsuario;
        this.CorreoDatos = CorreoDatos;
        this.ClaveUsuario = ClaveUsuario;
        this.IdCargoFK = IdCargoFK;
        this.EstadoUsu = EstadoUsu;
    }

    public UsuarioVO(String NombreUsuario, String CorreoDatos, String ClaveUsuario) {
        this.NombreUsuario = NombreUsuario;
        this.CorreoDatos = CorreoDatos;
        this.ClaveUsuario = ClaveUsuario;
    }
    
    
    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getCorreoDatos() {
        return CorreoDatos;
    }

    public void setCorreoDatos(String CorreoDatos) {
        this.CorreoDatos = CorreoDatos;
    }

    public String getClaveUsuario() {
        return ClaveUsuario;
    }

    public void setClaveUsuario(String ClaveUsuario) {
        this.ClaveUsuario = ClaveUsuario;
    }

    public String getIdCargoFK() {
        return IdCargoFK;
    }

    public void setIdCargoFK(String IdCargoFK) {
        this.IdCargoFK = IdCargoFK;
    }

    public String getEstadoUsu() {
        return EstadoUsu;
    }

    public void setEstadoUsu(String EstadoUsu) {
        this.EstadoUsu = EstadoUsu;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

   
}
