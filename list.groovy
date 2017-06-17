List names
println names

List users = []
println users

List ratings = [1, 2, 3, 4, 5]
println ratings

ratings.each {
    println it
}

//access index based value
int top = ratings[4]
println "Top rating = ${top}"