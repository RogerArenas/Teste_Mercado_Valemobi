/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Valemobi.Model;

import br.com.Valemobi.Controller.Mercadoria;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class Repositorio_Mercadoria extends Mercadoria{

    private EntityManager manager;

    public Repositorio_Mercadoria(EntityManager manager) {
        this.manager = manager;
    }

    public void adiciona(Mercadoria e) {
        this.manager.persist(e); 
    }

    public Mercadoria busca(int id) {
        return this.manager.find(Mercadoria.class, id);
    }

    public List<Mercadoria> buscaTodas() {
        Query query = this.manager.createQuery("SELECT * FROM Mercadoria e");
        return query.getResultList();
    }

}

