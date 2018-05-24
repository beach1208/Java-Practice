package Chapter8_Obj_Class;

public class User {
    private  String id;
    private String password;
    private int age;

    public User(String id, String password, int age) {
        this.id = id;
        setPassword(password);
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 6){
            throw new IllegalArgumentException("Password too short!");
        }else{
            this.password = password;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 17){
            throw new AgeRestrictionException("Age too young");
        }else {
            this.age = age;
        }
    }
}
