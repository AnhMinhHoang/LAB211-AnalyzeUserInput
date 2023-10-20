/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import data_access.UserInputDao;
import model.InputData;

/**
 *
 * @author GoldCandy
 */
public class UserInputRepository implements IUserInputRepository {

    @Override
    public void getNumber(String s, InputData data) {
        UserInputDao.Instance().getNumber(s, data);
    }

    @Override
    public void getCharacter(String s, InputData data) {
        UserInputDao.Instance().getCharacter(s, data);
    }
}
