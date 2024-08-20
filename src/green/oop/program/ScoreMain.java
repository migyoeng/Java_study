package green.oop.program;

public class ScoreMain {

    public static void main(String[] args) {
        /*
		 ** 시험결과 **
			====================================
			번호  이름   1  2  3  4  5  점수  등수
			------------------------------------
			1   홍길동  O  X  O  O  O   80   2
			2   무궁화  O  O  O  O  O  100   1
			3   라일락  X  X  X  X  O   20   5
			4   진달래  X  O  X  O  O   60   3
			5   봉선화  O  O  X  X  X   40   4
			- 맞은문제 O, 틀린문제 X표시
			- 점수: O당 20점씩
			- 등수: 점수를 기준으로 높은사람이 1등
		*/
        Score student1 = new Score(1, "홍길동", 5,4,3,3,3);
        Score student2 = new Score(2, "무궁화", 3,3,3,3,3);
        Score student3 = new Score(3, "라일락", 1,1,1,1,3);
        Score student4 = new Score(4, "진달래", 2,3,2,3,3);
        Score student5 = new Score(5, "봉선화", 3,3,2,2,2);

        Score[] students = {student1, student2, student3, student4, student5};

        //학생별 답안지 채점(O,X 표시)
        for (Score student : students) {
            student.checkAnswer();
            System.out.println(student.getScore());
        }//for end

        //순위 구하기
        //공동 순위가 있는 경우 추가
        for(int i=0; i<students.length; i++){
            for(int j=0; j<students.length; j++){
                if(students[i].getScore() < students[j].getScore()){
                    students[i].rank++;
                } else if(students[i].getScore() == students[j].getScore() && i < j){
                    students[i].rank++;
                    students[j].rank++;
                }
            }//j for end
        }//i for end

        //학생별 점수 ~ 등수 출력
        for (Score student : students) {
            student.printScore();
        }//for end


    }//main end
}
