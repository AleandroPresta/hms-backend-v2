curl -X POST http://localhost:8080/api/v1/rooms/create \
-H "Content-Type: application/json" \
-d '{
  "roomName": "Room 102",
  "roomType": "DELUXE_ROOM",
  "roomCapacity": 2,
  "roomLocation": "2nd floor",
  "roomImages": ["image3.jpg", "image4.jpg"],
  "roomSize": 6,
  "roomFeatures": ["WiFi", "TV", "Mini Fridge"],
  "roomPrice": 150.0,
  "roomRating": 4.7,
  "bookings": [ ]
}'