import ComputerClass.Impl.Computer;

public class Main {
    public static void main(String[] args) {

        Computer.Builder obj = new Computer.Builder();
        obj.setCPU("Intel-7").setSTORAGE("500GB").setRAM("16GB");
        System.out.println(obj.build());

    }
}