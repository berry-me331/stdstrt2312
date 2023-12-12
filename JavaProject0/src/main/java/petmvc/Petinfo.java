package petmvc;

public class Petinfo {
    private String phone;
    private String person;

    private String petname;
    private String address;
    private String kinds;
    private String birth;

    public Petinfo() {
    }

    public Petinfo(String phone, String person, String petname, String address, String kinds, String birth) {
        this.phone = phone;
        this.person = person;
        this.petname = petname;
        this.address = address;
        this.kinds = kinds;
        this.birth = birth;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }

}