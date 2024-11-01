package com.example.hms.room;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RoomService {

    private RoomRepository roomRepository;

    public RoomDto getRoomById(Long id) {
        RoomEntity room = roomRepository.findById(id).orElseThrow(() -> new RuntimeException("Room not found"));
        return RoomMapper.toDto(room);
    }
    
}
