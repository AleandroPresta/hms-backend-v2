package com.example.hms.room;

import java.util.List;

import com.example.hms.booking.BookingEntity;
import com.example.hms.room.RoomEntity.RoomType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomDto {

    private Long id;
    private String roomName;
    private RoomType roomType;
    private int roomCapacity;
    private String roomLocation;
    private List<String> roomImages;
    private int roomSize;
    private List<String> roomFeatures;
    private List<BookingEntity> bookings;
    private Double roomPrice;
    private Double roomRating;
    

    // TODO complete with the other fields
    
}
