package myOwnException;


class MyException extends Exception {
    public MyException() {
    }

    /**
     *
     * @param msg Exception msg
     */
    public MyException(String msg) {
        super(msg);
    }
}

public class Main {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

}



