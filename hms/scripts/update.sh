curl -X PUT http://localhost:8080/api/v1/rooms/20/update \
-H "Content-Type: application/json" \
-d '{
  "roomName": "Room 2",
  "roomType": "SUITE",
  "roomCapacity": 5,
  "roomLocation": "2rd floor",
  "roomImages": ["https://picsum.photos/seed/Room1_1/800/600", "https://picsum.photos/seed/Room1_2/800/600", "https://picsum.photos/seed/Room1_3/800/600"],
  "roomSize": 10,
  "roomFeatures": ["WiFi", "TV", "Mini Fridge", "Jacuzzi"],
  "roomPrice": 300.0,
  "roomRating": 4.9,
  "bookings": [ ]
}'