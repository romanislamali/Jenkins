public class TestJenkins {
    public static void main(String[] args) {
        System.out.println("This is my first Jenkins project:");
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.hello();
        System.out.println("The result of the sum is: "+ HelloWorld.doSum());
    }
}