package com.java.beans;

public class Room {
	
    private Integer Room_Id;
    private String Type_Room;
    private Integer prix;
    private String capacity;
    private String Disponibilite;

    public Room(Integer room_Id, String type_Room, Integer roomPrice, String roomcapacity, String dispo) {
        super();
        this.Room_Id = room_Id;
        this.Type_Room = type_Room;
        this.prix = roomPrice;
        this.capacity = roomcapacity;
        this.Disponibilite = dispo;
    }

    public Integer getRoom_Id() {
        return Room_Id;
    }

    public void setRoomId(Integer room_Id) {
        this.Room_Id = room_Id;
    }

    public String getType_Room() {
        return Type_Room;
    }

    public void setType_Room(String type_Room) {
        this.Type_Room = type_Room;
    }

    public Integer getprix() {
        return prix;
    }

    public void setprix(Integer roomPrice) {
        this.prix = roomPrice;
    }

    public String getcapacity() {
        return capacity;
    }

    public void setcapacity(String roomcapacity) {
        this.capacity = roomcapacity;
    }

    public String getDisponibilite() {
        return Disponibilite;
    }

    public void setRoomAvailability(String dispo) {
        this.Disponibilite = dispo;
    }
}