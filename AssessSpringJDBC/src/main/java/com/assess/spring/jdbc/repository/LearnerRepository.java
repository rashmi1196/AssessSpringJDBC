package com.assess.spring.jdbc.repository;

import com.assess.spring.jdbc.dao.Learner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class LearnerRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Learner> getAllLearner() {
        String getLearnerQuery = "Select * from Learner";

        return  jdbcTemplate.query(getLearnerQuery, new LearnerMapper());
    }

    public Learner getLearnerById(int id) {
        String getLearnerByIdQuery = "Select * from Learner where Learner_id= ?";
        return jdbcTemplate.queryForObject(getLearnerByIdQuery, new BeanPropertyRowMapper<Learner>(Learner.class), new Object[]{id});

    }

    public int insertLearner(Learner learner) {
        String insertLearnerQuery = "Insert into Learner values (?,?,?,?,?)";
        return jdbcTemplate.update(insertLearnerQuery, new Object[]{learner.getLearner_id(), learner.getLearner_first_name(), learner.getLearner_last_name(), learner.getLearner_email(), learner.getLearner_password()});
    }

    public int updateLearnerInfo(Learner learner, int id) {
        String updateQuery = "Update Learner " + "Set Learner_first_name = ?,Learner_last_name = ?, Learner_email=?, Learner_password=?" + "where Learner_id=?";
        return jdbcTemplate.update(updateQuery, new Object[]{ learner.getLearner_first_name(), learner.getLearner_last_name(), learner.getLearner_email(), learner.getLearner_password(),id});
    }

    public int deleteLearner(int id) {
        String deleteQuery = "DELETE from Learner " + "where Learner_id=?";
        return jdbcTemplate.update(deleteQuery, new Object[]{id});
    }

    private static final class LearnerMapper implements RowMapper {

        @Override
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            Learner learner = new Learner();
            learner.setLearner_id(rs.getInt("Learner_id"));
            learner.setLearner_first_name(rs.getString("Learner_first_name"));
            learner.setLearner_first_name(rs.getString("Learner_last_name"));
            learner.setLearner_email(rs.getString("Learner_email"));
            learner.setLearner_password(rs.getString("Learner_password"));
            return learner;
        }
    }



}
