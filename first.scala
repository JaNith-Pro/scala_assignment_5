

object first{
     def main(args:Array[String]):Unit={
         val x = new Rational(1,3)
         val y = new Rational(5,7)
         val z = new Rational(3,2) 
         
        println(x.sub(y).sub(z))
     }
}

class Rational (x:Int,y:Int){
      def numer = x
      def demom = y
    
    
     def add(r:Rational) = new Rational(this.numer*r.demom + r.numer*this.demom,r.demom*this.demom)

     def neg:Rational = new Rational(-numer,demom)        //Q1

     def sub(r:Rational) = add(r.neg)

     override def toString = numer + "/" + demom
    

}
