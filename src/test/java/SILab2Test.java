import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    private List<Item> itemsList(Item...elems){
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void EveryBranchUnitTests(){
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 200));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(itemsList(new Item(null, "3n1", 200, 0.1f)), 500));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

        assertTrue(SILab2.checkCart(itemsList(new Item("chair", "036743", 400, 0.2f)), 500));

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(itemsList(new Item("chair", null, 200, 0.1f)), 500));
        assertTrue(ex.getMessage().contains("No barcode!"));

        assertTrue(SILab2.checkCart(itemsList(new Item("chair", "036743", 400, 0)), 400));

        assertFalse(SILab2.checkCart(itemsList(new Item("chair", "036743", 400, 1.5f)), 400));
    }

    @Test
    void MultipleConditionUnitTests(){
        assertTrue(SILab2.checkCart(itemsList(new Item("item", "036743", 400, 0.1f)), 500));

        assertTrue(SILab2.checkCart(itemsList(new Item("item", "136743", 400, 0.1f)), 500));

        assertTrue(SILab2.checkCart(itemsList(new Item("item", "136743", 400, 0.1f)), 500));

        assertTrue(SILab2.checkCart(itemsList(new Item("item", "136743", 300, 0.5f)), 500));
    }
}
