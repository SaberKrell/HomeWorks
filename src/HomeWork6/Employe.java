package HomeWork6;
class EmployeArr {
    static Employe[] npc = new Employe[6];

}

public class Employe {
    private String name;
    private String post;
    private String eMail;
    private int phoneNumber;
    private int salary;
    private int age;

    public Employe (String name, String post, String eMail, int phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { this.age = age; }
}
