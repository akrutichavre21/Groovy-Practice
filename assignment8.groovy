List a = [1, 2, 3, 4, 5, 6]

List b = a.collate(2)

println b

b.each{ number ->
    number.each{
        println it
    }
}