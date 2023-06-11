package catchingExceptionHierarchy;

class MyParentException extends Exception {
}
class MyChildException extends MyParentException {
}
class MyGrandSonException extends MyChildException {
}
public class Main {
    public static void main(String[] args) {
        try {
            throw new MyGrandSonException();
        } catch (MyChildException s) {
            s.printStackTrace();
        } catch (MyParentException a) {
            a.printStackTrace();
        }
    }
}
