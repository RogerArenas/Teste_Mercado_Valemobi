package br.com.Valemobi.Controller;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ManagedBean(name = "Dados_produto") //Controlador Bean 
@Entity
public class Mercadoria implements Serializable{

    
    @Id @GeneratedValue
    private List<Mercadoria> MRA;
    private int id_Mercadoria;            //Variaveis_Principais
    private String Nome_Mercadoria;
    private String Tipo_Mercadoria;
    private double Quantidade;
    private double Preço;
    private String Tipo_Negocio;

    //Metodos
    public void RetornaDados() {

    }

    public void Imprimir() {
        System.out.println(this.getId_Mercadoria());
        System.out.println(this.getNome_Mercadoria());
        System.out.println(this.getTipo_Mercadoria());
        System.out.println(this.getQuantidade());
        System.out.println(this.getPreço());
        System.out.println(this.getTipo_Negocio());

    }

    //Gets & Sets
    public List<Mercadoria> getMRA() {
        
        this.getId_Mercadoria();
        this.getNome_Mercadoria();
        this.getTipo_Mercadoria();
        this.getQuantidade();
        this.getPreço();      
        
        return MRA;
    }

    public void setMRA(List<Mercadoria> MRA) {
        this.MRA = MRA;
    }

    public int getId_Mercadoria() {
        return id_Mercadoria;
    }

    public void setId_Mercadoria(int id_Mercadoria) {
        this.id_Mercadoria = id_Mercadoria;
    }

    public String getNome_Mercadoria() {
        return Nome_Mercadoria;
    }

    public void setNome_Mercadoria(String Nome_Mercadoria) {
        this.Nome_Mercadoria = Nome_Mercadoria;
    }

    public String getTipo_Mercadoria() {
        return Tipo_Mercadoria;
    }

    public void setTipo_Mercadoria(String Tipo_Mercadoria) {
        this.Tipo_Mercadoria = Tipo_Mercadoria;
    }

    public double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(double Quantidade) {
        this.Quantidade = Quantidade;
    }

    public double getPreço() {
        return Preço;
    }

    public void setPreço(double Preço) {
        this.Preço = Preço;
    }

    public String getTipo_Negocio() {
        return Tipo_Negocio;
    }

    public void setTipo_Negocio(String Tipo_Negocio) {
        this.Tipo_Negocio = Tipo_Negocio;
    }

}
