package com.example.assignment1.model;

public class Order {
    private String name;
    private String email;
    private String areaCode;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String province; // Changed from state to province for clarity
    private String zipcode;
    private String country;
    private String phoneBrand;
    private String phoneModel;
    private double phonePrice;
    private int quantity;

    // Getters and Setters for all fields
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAreaCode() { return areaCode; }
    public void setAreaCode(String areaCode) { this.areaCode = areaCode; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddressLine1() { return addressLine1; }
    public void setAddressLine1(String addressLine1) { this.addressLine1 = addressLine1; }

    public String getAddressLine2() { return addressLine2; }
    public void setAddressLine2(String addressLine2) { this.addressLine2 = addressLine2; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getProvince() { return province; } // Updated getter
    public void setProvince(String province) { this.province = province; } // Updated setter

    public String getZipcode() { return zipcode; }
    public void setZipcode(String zipcode) { this.zipcode = zipcode; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getPhoneBrand() { return phoneBrand; }
    public void setPhoneBrand(String phoneBrand) { this.phoneBrand = phoneBrand; }

    public String getPhoneModel() { return phoneModel; }
    public void setPhoneModel(String phoneModel) { this.phoneModel = phoneModel; }

    public double getPhonePrice() { return phonePrice; }
    public void setPhonePrice(double phonePrice) { this.phonePrice = phonePrice; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}