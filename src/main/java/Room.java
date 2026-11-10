public class Room {

    private float price;
    private int numBeds;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;
    private int roomNumber;

    public Room (int roomNumber) {
        this.roomNumber = roomNumber;
        this.isAvailable = isAvailable;
    }

    public void checkIn() {
        this.isOccupied = true;
        this.isDirty = true;
    }

    public void checkOut() {
        this.isOccupied = false;
    }

    public void cleanRoom() { this.isDirty = false; }


    public int getNumberOfBeds() { return this.numBeds; }

    public float getPrice() { return this.price; }

    public boolean isOccupied() { return this.isOccupied; }

    public boolean isDirty() { return this.isDirty; }

    public boolean isAvailable() { return this.isAvailable; }

    public void display() {
        System.out.printf("""
                -------------info-------------
                Room number: %s
                Is dirty: %b
                """, this.roomNumber, this.isDirty());
    }

}
