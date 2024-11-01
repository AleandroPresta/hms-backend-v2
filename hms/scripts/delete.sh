# Read the argument from the command line as the id of the element to delete
ID=$1

# Make the delete request and capture the HTTP status code
HTTP_STATUS=$(curl -s -o /dev/null -w "%{http_code}" -X DELETE http://localhost:8080/api/v1/rooms/$ID/delete)

# Check if the request was successful
if [ "$HTTP_STATUS" -eq 200 ]; then
    echo "Deleted room with id $ID"
else
    echo "Failed to delete room with id $ID. HTTP status code: $HTTP_STATUS"
fi