package com.bjit.training.DAO;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bjit.training.model.User;

public class UserDAOImpl implements UserDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void createUser(User user) {
		String sql = "insert into user (name, age, address, gender, email, password, type) values (?,?,?,?,?,?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql, new Object[] { user.getName(), user.getAge(), user.getAddress(), user.getGender(),
				user.getEmail(), user.getPassword(), user.getType() });

		System.out.println("Inserted into User Table Successfully.\n");

	}

	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}

	public void updateUser(Integer userId, User user) {
		// TODO Auto-generated method stub

	}

	public List<User> searchAll() {

		String sql = "select * from user where type != 'admin'";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));

		
		return userList;
	}

	public User searchUser(String email, String password) {

		String sql = String.format("select * from user where email=\"%s\" and password=\"%s\"", email, password);
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<User> user = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));

		for (User u : user) {
			return u;
		}

		return null;
	}
	
	public User searchByEmail(String email) {

		String sql = String.format("select * from user where email=\"%s\"", email);
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<User> user = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));

		for (User u : user) {
			return u;
		}

		return null;
	}

	public void deleteUser(String email) {
		// TODO Auto-generated method stub
		String query = "delete from user where email=?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(query, email);
		
	}
	
	public void updateUserByEmail(User user){
		String query = "update user set name = ?, age = ?, address = ?, gender = ?, password = ?, type = ? where email = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(query, new Object[] { user.getName(), user.getAge(),
				user.getAddress(), user.getGender(),user.getPassword(),user.getType(),user.getEmail()});
		
	}

}
