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
public class Usuario implements Observer{
    private String nome;
    private Grupo grupo;
    
    public Usuario (Grupo grupo, String nome){
        this.nome = nome;
        this.grupo = grupo;
    }

    @Override
    public void update() {
        System.out.println("Mensagens:");
        
        for (Mensagem mensagem : this.getGrupo().getState()) {
            System.out.println("Usuários " + mensagem.getUsuario().getNome() + " diz:");
            System.out.println(mensagem.getMensagem());
        }
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the grupo
     */
    public Grupo getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
}
