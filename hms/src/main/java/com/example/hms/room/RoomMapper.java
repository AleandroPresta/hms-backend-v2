package com.example.hms.room;

public class RoomMapper {

    public static RoomDto toDto(RoomEntity room) {
        return RoomDto.builder()
                .id(room.getId())
                .roomName(room.getRoomName())
                .roomType(room.getRoomType())
                .build();
    }
    
}
