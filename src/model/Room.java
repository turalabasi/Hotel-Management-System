package model;

public class Room {
    private long id ;
    private int roomNumber ;
    private String roomType  ;
    private byte situationStatus  ;
    private double price;

    public Room(long id, int roomNumber, String roomType, byte situationStatus, double price) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.situationStatus = situationStatus;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public byte getSituationStatus() {
        return situationStatus;
    }

    public void setSituationStatus(byte situationStatus) {
        this.situationStatus = situationStatus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", situationStatus=" + situationStatus +
                ", price=" + price +
                '}';
    }
}
