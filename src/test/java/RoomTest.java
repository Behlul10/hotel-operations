import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void testCheckIn() {
        //Arrange
        Room rumNumbahOne = new Room(1);

        //Act
        rumNumbahOne.checkIn();
        boolean isDirty = rumNumbahOne.isDirty();

        //Assert
        Assertions.assertEquals(true, rumNumbahOne.isOccupied());
        Assertions.assertEquals(true, isDirty);
    }

    @org.junit.jupiter.api.Test
    void checkOut() {
        //Arrange

        Room davesRoom = new Room(2);

        //Act
        davesRoom.checkIn();
        davesRoom.checkOut();

        //Assert
        Assertions.assertEquals(false, davesRoom.isOccupied());
        Assertions.assertEquals(true, davesRoom.isDirty());

    }

    @org.junit.jupiter.api.Test
    void cleanRoom() {
        //Arrange
        Room myRoom = new Room(3);

        //Act
        myRoom.checkIn();
        myRoom.checkOut();
        myRoom.cleanRoom();

        //Assert
        Assertions.assertEquals(false, myRoom.isDirty());

    }
}