package jdbc;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;
//定义一个方法实现将查询到的数据库数据封装在集合中，然后打印
public class JdbcDemo4 {
    public static void main(String[] args) {
        Set<student> selectall = selectall();
        for (student a:selectall){
            System.out.println(a.id+"---"+a.name+"---"+a.telephone);
        }
    }
    public static Set<student> selectall(){
        Set<student> stu=new HashSet<>();
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
            try {
                JDBCUtils.getconnection();//获取连接

                String sql="select * from student order by id desc ";
                statement = connection.createStatement();
                resultSet = statement.executeQuery(sql);

                while (resultSet.next()){
                    int id=resultSet.getInt(1);
                    String name=resultSet.getString("name");
                    String telephone=resultSet.getString(3);
                    stu.add(new student(id,name,telephone));
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            finally {
                JDBCUtils.close(connection,statement,resultSet);
            }

            return stu;
    }
}
