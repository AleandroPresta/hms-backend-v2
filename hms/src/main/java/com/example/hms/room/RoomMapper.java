package com.example.hms.room;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

    public static Iterable<RoomDto> toDtos(Iterable<RoomEntity> rooms) {
        return StreamSupport.stream(rooms.spliterator(), false)
                .map(RoomMapper::toDto)
                .collect(Collectors.toList());
    }

    public static RoomEntity toEntity(RoomDto roomDto) {
        return RoomEntity.builder()
                .id(roomDto.getId())
                .roomName(roomDto.getRoomName())
                .roomType(roomDto.getRoomType())
                .roomCapacity(roomDto.getRoomCapacity())
                .roomLocation(roomDto.getRoomLocation())
                .roomImages(roomDto.getRoomImages())
                .roomSize(roomDto.getRoomSize())
                .roomFeatures(roomDto.getRoomFeatures())
                .bookings(roomDto.getBookings())
                .roomPrice(roomDto.getRoomPrice())
                .roomRating(roomDto.getRoomRating())
                .build();
    }
    
}
