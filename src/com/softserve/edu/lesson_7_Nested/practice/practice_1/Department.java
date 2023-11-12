package com.softserve.edu.lesson_7_Nested.practice.practice_1;

public class Department implements Cloneable {
    private String type;
    private Address address;

    public Department(String type) {
        this.type = type;
    }

    public Department(String type, Address address) {
        this.type = type;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    static class Address implements Cloneable{
        private String city;
        private String street;
        private int numBuilding;

        public Address(String city, String street, int numBuilding) {
            this.city = city;
            this.street = street;
            this.numBuilding = numBuilding;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getNumBuilding() {
            return numBuilding;
        }

        public void setNumBuilding(int numBuilding) {
            this.numBuilding = numBuilding;
        }

        @Override
        public String toString() {
            return "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", numBuilding=" + numBuilding +
                    '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "type='" + type + '\'' +
                ",address:" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department cl = (Department) super.clone();
        cl.address = (Address) address.clone();
        return cl;
    }
}
