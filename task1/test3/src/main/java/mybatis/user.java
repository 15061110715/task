package mybatis;

public class user {
    private int id;
    private String username;
    private int age;

public user(int id,String username,int age){
    this.id=id;
    this.username=username;
    this.age=age;
}
public user(String username,int age){
    this.username=username;
    this.age=age;
}
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User[id="+id+",username="+username+",age="+age+"]";
    }
}
