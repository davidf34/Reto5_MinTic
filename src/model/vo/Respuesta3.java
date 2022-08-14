/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vo;

/**
 *
 * @author DIDIER GUERRERO
 */
public class Respuesta3 {
    private Integer id_compra;
    private String constructora;
    private String banco_vinculado;

    public Respuesta3() {
    }

    public Respuesta3(Integer id_compra, String constructora, String banco_vinculado) {
        this.id_compra = id_compra;
        this.constructora = constructora;
        this.banco_vinculado = banco_vinculado;
    }

    public Integer getId_compra() {
        return id_compra;
    }

    public void setId_compra(Integer id_compra) {
        this.id_compra = id_compra;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getBanco_vinculado() {
        return banco_vinculado;
    }

    public void setBanco_vinculado(String banco_vinculado) {
        this.banco_vinculado = banco_vinculado;
    }
    
    
}
