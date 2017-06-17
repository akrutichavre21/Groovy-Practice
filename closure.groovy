Closure helloWorld = {
    //return "this is optional"
println"Hello"
}

println helloWorld.call()
// helloWorld.call()

Closure greeting = {
    String msg = "Hello" + it               //it is a predefined variable for argument
    return msg
}

println greeting.call("World")

greeting = { name, time ->                  // name -> is a variable declaration
    String msg = "hello" + name + " , ${time} "            // {$time} is a String interpolation
    return msg
}

println greeting.call("world", "goodmorning")