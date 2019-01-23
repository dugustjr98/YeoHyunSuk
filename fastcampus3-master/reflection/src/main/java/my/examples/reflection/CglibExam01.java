package my.examples.reflection;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;

import java.util.Date;

public class CglibExam01 {
    public static void main(String[] args){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(BoardService.class);
        Board board = new Board();
        board.setId(100L);
        board.setName("kang");
        board.setTitle("title111");
        board.setContent("content111");
        board.setReadCount(500);
        board.setRegdate(new Date());
        enhancer.setCallback((FixedValue) () -> board);
        BoardService proxy = (BoardService) enhancer.create();

        Board result = proxy.getBoard(null);

        System.out.println(result);
    }
}
