package com.opensmart.entity;

public class Apartment {
    private String ApartmentId;
    private String ApartmentName;
    private String ApartmentType;
    private String ApartmentTypeName;
    private String ApartmentProvince;
    private String ApartmentCity;
    private String ApartmentCounty;
    private String DetailAddress;
    private String ApartmentManagerId;

    public Apartment() {
    }
    public Apartment(String apartmentId, String apartmentName, String apartmentType, String apartmentTypeName, String apartmentProvince, String apartmentCity, String apartmentCounty, String detailAddress, String apartmentManagerId) {
        ApartmentId = apartmentId;
        ApartmentName = apartmentName;
        ApartmentType = apartmentType;
        ApartmentTypeName = apartmentTypeName;
        ApartmentProvince = apartmentProvince;
        ApartmentCity = apartmentCity;
        ApartmentCounty = apartmentCounty;
        DetailAddress = detailAddress;
        ApartmentManagerId = apartmentManagerId;
    }

    public String getApartmentId() {
        return ApartmentId;
    }

    public void setApartmentId(String apartmentId) {
        ApartmentId = apartmentId;
    }

    public String getApartmentName() {
        return ApartmentName;
    }

    public void setApartmentName(String apartmentName) {
        ApartmentName = apartmentName;
    }

    public String getApartmentType() {
        return ApartmentType;
    }

    public void setApartmentType(String apartmentType) {
        ApartmentType = apartmentType;
    }

    public String getApartmentTypeName() {
        return ApartmentTypeName;
    }

    public void setApartmentTypeName(String apartmentTypeName) {
        ApartmentTypeName = apartmentTypeName;
    }

    public String getApartmentProvince() {
        return ApartmentProvince;
    }

    public void setApartmentProvince(String apartmentProvince) {
        ApartmentProvince = apartmentProvince;
    }

    public String getApartmentCity() {
        return ApartmentCity;
    }

    public void setApartmentCity(String apartmentCity) {
        ApartmentCity = apartmentCity;
    }

    public String getApartmentCounty() {
        return ApartmentCounty;
    }

    public void setApartmentCounty(String apartmentCounty) {
        ApartmentCounty = apartmentCounty;
    }

    public String getDetailAddress() {
        return DetailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        DetailAddress = detailAddress;
    }

    public String getApartmentManagerId() {
        return ApartmentManagerId;
    }

    public void setApartmentManagerId(String apartmentManagerId) {
        ApartmentManagerId = apartmentManagerId;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "ApartmentId='" + ApartmentId + '\'' +
                ", ApartmentName='" + ApartmentName + '\'' +
                ", ApartmentType='" + ApartmentType + '\'' +
                ", ApartmentTypeName='" + ApartmentTypeName + '\'' +
                ", ApartmentProvince='" + ApartmentProvince + '\'' +
                ", ApartmentCity='" + ApartmentCity + '\'' +
                ", ApartmentCounty='" + ApartmentCounty + '\'' +
                ", DetailAddress='" + DetailAddress + '\'' +
                ", ApartmentManagerId='" + ApartmentManagerId + '\'' +
                '}';
    }
}
