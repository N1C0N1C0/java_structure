package chap03;

class Id {
    private static int counter = 0;
    private int id;

    public Id() {
        id = ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }
}

public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println("aのID：　"+ a.getId());
        System.out.println("bのID：　"+ b.getId());

        System.out.println("付与したIDの個数：　"+ Id.getCounter());
    }
}
