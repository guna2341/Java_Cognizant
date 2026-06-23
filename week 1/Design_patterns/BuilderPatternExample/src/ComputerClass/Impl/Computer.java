package ComputerClass.Impl;

import ComputerClass.ComputerBuilderInterface;
import ComputerClass.ComputerInterface;

public class Computer implements ComputerInterface {

    private String CPU = null;
    private String RAM = null;
    private String STORAGE = null;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.STORAGE = builder.STORAGE;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }

    public String getRAM() {
        return this.RAM;
    }

    public String getSTORAGE() {
        return this.STORAGE;
    }

    @Override
    public String toString() {
        return "CPU: " + this.CPU + " RAM: " + this.RAM + " STORAGE: " + this.STORAGE;
    }

    public static class Builder implements ComputerBuilderInterface {

        String CPU = null;
        String RAM = null;
        String STORAGE = null;

        @Override
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        @Override
        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        @Override
        public Builder setSTORAGE(String STORAGE) {
            this.STORAGE = STORAGE;
            return this;
        }

        @Override
        public Computer build() {
            return new Computer(this);
        }

    }

}
