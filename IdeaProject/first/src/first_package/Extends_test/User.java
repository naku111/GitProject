package first_package.Extends_test;

public class User {
    private String name;
    private int money;
    User(){}
    User(String name,int money)
    {
        this.name=name;
        this.money=money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void show()
    {
        System.out.println("名字为："+name+"   余额为："+money);
    }

}
