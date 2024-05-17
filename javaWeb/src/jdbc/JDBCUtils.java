package jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {

    //抽象数据库连接方法和释放资源
    private static String url;
    private static String user;
    private static String passord;
    private static String driver;

    static {
        //1. 创建Properties集合类，用以加载配置文件
        Properties pro=new Properties();

        //获取src路径下的文件的方式--->ClassLoader 类加载器
        ClassLoader classLoader=JDBCUtils.class.getClassLoader();
        URL resource = classLoader.getResource("jdbc.properties");
        String path = resource.getPath();

        //2. 加载文件
        try {
            pro.load(new FileReader(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //3. 获取数据，赋值
        url = pro.getProperty("url");
        user = pro.getProperty("user");
        passord = pro.getProperty("password");
        driver = pro.getProperty("driver");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    //获取数据库连接
    public static Connection getconnection() throws SQLException {
        return DriverManager.getConnection(url,user,passord);
    }

    /*
    释放资源*/
    public static void close(Connection connection,Statement statement,ResultSet resultSet){
        if(resultSet!=null){
        try {
            resultSet.close();
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
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
