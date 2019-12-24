class Hello {
    static String name="world!";
    Hello(String name) {
        this.name=name;
    }
    static void sayHello() {
        System.out.println("hello " + name);
    }
    public static void main(String[] args) {
        sayHello();
    }
}
