package ptteng.model.domain;

public class User {
    private String id;
    private String username;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null:id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username==null?null :username.trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
