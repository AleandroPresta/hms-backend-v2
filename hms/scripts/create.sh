curl -X POST http://localhost:8080/api/v1/rooms/create \
-H "Content-Type: application/json" \
-d '{
  "roomName": "Room 103",
  "roomType": "SUITE",
  "roomCapacity": 4,
  "roomLocation": "3rd floor",
  "roomImages": ["https://picsum.photos/seed/Room103_1/800/600", "https://picsum.photos/seed/Room103_2/800/600", "https://picsum.photos/seed/Room103_3/800/600"],
  "roomSize": 10,
  "roomFeatures": ["WiFi", "TV", "Mini Fridge", "Jacuzzi"],
  "roomPrice": 300.0,
  "roomRating": 4.9,
  "bookings": [ ]
}'

curl -X POST http://localhost:8080/api/v1/rooms/create \
-H "Content-Type: application/json" \
-d '{
  "roomName": "Room 104",
  "roomType": "STANDARD_ROOM",
  "roomCapacity": 2,
  "roomLocation": "1st floor",
  "roomImages": ["https://picsum.photos/seed/Room104_1/800/600", "https://picsum.photos/seed/Room104_2/800/600", "https://picsum.photos/seed/Room104_3/800/600"],
  "roomSize": 5,
  "roomFeatures": ["WiFi", "TV"],
  "roomPrice": 100.0,
  "roomRating": 4.5,
  "bookings": [ ]
}'

curl -X POST http://localhost:8080/api/v1/rooms/create \
-H "Content-Type: application/json" \
-d '{
  "roomName": "Room 105",
  "roomType": "ECONOMY_ROOM",
  "roomCapacity": 1,
  "roomLocation": "1st floor",
  "roomImages": ["https://picsum.photos/seed/Room105_1/800/600", "https://picsum.photos/seed/Room105_2/800/600", "https://picsum.photos/seed/Room105_3/800/600"],
  "roomSize": 3,
  "roomFeatures": ["WiFi"],
  "roomPrice": 50.0,
  "roomRating": 4.0,
  "bookings": [ ]
}'

curl -X POST http://localhost:8080/api/v1/rooms/create \
-H "Content-Type: application/json" \
-d '{
  "roomName": "Room 106",
  "roomType": "PENTHOUSE",
  "roomCapacity": 6,
  "roomLocation": "5th floor",
  "roomImages": ["https://picsum.photos/seed/Room106_1/800/600", "https://picsum.photos/seed/Room106_2/800/600", "https://picsum.photos/seed/Room106_3/800/600"],
  "roomSize": 15,
  "roomFeatures": ["WiFi", "TV", "Mini Fridge", "Jacuzzi", "Balcony"],
  "roomPrice": 500.0,
  "roomRating": 5.0,
  "bookings": [ ]
}'

curl -X POST http://localhost:8080/api/v1/rooms/create \
-H "Content-Type: application/json" \
-d '{
  "roomName": "Room 107",
  "roomType": "DELUXE_ROOM",
  "roomCapacity": 2,
  "roomLocation": "2nd floor",
  "roomImages": ["https://picsum.photos/seed/Room107_1/800/600", "https://picsum.photos/seed/Room107_2/800/600", "https://picsum.photos/seed/Room107_3/800/600"],
  "roomSize": 6,
  "roomFeatures": ["WiFi", "TV", "Mini Fridge"],
  "roomPrice": 150.0,
  "roomRating": 4.7,
  "bookings": [ ]
}'

curl -X POST http://localhost:8080/api/v1/rooms/create \
-H "Content-Type: application/json" \
-d '{
  "roomName": "Room 108",
  "roomType": "SUITE",
  "roomCapacity": 4,
  "roomLocation": "3rd floor",
  "roomImages": ["https://picsum.photos/seed/Room108_1/800/600", "https://picsum.photos/seed/Room108_2/800/600", "https://picsum.photos/seed/Room108_3/800/600"],
  "roomSize": 10,
  "roomFeatures": ["WiFi", "TV", "Mini Fridge", "Jacuzzi"],
  "roomPrice": 300.0,
  "roomRating": 4.9,
  "bookings": [ ]
}'

curl -X POST http://localhost:8080/api/v1/rooms/create \
-H "Content-Type: application/json" \
-d '{
  "roomName": "Room 109",
  "roomType": "STANDARD_ROOM",
  "roomCapacity": 2,
  "roomLocation": "1st floor",
  "roomImages": ["https://picsum.photos/seed/Room109_1/800/600", "https://picsum.photos/seed/Room109_2/800/600", "https://picsum.photos/seed/Room109_3/800/600"],
  "roomSize": 5,
  "roomFeatures": ["WiFi", "TV"],
  "roomPrice": 100.0,
  "roomRating": 4.5,
  "bookings": [ ]
}'

curl -X POST http://localhost:8080/api/v1/rooms/create \
-H "Content-Type: application/json" \
-d '{
  "roomName": "Room 110",
  "roomType": "ECONOMY_ROOM",
  "roomCapacity": 1,
  "roomLocation": "1st floor",
  "roomImages": ["https://picsum.photos/seed/Room110_1/800/600", "https://picsum.photos/seed/Room110_2/800/600", "https://picsum.photos/seed/Room110_3/800/600"],
  "roomSize": 3,
  "roomFeatures": ["WiFi"],
  "roomPrice": 50.0,
  "roomRating": 4.0,
  "bookings": [ ]
}'

curl -X POST http://localhost:8080/api/v1/rooms/create \
-H "Content-Type: application/json" \
-d '{
  "roomName": "Room 111",
  "roomType": "PENTHOUSE",
  "roomCapacity": 6,
  "roomLocation": "5th floor",
  "roomImages": ["https://picsum.photos/seed/Room111_1/800/600", "https://picsum.photos/seed/Room111_2/800/600", "https://picsum.photos/seed/Room111_3/800/600"],
  "roomSize": 15,
  "roomFeatures": ["WiFi", "TV", "Mini Fridge", "Jacuzzi", "Balcony"],
  "roomPrice": 500.0,
  "roomRating": 5.0,
  "bookings": [ ]
}'

curl -X POST http://localhost:8080/api/v1/rooms/create \
-H "Content-Type: application/json" \
-d '{
  "roomName": "Room 112",
  "roomType": "DELUXE_ROOM",
  "roomCapacity": 2,
  "roomLocation": "2nd floor",
  "roomImages": ["https://picsum.photos/seed/Room112_1/800/600", "https://picsum.photos/seed/Room112_2/800/600", "https://picsum.photos/seed/Room112_3/800/600"],
  "roomSize": 6,
  "roomFeatures": ["WiFi", "TV", "Mini Fridge"],
  "roomPrice": 150.0,
  "roomRating": 4.7,
  "bookings": [ ]
}'