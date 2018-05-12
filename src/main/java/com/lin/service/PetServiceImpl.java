package com.lin.service;

import com.lin.dao.PetDao;
import com.lin.domain.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhanglinxing on 2018/5/12.
 */
@Service
public class PetServiceImpl implements  PetService {
    @Autowired
    private PetDao petDao;

    public List<Pet> selectPetByName(String name) {
        return petDao.getByName(name);
    }
}
