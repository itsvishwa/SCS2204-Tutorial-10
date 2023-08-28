object Question01 extends App{
    val tempList: List[Int] = List(0, 10, 20, 30)

    val calculateAverage = (list: List[Int]) => list.map((temp)=>{((temp*(9.0/5))+32)}).reduce((a, b) => a+b) / list.size
    
    println(s"Average tempeature in Fahrenheit: ${calculateAverage(tempList)}");
}


