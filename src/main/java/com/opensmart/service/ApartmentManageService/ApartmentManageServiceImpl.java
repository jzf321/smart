package com.opensmart.service.ApartmentManageService;

import com.opensmart.dao.ApartmentManageDao;
import com.opensmart.entity.Apartment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ApartmentManageServiceImpl implements ApartmentManageService{
    @Autowired
    ApartmentManageDao apartmentManageDao;

    @Override
    public List<Apartment> listAllApartment(String userId) {
        List<Apartment> list=apartmentManageDao.listAllApartment(userId);
        return list;
    }

    @Override
    public List<String> listRoomsDataByApartmentId(String apartmentId) {
        int a=0;
        return null;
    }


}
