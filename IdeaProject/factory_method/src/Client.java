public class Client {
    public static void main(String[] args) {
        Factory one=new StructAbstractFactory();
        Gongxing show = one.show();
        String jieLun = show.getJieLun();
        System.out.println("从结构抽象中得到"+jieLun);
        String relation = show.getRelation();
        System.out.println(relation);
        System.out.println("=====================================");
        Factory two=new PropAbstractFactory();
        Gongxing show2 = two.show();
        String jielun2 = show2.getJieLun();
        System.out.println("从性质抽象中得到"+jielun2);
        String relation2 = show2.getRelation();
        System.out.println(relation2);
        System.out.println("=====================================");
        Factory three=new RelationAbsrtactFactory();
        Gongxing show3 = three.show();
        String jielun3 = show3.getJieLun();
        System.out.println("从关系抽象中得到"+jielun3);
        String relation3 = show3.getRelation();
        System.out.println(relation3);
    }
}
