/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vic;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
 public class aula {
    
    public static void main(String[] args) {
        
        //entrada
    Scanner scanner = new Scanner(System.in);
    
    int idade;
    
    System.out.println("----Programa de comparação maior idade-----");
    System.out.println("Digite a idade");
    idade = scanner.nextInt();
    
    //PROCESSAMENTo
   if (idade>= 18) {
       System.out.println("Aluno maior idade");
       
   }else{
       
       System.out.println("Aluno menor idade");
   }
               


    }
}
