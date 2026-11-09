public class Room {

    private float price;
    private int numBeds;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;


    public void checkIn() {
        this.isOccupied = true;
    }

    public void checkOut() {
        this.isOccupied = false;
    }

    public void cleanRoom() {
        this.isDirty = false;
    }

    public int getNumberOfBeds() { return this.numBeds; }

    public float getPrice() { return this.price; }

    public boolean isOccupied() { return this.isOccupied; }

    public boolean isDirty() { return this.isDirty; }

    public boolean isAvailable() { return this.isAvailable; }

}
