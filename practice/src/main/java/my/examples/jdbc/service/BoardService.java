package my.examples.jdbc.service;

import my.examples.jdbc.dto.Board;

import java.util.List;

public interface BoardService {
    public List<Board> getBoards(int page);
    public Board getBoard(Long id);
    public void deleteBoard(Long id);
    public void addBoard(Board board);
}
