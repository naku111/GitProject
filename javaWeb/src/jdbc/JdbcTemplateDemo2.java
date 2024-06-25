package jdbc;



import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo2 {
    public static void main(String[] args){
        JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="select * from student where id=1";
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(sql);
        //将查询结果封装成map对象，但是只能返回一个对象
        System.out.println(stringObjectMap);
        System.out.println("===================");

        String sql1="select * from student";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql1);
        //将查询结果封装成map对象的集合
        for(Map<String,Object> m:maps){
            System.out.println(m);
        }

        System.out.println("===================");
        List<student> query = jdbcTemplate.query(sql1, new BeanPropertyRowMapper<>(student.class));
        //将查询结果封装成对象的集合
        for (student q:query){
            System.out.println(q);
        }

        String sql2="select count(id) from student";
        Long total= jdbcTemplate.queryForObject(sql2,Long.class);
        //用于聚合函数的查询
        System.out.println(total);
    }
}
