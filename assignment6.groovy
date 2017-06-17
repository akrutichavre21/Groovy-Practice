//Break a list of 20 items to a 4 list of 5-5 items.

List a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
//List c = []
//(1..20).each {
//    c.add(it)
//}
//
//println c
//------------------------------------FIRST METHOD-------------------------------------//

List a1 = []
List a2 = []
List a3 = []
List a4 = []

int count = 0

a.each{
    if(count<5)
    {
        a1.add(it)
        count++;
    }
    else if(count<10)
    {
        a2.add(it)
        count++;
    }
    else if(count<15)
    {
        a3.add(it)
        count++;
    }
    else if(count<20)
    {
        a4.add(it)
        count++;
    }

}

println a1
println a2
println a3
println a4

//------------------------------------SECOND METHOD-------------------------------------//

List b = a.collate(5)
println b

//------------------------------------THIRD METHOD-------------------------------------//

List b1 = []
def x = 0, y = 4
(1..4).each{
    b1 << a[x..y]
    x = x + 5
    y = y + 5
}

println b1


//------------------------------------FOURTH METHOD-------------------------------------//

List array = [1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
//List array1 = [1..20] this wont work because 1..20 me iska index nahi aapaata hai..

int size = 5
def partitions = []
int partitionCount = array.size() / size

partitionCount.times{ partitionNumber ->
    def start = partitionNumber * size
    def end = start + size - 1

    partitions << array[start..end]
}

println partitions


List newList = array.collate(4)
println newList
List newList1 = array.collate(2 ,4)
println newList1