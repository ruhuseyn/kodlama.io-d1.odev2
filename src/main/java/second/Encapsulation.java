package second;

public class Encapsulation {

    private String name;
    private String surname;
    private String age;
    private String seniority;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }



    public Encapsulation(String name, String surname, String age, String seniority) {
        System.out.println("Yes, I am working");
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.seniority = seniority;
    }
}
