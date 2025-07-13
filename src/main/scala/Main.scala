import hardware.Counter._
import Config._
import org.rogach.scallop._

class ParserConf(args: Array[String]) extends ScallopConf(args) {
  version("main: 0.1.0")
  banner("""This is the help text""".stripMargin)
  footer("\n This is the footer text")
  
  val vhdl = toggle(name = "vhdl", default = Some(true))
  val verilog = toggle("verilog")
  val width = opt[Int](name = "width", default = Some(8), validate = (_ > 0))
  verify()
}

object Main {
  def main(args: Array[String]) : Unit = {
    val parserConfig = new ParserConf(args)
    if (parserConfig.vhdl.isSupplied) {
      Console.println("Generating VHDL netlist")
      Config.spinal.generateVhdl(Counter(parserConfig.width())) 
    } else if (parserConfig.verilog.isSupplied) {
      Console.println("Generating Verilog netlist")
      Config.spinal.generateVerilog(Counter(parserConfig.width())) 
    } else {
      Console.println("Something went utterly wrong!")
      sys.exit(1)
    }
    sys.exit(0)
  }
}
