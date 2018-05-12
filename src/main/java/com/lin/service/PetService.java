package com.lin.service;

import com.lin.domain.Pet;

import java.util.List;

/**
 * Created by zhanglinxing on 2018/5/12.
 */
public interface PetService {
    List<Pet> selectPetByName(String name);
}

