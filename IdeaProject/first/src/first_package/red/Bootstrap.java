package first_package.red;

public class Bootstrap {
    public static void main(String[] args) {
        Myred my=new Myred("红包");
        my.setOwnerName("群主");
//        OpenMode normal=new normal_model();
//        my.setOpenWay(normal);
        OpenMode random=new random_model();
        my.setOpenWay(random);
    }
}
