import com.thoughtworks.xstream.core.MapBackedDataHolder

/**
 * Created by akruti on 12/6/17.
 */
Map userData = [firstName: "john", lastName: "linen", age: 35]

println userData.get("firstName")


//To read from Map
//1. Direct key
//2. subscript operator

println userData.firstName      //direct key
println userData["firstName"]   //subscript operator

String keyValue = "firstName"
println userData[keyValue]      // userData.keyValue outputs null


//Insert key: value pair in the map
// example: email: abc@gmail.com

userData.put("email", "abc@gmail.com")
userData.address = "raipur"
userData["phoneNo"] = 123

String unKnownKey = "rating"
userData[unKnownKey] = 20
println userData


// Remove from a Map

userData.remove("rating")           //removes key: value pair from map
println userData.containsKey("rating")
println userData

userData.address = null             //keeps the key and make the value null
println userData.containsKey("address")
println userData



