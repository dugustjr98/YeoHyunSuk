package my.examples.jdbc.dao;


import my.examples.jdbc.dto.Board;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class boardDaoTest {
    private BoardDaoImpl boardDao;

    @Before
    public void init(){
        boardDao = new BoardDaoImpl();
    }

    @Test
    public void list(){
        int start = 0;
        int limit = 3;
        List<Board> list = null;
        try {
            list = boardDao.getBoards(start,limit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Board board : list) {
            System.out.println(board.getName());
        }
    }
}
