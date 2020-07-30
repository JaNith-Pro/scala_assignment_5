
object second{

	     def main(args:Array[String]):Unit={
          var a1 = new Account(" 956678998v ",2500,600) 
		  var a2 = new Account(" 971234567v ",4900,-250) 
		  var a3 = new Account(" 994567899v ",6750,-60) 
  
  
 var bank:List[Account]=List(a1, a2, a3)    

 val overdraft=(b:List[Account])=> b.filter(x=>x.balance<0)  
 
 println("Minus  Balances  : " +overdraft(bank)) 
 
 val intrest=(b:List[Account])=>b.map(x=>x.balance)
 
 val bal=intrest(bank).reduce((x, y)=>x+y)
 println("Sum of all account balances :"+bal)
  
 val interest=(b:List[Account])=>b.map(x=>(x.nic, x.acnumber, if(x.balance<0){x.balance+0.1} else x.balance+0.05))
 println("Balances of Interest :"+interest(bank))
 
     }
 


}

class Account(id:String, n: Int, b: Double) 
{
  val nic:String=id
  val acnumber: Int = n
  var balance: Double = b
  override def toString ="[" +nic+ ":" +acnumber + ":"+ balance+"]"

  def withdraw(a:Double) =this.balance=this.balance-a
  def deposit(a:Double) =this.balance=this.balance+a
  def transfer(a:Account,b:Double)= {                      //Q3
    this.balance=this.balance-b
    a.balance = a.balance+b
  }
  

}
