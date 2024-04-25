package com.exemplu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class MasinaJdbcDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Masina> findAll(){
        String sql="select * from masini";
        return jdbcTemplate.query(sql, new MasinaMapper());
    }
    public Masina findById(int id){
        String sql="select * from masini where id=?";
        return jdbcTemplate.queryForObject(sql,new MasinaMapper(),id);
    }
    public int deleteById(int id){
        String sql="delete from persoane where id=?";
        return jdbcTemplate.update(sql, id);
    }
    public int insert(Masina m){
        String sql="insert into masina values(?,?,?,?,?)";
        return jdbcTemplate.update(sql, m.getId(),m.getNr_inmatriculare(),m.getMarca(), m.getAnf(), m.getCuloare(), m.getNrkm());
    }
    public int update(Masina m){
        String sql="update masina set nrkm=?,culoare=? where id=?";
        return jdbcTemplate.update(sql, m.getNrkm(), m.getCuloare());
    }
}
