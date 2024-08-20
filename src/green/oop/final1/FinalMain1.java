package green.oop.final1;

import java.util.Calendar;

public class FinalMain1 {

    public static void main(String[] args) {
        //final
        //-> final 변수 : 변수를 상수화, 변수 초기값 지정 후 더 이상 값을 변경할 수 없다 - javascript에서 const
        //-> final 함수 : 상속관계에서 더 이상 재정의(override)할 수 없도록 막아놓는 용도
        //-> final 클래스 : 종단 클래스, 더 이상 후손 클래스를 생성할 수 없다. 클래스 자체를 수정할 수 없기 때문
        int a=3;
        System.out.println("a= " + a);
        a = 10;
        System.out.println("a 값 변경 a= " + a);

        final int b = 10;
        System.out.println("b = " + b);
        //b = 20; //에러. final 변수는 값을 변경할 수 없다

        System.out.println(Math.E);
        System.out.println(Math.PI);
        //Math클래스의 상수(static final)로 클래스에 직접 접근하여 사용하고, 값을 수정할 수 없다

//        System.out.println(Calendar.YEAR);
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        System.out.println(currentYear);

        int currentMonth = calendar.get(Calendar.MONTH);
        System.out.println(currentMonth);//0부터 계산되기 때문에 현재 월 수를 출력하려면 +1
        System.out.println(currentMonth+1);

        int currentDate = calendar.get(Calendar.DATE);
        System.out.println(currentDate);


    }
}
