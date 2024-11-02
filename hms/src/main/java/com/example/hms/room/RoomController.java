package com.example.hms.room;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/rooms")
public class RoomController {

    private RoomService roomService;

    @GetMapping("welcome")
    public String welcome() {
        return "Welcome to HMS's room section";
    }

    @GetMapping("all")
    public ResponseEntity<Iterable<RoomDto>> getAllRooms() {
        Iterable<RoomDto> rooms = roomService.getAllRooms();
        return ResponseEntity.ok(rooms);
    }

    @GetMapping("{id}")
    public ResponseEntity<RoomDto> getRoomById(@PathVariable Long id) {
        RoomDto roomDto = roomService.getRoomById(id);
        return new ResponseEntity<>(roomDto, HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<RoomDto> createRoom(@RequestBody RoomDto roomDto) {
        RoomDto savedRoom = roomService.createRoom(roomDto);
        return new ResponseEntity<>(savedRoom, HttpStatus.CREATED);
    }

    @DeleteMapping("{id}/delete")
    public ResponseEntity<RoomDto> deleteRoom(@PathVariable Long id) {
        RoomDto deletedRoom = roomService.deleteRoom(id);
        return ResponseEntity.ok(deletedRoom);
    }

    @PutMapping("{id}/update")
    public ResponseEntity<RoomDto> updateRoom(@PathVariable Long id, @RequestBody RoomDto roomDto) {
        RoomDto updatedRoom = roomService.updateRoom(id, roomDto);
        return ResponseEntity.ok(updatedRoom);
    }
    
}
