/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud;

import Modelo.Alunos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Smart Solution
 */
public class Crud {
   public void adicionar(){
        EntityManagerFactory ft = Persistence.createEntityManagerFactory("testehibernate");
       EntityManager em = ft.createEntityManager();
        em.getTransaction().begin();
        //Alunos aluno = new Alunos();
        //aluno.setNome("Mario");
        //aluno.setCurso("Informatica");
       
        //em.persist(aluno);
        em.flush();
        em.getTransaction().commit();
        ft.close();
    }
   
   public void pesquisar(int number){
        EntityManagerFactory ft = Persistence.createEntityManagerFactory("testehibernate");
       EntityManager em = ft.createEntityManager();
        Alunos aluno = em.find(Alunos.class, number+"L");
       
        JOptionPane.showMessageDialog(null,"id: "+aluno.getId()+" "+aluno.getNome()+" ");
       ft.close();
   }
   
   public void update(int number){
        EntityManagerFactory ft = Persistence.createEntityManagerFactory("testehibernate");
       EntityManager em = ft.createEntityManager();
        Alunos aluno = em.find(Alunos.class, number+"L");
       
        //JOptionPane.showMessageDialog(null,"id: "+aluno.getId()+" "+aluno.getNome()+" "+aluno.getCurso());
       ft.close();
   }
   
   
   public void remover(){
       EntityManagerFactory ft = Persistence.createEntityManagerFactory("testehibernate");
       EntityManager em = ft.createEntityManager();
       Alunos aluno = em.find(Alunos.class, 6L);
       em.getTransaction().begin();
       em.remove(aluno);
        //em.flush();
        em.getTransaction().commit();
       ft.close();
   }
   
   public void listar(){
        EntityManagerFactory ft = Persistence.createEntityManagerFactory("testehibernate");
        EntityManager em = ft.createEntityManager();
      // Alunos q = new Alunos();
         Query q = em.createQuery("Select c from Alunos c ");
        List<Alunos>  e = q.getResultList();
       
       for(Alunos a: e){
           JOptionPane.showMessageDialog(null,"id: "+a.getId()+" "+a.getNome()+" ");
           
      }
       ft.close();
   }
}
