package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    Tank tank=new Tank();

    @Test
    void testModifyAngle(){
        tank.modifyAngle(50);
        tank.modifyAngle(-100);

        assertEquals(310,tank.getAngle());
    }

    @Test
    void testModifyAngleFail(){
        tank.modifyAngle(50);
        IllegalArgumentException e=assertThrows(IllegalArgumentException.class,()->
                tank.modifyAngle(-150));

        assertEquals("Illegal cannon position!",e.getMessage());
    }
}