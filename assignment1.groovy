

//create a list ratings. create a new list and add all those elements which are greater than average

List ratings = [12, 14, 4, 10, 1, 85, 38]
def sum = 0

//ratings.each {
//    sum += it
//}


def average = ratings.sum() / ratings.size()

List newList = ratings.findAll {

    return it > average
}

println newList