package com.opensmart.dao;

import com.opensmart.entity.Apartment;

import java.util.List;

public interface ApartmentManageDao {
    List<Apartment> listAllApartment(String userId);
}
