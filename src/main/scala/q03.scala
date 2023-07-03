object q03 extends App{
  def toUpper(str:String):String={
    str.toUpperCase()
  }

  def toLower(str:String):String={
    str.toLowerCase()
  }

  def formatNames(name:String)(index:Int)(Func: String=>String):String={

    if(index>0 && index<name.length()){
      var res=""
      res=name.substring(0,index)
      res=res+Func(name.charAt(index).toString())
      res=res+name.substring(index+1,name.length())
      return res
    }else{
      return Func(name)
    }

  }
  println(formatNames("BENNY")(-1)(toUpper))
  println(formatNames("Niroshan")(1)(toUpper))
  println(formatNames("Saman")(-1)(toLower))
  println(formatNames("Kumara")(5)(toUpper))

}