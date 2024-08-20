package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
    //같은 이름의 클래스가 있으면 import는 둘 중 하나만 사용 가능 - 더 자주 사용하는 클래스를 import해줌
}
