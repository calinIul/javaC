package com.exemplu;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
public class MasinaMapper implements RowMapper<Masina>{
    @Override
    public Masina mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Masina(rs.getInt("id"), rs.getString("nr_inmatriculare"), rs.getString("marca"), rs.getInt("anf"), rs.getString("culoare"), rs.getInt("nrkm"));
    }
}
