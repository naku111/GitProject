package jdbc;



import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo1 {
    public static void main(String[] args){
        JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="update student set id=4 where name=?";
        int count = jdbcTemplate.update(sql,"li");
        System.out.println(count);
    }
}
