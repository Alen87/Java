/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package alen;

import alen.util.HibernateUtil;

/**
 *
 * @author Alen
 */
public class Start {

    public Start() {
        HibernateUtil.getSession();

    }

    public static void main(String[] args) {
        new Start();
    }
}
