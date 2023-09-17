package model;

import java.time.LocalDateTime;

public class Reservation {
    private long id;
    private String customerEmail;
    private int roomNumber;
    private double roomPrice;
    private LocalDateTime reservationDate;
    private LocalDateTime endReservationDate;

    public Reservation(long id, String customerEmail, int roomNumber, double roomPrice, LocalDateTime reservationDate, LocalDateTime endReservationDate) {
        this.id = id;
        this.customerEmail = customerEmail;
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.reservationDate = reservationDate;
        this.endReservationDate = endReservationDate;
    }

    public long getId() {
        return id;
    }



    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getEndReservationDate() {
        return endReservationDate;
    }

    public LocalDateTime setEndReservationDate(LocalDateTime endReservationDate) {
        this.endReservationDate = endReservationDate;
        return endReservationDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", customerEmail='" + customerEmail + '\'' +
                ", roomNumber=" + roomNumber +
                ", roomPrice=" + roomPrice +
                ", reservationDate=" + reservationDate +
                ", endReservationDate=" + endReservationDate +
                '}';
    }
}
