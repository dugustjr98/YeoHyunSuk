package my.example.firstweb.webexample;

import java.util.ArrayList;
import java.util.List;

public class BoardList {
   private  List<Board> boardList;
    public BoardList(){
        List<Board> boardList = new ArrayList<>();
        boardList.add(new Board("kim","김씨","김씨입니다",1));
        boardList.add(new Board("lee","이씨","이씨입니다",2));
        boardList.add(new Board("yeo","여씨","여씨입니다",3));
        boardList.add(new Board("ooo","오씨","오씨입니다",4));
        boardList.add(new Board("park","박씨","박씨입니다",5));
        this.boardList=boardList;
    }

    public List<Board> getBoardList() {
        return boardList;
    }

    public void setBoardList(List<Board> boardList) {
        this.boardList = boardList;
    }
}
