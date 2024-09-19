package book_study.list_pack;

import java.util.*;

public class VectorMain {
    public static void main(String[] args) {
        //List 컬렉션 중 Vector
        List<Board> list = new Vector<>();

        list.add(new Board("title1", "내용1", "글쓴이1")); //참조값이 0번 인덱스에 저장
        list.add(new Board("title2", "내용2", "글쓴이2"));
        list.add(new Board("title3", "내용3", "글쓴이3"));
        list.add(new Board("title4", "내용4", "글쓴이4"));
        list.add(new Board("title5", "내용5", "글쓴이5"));

        for(int i=0; i<list.size(); i++){
            Board board = list.get(i);
            System.out.println(board);
            System.out.println("subject: " + board.subject + ", content: " + board.content + ", writer: " + board.writer);
        }//for end

        list.remove(2); //new Board("title3", "내용3", "글쓴이3") 삭제, 뒤 인덱스 하나씩 당겨짐
        list.remove(3); //new Board("title5", "내용5", "글쓴이5") 삭제

        System.out.println("-----------------------------------");

        for(int i=0; i<list.size(); i++){
            Board board = list.get(i);
            System.out.println(board);
            System.out.println("subject: " + board.subject + ", content: " + board.content + ", writer: " + board.writer);
        }//for end
    }//main() end
}//class end
