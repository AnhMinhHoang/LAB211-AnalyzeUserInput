/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author GoldCandy
 */
public class Library {
    public boolean checkOddEven(int a){
        return a%2 == 0;
    }
    
    public boolean perfectSquare(int a){
        return (int)Math.sqrt(a) * (int)Math.sqrt(a) == a;
    }
}
