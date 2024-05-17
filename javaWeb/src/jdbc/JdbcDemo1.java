package jdbc;

import java.sql.*;

public class JdbcDemo1 {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        try{
            //注册驱动
            // 将类加载进内存，执行静态代码块，注册驱动,mysql5之后的驱动jar包可以省略
            Class.forName("com.mysql.jdbc.Driver");


            //获取数据库连接对象
            //jdbc:mysql://ip地址:端口号/数据库名称
            //若是本机，且为mysql，则可简写为：jdbc:mysql:///数据库名称
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu", "root", "root");



//        String sql="update student set telephone = '46489' where id=1";
//        String sql1="insert student values (2,'li','56898')";
//            String sql2="update student set id=4 where id=2";
            String sql3="delete from student where id=1";

            //获执行sql的对象，Statement
            statement = connection.createStatement();

            //执行sql语句
            //多执行DML（增删改查）语句，返回影响的行数
            int count=statement.executeUpdate(sql3);
            System.out.println(count);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }





    }
}
