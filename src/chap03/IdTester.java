package chap03;

public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println("a 아이디: " + a.getId());
        System.out.println("b 아이디: " + b.getId());

        System.out.println("부여한 아이디 개수: " + Id.getCounter());
    }
}
