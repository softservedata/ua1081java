package PracticalTasks8;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public Department(String name, String city, String street, int building) {
        this.name = name;
        this.address = new Address(city, street, building);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department cloneOfDepartment = (Department) super.clone();
        cloneOfDepartment.setAddress((Address) getAddress().clone());
        return cloneOfDepartment;
    }

    public class Address implements Cloneable{
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        public int getBuilding() {
            return building;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
