package com.CarRental.domain;

public class Car {

    private String carId;
    private String houseNumber;
    private String streetName;
    private String suburb;
    private String postalCode;
    private String city;

    public String getId() {
        return carId;
    }

    public void setId(String carId) {
        this.carId = carId;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private Car(){

    }

    public Car(Builder builder) {
        this.carId = builder.carId;
        this.houseNumber = builder.houseNumber;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.postalCode = builder.postalCode;
        this.city = builder.city;
    }

    public static class Builder{

        private String carId;
        private String houseNumber;
        private String streetName;
        private String suburb;
        private String postalCode;
        private String city;

        public Builder carId(String value)
        {
            this.carId = value;
            return this;
        }

        public Builder houseNumber(String value)
        {
            this.houseNumber = value;
            return this;
        }

        public Builder streetName(String value)
        {
            this.streetName = value;
            return this;
        }

        public Builder suburb(String value)
        {
            this.suburb = value;
            return this;
        }

        public Builder postalCode(String value)
        {
            this.postalCode = value;
            return this;
        }

        public Builder city(String value)
        {
            this.city = value;
            return this;
        }

        public Car build(){

            return new Car(this);
        }
    }
}
