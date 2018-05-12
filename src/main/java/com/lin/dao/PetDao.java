package com.lin.dao;

import com.lin.domain.Pet;

import java.util.List;

/**
 * Created by zhanglinxing on 2018/5/12.
 */
public interface PetDao {
    public List<Pet> getByName(String name);
}
