package my.examples.springjdbc.dao;

public class UserDaoSqls {
	public static final String SELECT_USERS =
			"SELECT id, name, nickname, email, passwd, regdate from user";
}
