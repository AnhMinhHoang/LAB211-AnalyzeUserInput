/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import model.InputData;

/**
 *
 * @author GoldCandy
 */
public interface IUserInputRepository {

    void getCharacter(String s, InputData data);

    void getNumber(String s, InputData data);
    
}
