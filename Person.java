import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate birthday;
    private boolean coffee;
    private String gender;
    private int personalNumber;
    private String employmentDate;
    private int accessLevel;

    public Person() {}
    public Person(String name , LocalDate birthday , boolean coffee , String gender , int personalNumber ,
                  String employmentDate , int accessLevel) {
        this.name = name;
        this.birthday = birthday;
        this.coffee = coffee;
        this.gender = gender;
        this.personalNumber = personalNumber;
        this.employmentDate = employmentDate;
        this.accessLevel = accessLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    private void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isCoffee() {
        return coffee;
    }

    public void setCoffee(boolean coffee) {
        this.coffee = coffee;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }
}





