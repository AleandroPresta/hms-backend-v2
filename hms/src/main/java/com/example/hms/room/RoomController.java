package com.example.hms.room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hms.booking.BookingEntity;
import com.example.hms.room.RoomEntity.RoomType;

import lombok.AllArgsConstructor;

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

    public RoomEntity createMockRoom() {
        RoomEntity room = RoomEntity.builder()
                .roomName("Room 101")
                .roomType(RoomType.DELUXE_ROOM)
                .roomCapacity(2)
                .roomLocation("1st floor")
                .roomImages(Arrays.asList("image1.jpg", "image2.jpg"))
                .roomSize(5)
                .roomFeatures(Arrays.asList("TV", "AC", "Mini Fridge"))
                .roomPrice(100.0)
                .roomRating(4.5)
                .build();

        // Today
        Date startDate = new Date();
        // Tomorrow
        Date endDate = new Date(startDate.getTime() + (1000 * 60 * 60 * 24));

        BookingEntity booking = BookingEntity.builder()
            .startDate(startDate)
            .endDate(endDate)
            .room(room)
            .build();

        List<BookingEntity> bookings = new ArrayList<>();
        bookings.add(booking);

        room.setBookings(bookings);

        return room;
    }
    
}
