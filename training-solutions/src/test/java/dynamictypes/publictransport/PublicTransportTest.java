package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testPublicVehicles() {
        PublicVehicle metro = new Metro(2, 73.1, 20);
        PublicVehicle bus = new Bus(7, 15.1, "Volvo");
        PublicVehicle tram = new Tram(28, 32.3, 3);


        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(metro);
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);


        assertEquals(3, publicTransport.getPublicVehicles().size());
        assertEquals(28, publicTransport.getPublicVehicles().get(2).getLineNumber());
    }
}