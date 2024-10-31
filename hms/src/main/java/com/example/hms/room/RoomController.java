package com.example.hms.room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hms.booking.BookingEntity;
import com.example.hms.room.RoomEntity.RoomType;
import com.example.hms.test.TestRepository;

@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @GetMapping("welcome")
    public String welcome() {
        return "Welcome to HMS's room section";
    }

    @GetMapping("mockadd")
    public String addRoom() {
        RoomEntity room = createMockRoom();
        
        roomRepository.save(room);

        return "Added room with id: " + room.getId();
    }

    @GetMapping("all")
    public ResponseEntity<List<RoomEntity>> getAllRooms() {
        List<RoomEntity> rooms = roomRepository.findAll();
        return ResponseEntity.ok(rooms);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<RoomEntity>> getRoomById(@PathVariable Long id) {
        Optional<RoomEntity> room = roomRepository.findById(id);
        return ResponseEntity.ok(room);
    }

    @DeleteMapping("{id}/delete")
    public ResponseEntity<Optional<RoomEntity>> deleteRoom(@PathVariable Long id) {
        roomRepository.deleteById(id);
        return ResponseEntity.ok(null);
    }

    public RoomEntity createMockRoom() {
        RoomEntity room = new RoomEntity();

        // Today
        Date startDate = new Date();
        // Tomorrow
        Date endDate = new Date(startDate.getTime() + (1000 * 60 * 60 * 24));

        BookingEntity booking = new BookingEntity();
        // booking.setRoom(room); TODO understand if this is the problem for multiple creation
        booking.setStartDate(startDate);
        booking.setEndDate(endDate);

        List<BookingEntity> bookings = new ArrayList<>();
        bookings.add(booking);

        room.setBookings(bookings);

        return room;
    }
    
}
