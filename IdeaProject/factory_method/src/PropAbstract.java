import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class PropAbstract  implements  Gongxing{
    JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
    String sql = "select * from factory where id = ?";
    Pattern pattern = jt.queryForObject(sql, new BeanPropertyRowMapper<>(Pattern.class), 2);
    @Override
    public String getJieLun() {

        return pattern.getResult();
    }

    @Override
    public String getRelation() {
        return pattern.getRelation();
    }
}
