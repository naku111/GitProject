package day01;

public class Test {
    public static void main(String[] args) {
        //测试示例
        Zombie zombie = new NormalZombie();
        zombie.display();
        zombie.attack();
        zombie.move();

        //更换攻击方式:传递算法，使用算法。。
        zombie.setAttackable(new HitAttack());
        zombie.attack();
    }
}
interface Moveable{
    void move();
}

interface Attackable{
    void attack();
}

//抽象僵尸
abstract class Zombie{
    abstract public void display();
    Moveable moveable;
    Attackable attackable;
    abstract void move();
    abstract void attack();

    public Zombie() {
    }

    public Zombie(Moveable moveable, Attackable attackable) {
        this.moveable = moveable;
        this.attackable = attackable;
    }

    public Moveable getMoveable() {
        return moveable;
    }

    public void setMoveable(Moveable moveable) {
        this.moveable = moveable;
    }

    public Attackable getAttackable() {
        return attackable;
    }

    public void setAttackable(Attackable attackable) {
        this.attackable = attackable;
    }
}

//普通僵尸
class NormalZombie extends Zombie{

    public NormalZombie() {
        super(new StepByStepMove(),new BiteAttack());
    }

    public NormalZombie(Moveable moveable, Attackable attackable) {
        super(moveable, attackable);
    }

    @Override
    public void display() {
        System.out.println("我是普通僵尸。。");
    }

    @Override
    void move() {
        moveable.move();
    }

    @Override
    void attack() {
        attackable.attack();
    }
}

//普通僵尸的行为
class StepByStepMove implements Moveable{
    @Override
    public void move() {
        System.out.println("一步一步移动...");
    }
}

class BiteAttack implements Attackable{
    @Override
    public void attack() {
        System.out.println("咬");
    }
}

//其他的攻击行为
class HitAttack implements Attackable{
    @Override
    public void attack() {
        System.out.println("打。。");
    }
}


//旗手僵尸
class FlageZombie extends Zombie {
    public FlageZombie() {
        super(new StepByStepMove(), new BiteAttack());
    }

    public FlageZombie(Moveable moveable, Attackable attackable) {
        super(moveable, attackable);
    }

    @Override
    public void display() {
        System.out.println("我是旗手僵尸。。");
    }

    @Override
    void move() {
        moveable.move();
    }

    @Override
    void attack() {
        attackable.attack();
    }
}
