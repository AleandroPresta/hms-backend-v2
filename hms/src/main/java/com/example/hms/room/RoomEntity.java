package com.example.hms.room;

import java.util.List;

import com.example.hms.booking.BookingEntity;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RoomEntity {

    public enum roomType {
        SUITE,
        DELUXE_ROOM,
        STANDARD_ROOM,
        ECONOMY_ROOM,
        PENTHOUSE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "room_name")
    private String roomName;

    @Column(name = "room_type")
    private roomType roomType;
    
    @Column(name = "room_capacity")
    private int roomCapacity;

    @Column(name = "room_location")
    private String roomLocation;

    @ElementCollection
    @CollectionTable(name = "room_images", joinColumns = @JoinColumn(name = "room_id"))
    @Column(name = "image_url")
    private List<String> roomImages;

    @Column(name = "size")
    private int roomSize;

    @ElementCollection
    @CollectionTable(name = "room_features", joinColumns = @JoinColumn(name = "room_id"))
    @Column(name = "room_features")
    private List<String> roomFeatures;

    @OneToMany(mappedBy = "room")
    private List<BookingEntity> bookings;

    @Column(name = "room_price")
    private Double roomPrice;

    @Column(name = "room_rating")
    private Double roomRating;

}


