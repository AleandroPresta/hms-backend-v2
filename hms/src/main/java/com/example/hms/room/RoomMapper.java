package com.example.hms.room;

public class RoomMapper {

    public static RoomDto toDto(RoomEntity room) {
        return RoomDto.builder()
                .id(room.getId())
                .roomName(room.getRoomName())
                .roomType(room.getRoomType())
                .roomCapacity(room.getRoomCapacity())
                .roomLocation(room.getRoomLocation())
                .roomImages(room.getRoomImages())
                .roomSize(room.getRoomSize())
                .roomFeatures(room.getRoomFeatures())
                .bookings(room.getBookings())
                .roomPrice(room.getRoomPrice())
                .roomRating(room.getRoomRating())
                .build();
    }
    
}
