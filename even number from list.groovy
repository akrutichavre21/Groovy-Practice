List ratings = [1, 2, 3, 4, 5]

ratings.each {
    if(it % 2 == 0)
    {
        println it
    }
}

List evenNumbers = ratings.findAll {
    return !(it%2)
}

println evenNumbers

println ratings.contains(5)