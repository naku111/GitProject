package jdbc;

import java.sql.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JdbcPrepStatement {

    //执行动态sql语句

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        Set<student> selectall = selectall(name);
        for (student a:selectall){
            System.out.println(a.id+"---"+a.name+"---"+a.telephone);
        }
    }
    public static Set<student> selectall(String name){
        Set<student> stu=new HashSet<>();
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            connection= JDBCUtils_1.getconnection();//获取连接
            String sql="select * from student where name=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name1=resultSet.getString("name");
                String telephone=resultSet.getString(3);
                stu.add(new student(id,name1,telephone));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            JDBCUtils_1.close(connection,preparedStatement,resultSet);
        }

        return stu;
    }
}
