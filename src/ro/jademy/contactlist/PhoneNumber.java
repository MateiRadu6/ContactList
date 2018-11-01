package ro.jademy.contactlist;

public class PhoneNumber {

    private String number;
    private String operator;
    private String countryCode;

    public PhoneNumber(String number) {
        this.number = number;
        // TODO: figure out operator and country code defaults
    }

    public PhoneNumber(String number, String operator) {
        this.number = number;
        this.operator = operator;
        this.countryCode = "+40";
    }

    public PhoneNumber(String number, String operator, String countryCode) {
        this.number = number;
        this.operator = operator;
        this.countryCode = "00" + countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
