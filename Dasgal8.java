public class Dasgal8 {
    public static void main(String[] args) {
        PrivateClass privateObj = new PrivateClass();
        PublicClass publicObj = new PublicClass();
        
        publicObj.publicMethod();
        privateObj.accessPrivateMethod();
    }
}

class PrivateClass {
    private int privateField = 10;
    
    private void privateMethod() {
        System.out.println("Private method, value: " + privateField);
    }
    
    public void accessPrivateMethod() {
        privateMethod();
    }
}

class PublicClass {
    public void publicMethod() {
        System.out.println("Public method is accessible everywhere");
    }
}