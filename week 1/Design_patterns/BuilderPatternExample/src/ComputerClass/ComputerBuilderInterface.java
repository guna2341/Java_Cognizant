package ComputerClass;

import ComputerClass.Impl.Computer;

public interface ComputerBuilderInterface {

    public Computer.Builder setCPU(String CPU);

    public Computer.Builder setRAM(String RAM);

    public Computer.Builder setSTORAGE(String STORAGE);

    public Computer build();

}
