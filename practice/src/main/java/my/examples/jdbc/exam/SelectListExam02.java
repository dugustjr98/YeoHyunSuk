package my.examples.jdbc.exam;

import my.examples.jdbc.dao.BoardDao;
import my.examples.jdbc.dao.BoardDaoImpl;
import my.examples.jdbc.dto.Board;

import java.util.List;

public class SelectListExam02 {
    public static void main(String[] args){
        BoardDao boardDao = new BoardDaoImpl();
        List<Board> boards = boardDao.getBoards(0, 3);
        for(Board board : boards){
            System.out.println(board);
        }
    }
}
