package com.example.hms.room;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RoomService {

    private RoomRepository roomRepository;

    public RoomDto getRoomById(Long id) {
        RoomEntity room = roomRepository
            .findById(id)
            .orElseThrow(
                () -> new RuntimeException("Room not found")
                );
        return RoomMapper.toDto(room);
    }

    public Iterable<RoomDto> getAllRooms() {
        Iterable<RoomEntity> rooms = roomRepository.findAll();
        return RoomMapper.toDtos(rooms);
    }

    public RoomDto createRoom(RoomDto roomDto) {
        RoomEntity room = RoomMapper.toEntity(roomDto);
        RoomEntity savedRoom = roomRepository.save(room);
        return RoomMapper.toDto(savedRoom);
    }

    public RoomDto deleteRoom(Long id) {
        RoomEntity deletedRoom = roomRepository
            .findById(id)
            .orElseThrow(
                () -> new RuntimeException("Room not found")
            );

        // Fetch collections to avoid lazy initialization exception
        deletedRoom.getBookings().size();
        deletedRoom.getRoomFeatures().size();
        deletedRoom.getRoomImages().size();
    
        roomRepository.deleteById(id);
    
        return RoomMapper.toDto(deletedRoom);
    }

    public RoomDto updateRoom(Long id, RoomDto roomDto) {
        RoomEntity room = roomRepository
            .findById(id)
            .orElseThrow(
                () -> new RuntimeException("Room not found")
            );

        room.setRoomName(roomDto.getRoomName());
        room.setRoomType(roomDto.getRoomType());
        room.setRoomCapacity(roomDto.getRoomCapacity());
        room.setRoomLocation(roomDto.getRoomLocation());
        room.setRoomImages(roomDto.getRoomImages());
        room.setRoomSize(roomDto.getRoomSize());
        room.setRoomFeatures(roomDto.getRoomFeatures());
        // To avoid discrepancies we don't update bookings
        room.setRoomPrice(roomDto.getRoomPrice());
        room.setRoomRating(roomDto.getRoomRating());

        RoomEntity updatedRoom = roomRepository.save(room);

        return RoomMapper.toDto(updatedRoom);
    }
    
}
