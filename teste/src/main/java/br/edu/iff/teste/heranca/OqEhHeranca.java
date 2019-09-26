/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.teste.heranca;

import java.util.Date;

/**
 *
 * @author samsung
 */
public class OqEhHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x = "olá";
        Integer y = 2, z = 10;
        z = y;
        //x = y;
        
        Aluno a1 = new Aluno() {
            @Override
            public boolean podeSolicitarDiploma() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        AlunoConcomitante a2 = new AlunoConcomitante();
        AlunoIntegrado a3 = new AlunoIntegrado();
        a1 = a2;
        //a2 = (AlunoConcomitante) a3;
        a2 = (AlunoConcomitante) a1;
        
        //a1.podeSolicitarDiploma();
        a2.podeSolicitarDiploma();
        a2.dtNascimento = new Date();
        a2.idade();
    }
    
}
