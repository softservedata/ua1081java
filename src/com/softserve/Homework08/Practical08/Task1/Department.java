package com.softserve.Homework08.Practical08.Task1;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public Department() {
    }

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.building = building;
            this.city = city;
            this.street = street;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
        /*        @Override
        public Object clone() throws CloneNotSupportedException {
            Address addressClone = (Address) super.clone();
            return addressClone;*/
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Department departmentClone = (Department) super.clone();
        //departmentClone.address=(Address)departmentClone.address.clone();
        return departmentClone;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public void setCity(String city) {
        address.setCity(city);
    }
}
