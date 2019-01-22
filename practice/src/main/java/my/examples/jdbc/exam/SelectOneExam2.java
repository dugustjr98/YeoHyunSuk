package my.examples.jdbc.exam;

import my.examples.jdbc.dao.BoardDao;
import my.examples.jdbc.dao.BoardDaoImpl;
import my.examples.jdbc.dto.Board;

public class SelectOneExam2 {
    public static void main(String[] args){
        BoardDao boardDao = new BoardDaoImpl();
        Board board = boardDao.getBoard(6L);
        System.out.println(board);
    }
}
