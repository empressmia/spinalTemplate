import hardware.Counter._
import Config._

object Main {
  
  def main(args: Array[String]) : Unit = {
     Config.spinal.generateVhdl(Counter(8)) 
  }
}
