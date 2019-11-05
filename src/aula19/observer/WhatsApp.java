/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula19.observer;

/**
 *
 * @author felip
 */
public class WhatsApp {
    
    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        
        Usuario usuario1 = new Usuario(grupo, "usuario 1");
        Usuario usuario2 = new Usuario(grupo, "usuario 2");
        Usuario usuario3 = new Usuario(grupo, "usuario 3");
        
        grupo.attach(usuario1);
        grupo.attach(usuario2);
        grupo.attach(usuario3);
        
        Mensagem mensagem1 = new Mensagem(usuario1, "Olá, tudo bem?");
        grupo.setState(mensagem1);
        Mensagem mensagem2 = new Mensagem(usuario2, "Olá, estou bem");
        grupo.setState(mensagem2);
        Mensagem mensagem3 = new Mensagem(usuario3, "Olá, também estou bem");
        grupo.setState(mensagem3);
        
        grupo.detach(usuario3);
        
        Mensagem mensagem4 = new Mensagem(usuario1, "Pq ele saiu da conversa?");
        grupo.setState(mensagem4);
        
    }
    
}
