package jdbc;

import java.sql.*;

public class JdbcDemo2 {
    //获取一行数据
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        try{
            //注册驱动
            // 将类加载进内存，执行静态代码块，注册驱动,mysql5之后的驱动jar包可以省略
            Class.forName("com.mysql.jdbc.Driver");


            //获取数据库连接对象
            //jdbc:mysql://ip地址:端口号/数据库名称
            //若是本机，且为mysql，则可简写为：jdbc:mysql:///数据库名称
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu", "root", "root");

            
            String sql="select * from student";

            //获执行sql的对象，Statement
            statement = connection.createStatement();

            //执行查询语句，返回结果集
            resultSet = statement.executeQuery(sql);

            //游标下移一行,指到下一行
            resultSet.next();

            //resultSet.getxxx():获取查询结果中的一行一列数据，有重载
            int anInt = resultSet.getInt(1);//getxxx:xxx为列的类型，columnindex为第几列
            String name = resultSet.getString("name");
            String telephone = resultSet.getString(3);
            System.out.println(anInt+"------"+name+"------"+telephone);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
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
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
