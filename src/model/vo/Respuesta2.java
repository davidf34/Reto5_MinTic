
package model.vo;

public class Respuesta2 {
    private Integer id_proyecto;
    private String constructora;
    private Integer numero_habitaciones;
    private String ciudad;

    public Respuesta2() {
    }

    public Respuesta2(Integer id_proyecto, String constructora, Integer numero_habitaciones, String ciudad) {
        this.id_proyecto = id_proyecto;
        this.constructora = constructora;
        this.numero_habitaciones = numero_habitaciones;
        this.ciudad = ciudad;
    }

    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Integer getNumero_habitaciones() {
        return numero_habitaciones;
    }

    public void setNumero_habitaciones(Integer numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
