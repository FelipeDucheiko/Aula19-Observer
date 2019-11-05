/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula19.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felip
 */
public class Grupo implements Subject{
    private List<Observer> observadores;
    private List<Mensagem> mensagens;
    
    public Grupo(){
        observadores = new ArrayList<Observer>();
        mensagens = new ArrayList<Mensagem>();
    }
   

    @Override
    public void attach(Observer observer) {
        this.observadores.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observadores.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer usuario : observadores) {
            usuario.update();
        }
    }
    
    public void setState(Mensagem mensagem){
        this.mensagens.add(mensagem);
        notifyObservers();
    }
    
    public List<Mensagem> getState(){
        return this.mensagens;
    }
    
}
