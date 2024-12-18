public class Room {
    private int roomId;
    private String roomType;
    private String roomStatus;
    private double price;
    private String bedType;

    public Room(int roomId, String roomType, String roomStatus, double price, String bedType) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.roomStatus = roomStatus;
        this.price = price;
        this.bedType = bedType;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomStatus(String status) {
        this.roomStatus = status;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public double getPrice() {
        return price;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getBedType() {
        return bedType;
    }
}