class StaticBlock {
    static int value;

    // Static block for initialization - Get executed once the class is loaded into the memory
    static {
        System.out.println("Static block executed.");
        value = 100;
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
        System.out.println("Value: " + value);
    }
}
