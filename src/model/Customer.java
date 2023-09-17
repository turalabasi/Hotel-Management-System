package model;

import java.lang.ref.PhantomReference;
import java.time.LocalDateTime;

public class Customer {
    private long id ;
    private String name;
    private String surname ;
    private String phoneNumber ;
    private String email ;
    private String password;
    private double moneyAccount;
    private LocalDateTime reservationDate;
    private LocalDateTime updateDate;
    private LocalDateTime registerDate;
    private LocalDateTime endReservationDate;
    private long roomId;

    public Customer(long id, String name, String surname, String phoneNumber, String email, String password, double moneyAccount, LocalDateTime reservationDate, LocalDateTime updateDate, LocalDateTime registerDate, LocalDateTime endReservationDate, long roomId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.moneyAccount = moneyAccount;
        this.reservationDate = reservationDate;
        this.updateDate = updateDate;
        this.registerDate = registerDate;
        this.endReservationDate = endReservationDate;
        this.roomId = roomId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(double moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    public LocalDateTime getEndReservationDate() {
        return endReservationDate;
    }

    public void setEndReservationDate(LocalDateTime endReservationDate) {
        this.endReservationDate = endReservationDate;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", moneyAccount=" + moneyAccount +
                ", reservationDate=" + reservationDate +
                ", updateDate=" + updateDate +
                ", registerDate=" + registerDate +
                ", endReservationDate=" + endReservationDate +
                ", roomId=" + roomId +
                '}';
    }
}
