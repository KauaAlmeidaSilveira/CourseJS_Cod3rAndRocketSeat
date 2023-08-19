package Model.Entities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        if(checkOut.isBefore(checkIn)){
            throw new IllegalArgumentException("Check-out dates must be future check-in dates!!");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public Integer duration(){
        return checkOut.getDayOfMonth() - checkIn.getDayOfMonth();
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut){
        if(checkIn.isAfter(this.checkIn) && checkOut.isAfter(this.checkOut) && checkIn.isBefore(checkOut)){
            setCheckIn(checkIn);
            setCheckOut(checkOut);
        }else if(!checkIn.isBefore(checkOut)){
            throw new IllegalArgumentException("Check-out dates must be future check-in dates!!");
        }else{
            throw new IllegalArgumentException("Reservation dates for update must be futures dates!!");
        }
    }

    @Override
    public String toString() {
        return "Reservation: " + roomNumber + ", check-in: " + fmt.format(checkIn) + ", check-out: " +
                fmt.format(checkOut) + ", " + duration() + " nights";
    }
}
