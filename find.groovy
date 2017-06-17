def items = [null, [], 0, 0.0, false, 2]
println items.find()

List myitem = [1, 2, 3]
def a= myitem.find{
    it>1
}

println a

def items1 = [null,2, 0, 0.0, false, 21, 55, 78]

println items1.findAll()

def items2 = [2, 0, 21, 55, 78]

println items2.findAll{
    it>50
}

def list = [1, 2, 3]
println list.findResult{ it > 1 ? "Found ${it}" : null }
println list.findResult{ it > 3 ? "Found ${it}" : null }


println list.findResult("Sorry nothing is found"){ it > 1 ? "Found ${it}" : null }
println list.findResult("Sorry nothing is found"){ it > 3 ? "Found ${it}" : null }
