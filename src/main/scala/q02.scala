object q02 extends App{
  def myFunction(x:Int): Unit = {
    x match{
      case x if x<=0 => print("Negative/Zero")
      case x if x%2==0 => print("Even Number")
      case _ => print("Odd Number")
    }
  }
  print("Enter a number: ")
  var in=scala.io.StdIn.readInt()
  print("Your number is ")
  myFunction(in)
}