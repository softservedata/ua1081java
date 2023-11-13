package practical8;

class Department implements Cloneable {
    private String name;
    private Address address = new Address();

    public Department(String name, String city, String street, int building) {
        this.name = name;
        address.city = city;
        address.street = street;
        address.building = building;
    }

    class Address implements Cloneable{
        private String city;
        private String street;
        private int building;

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

        public void setCity(String city) {
            this.city = city;
        }
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Department myClone = (Department) super.clone();
        myClone.setAddress((Address) getAddress().clone());
        return myClone;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}