package com.softserve.homework08.practicaltask;

public class Department implements Cloneable {

    private String name;
    private Address address;

    public class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return "\n\t\tCity: " + city + "\n\t\tStreet: " + street + "\n\t\tBuilding: " + building;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public Department(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Department Info: \n\tName: " + name + "\n\tAddress: " + ((address != null) ? address.toString() : "Was not provided");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department departmentClone = (Department) super.clone();
        departmentClone.setAddress((Address) getAddress().clone());
        return departmentClone;
    }
}
