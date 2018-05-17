package com.opensmart.service.ApartmentManageService;

import com.opensmart.entity.Apartment;

import java.util.List;

public interface ApartmentManageService {
    List<Apartment> listAllApartment(String userId);
    List<String> listRoomsDataByApartmentId(String apartmentId);
}
