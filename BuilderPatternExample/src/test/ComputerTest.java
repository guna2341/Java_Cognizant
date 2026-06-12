package test;
import ComputerClass.Impl.Computer;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ComputerTest {

    @Test
    public void BuilderTest() {
        Computer.Builder obj1 = new Computer.Builder().setCPU("Intel-7").setSTORAGE("512GB").setRAM("16GB");
        Computer c1 = obj1.build();
        assertNotNull(c1);
        assertTrue(c1.getCPU().equals("Intel-7"));
        assertTrue(c1.getSTORAGE().equals("512GB"));
        assertTrue(c1.getRAM().equals("16GB"));

        Computer.Builder obj2 = new Computer.Builder().setCPU("RYZEN-5").setSTORAGE("1024GB").setRAM("32GB");
        Computer c2 = obj2.build();
        assertNotNull(c2);
        assertTrue(c2.getCPU().equals("RYZEN-5"));
        assertTrue(c2.getSTORAGE().equals("1024GB"));
        assertTrue(c2.getRAM().equals("32GB"));
    }

}
