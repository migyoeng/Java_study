package green.oop.program;

public class Score {
    //field
    private int studentNum;//학생 번호
    private String name;//이름
    private char[] result = new char[5];//답안지 채점 결과 배열(O,X) 표시
    private int[] answer = new int[5];//개인별 답안지 배열
    private int score;//점수(한 문제당 20점)
    public int rank;//등수

    //constructor

    public Score(int studentNum, String name, int a1, int a2, int a3, int a4, int a5) {
        this.studentNum = studentNum;
        this.name = name;
        this.answer[0] = a1;
        this.answer[1] = a2;
        this.answer[2] = a3;
        this.answer[3] = a4;
        this.answer[4] = a5;
        this.rank = 1;
    }//end

    //method


    public int getScore() {
        return score;
    }

    //OX 표시 메소드
    public void checkAnswer(){
        //정답
        int[] correctAnswer = {3,3,3,3,3};

        for(int i=0; i<correctAnswer.length; i++){
            if(this.answer[i] == correctAnswer[i]){
                result[i] = 'O';
                this.score += 20;
            } else {
                result[i] = 'X';
            }
        }//for end
    }//checkAnswer() end

    public void printScore(){
        System.out.print(studentNum + " ");
        System.out.print(name + " ");
        System.out.print(result[0] + " ");
        System.out.print(result[1] + " ");
        System.out.print(result[2] + " ");
        System.out.print(result[3] + " ");
        System.out.print(result[4] + " ");
        System.out.print(score + " ");
        System.out.println(rank + " ");
    }//printScore() end

}//class end
