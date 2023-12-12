package petmvc;

public class Petrecord {
    private String phonenumber;
    private String date;
    private String detail;

    public Petrecord() {
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Petrecord(String phonenumber, String date, String detail) {
        this.phonenumber = phonenumber;
        this.date = date;
        this.detail = detail;
    }
}
