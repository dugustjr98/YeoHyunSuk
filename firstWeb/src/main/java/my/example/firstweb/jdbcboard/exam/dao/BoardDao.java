package my.example.firstweb.jdbcboard.exam.dao;

import my.example.firstweb.jdbcboard.exam.dto.Board;

import java.util.List;

//Dao : Data Access Object
public interface BoardDao {
    public Board getBoard(Long id);
    public List<Board> getBoards(int start, int limit);
}
