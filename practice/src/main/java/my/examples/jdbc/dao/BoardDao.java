package my.examples.jdbc.dao;

import my.examples.jdbc.dto.Board;

import java.util.List;

public interface BoardDao {
    public Board getBoard(Long id);
    public List<Board> getBoards(int start, int limit);
    public void addBoard(Board board);
    public void deleteBoard(Long id);
    public void updateReadCount(Long id);

}
