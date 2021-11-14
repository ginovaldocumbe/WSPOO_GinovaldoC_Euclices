/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Smart Solution
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EntityManagerFactory ft = Persistence.createEntityManagerFactory("");
    }
    
}
