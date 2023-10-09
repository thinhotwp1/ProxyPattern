package proxypattern;

public class RealObjectImpl implements RealObject {
    public void request() {
        System.out.println("Object thật: Thực hiện request");
    }
}