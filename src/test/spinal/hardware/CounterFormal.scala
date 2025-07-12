package hardware.Counter
import Config._

import org.scalatest.funsuite.AnyFunSuite
import spinal.core._
import spinal.core.formal._

// You need SymbiYosys to be installed.
// See https://spinalhdl.github.io/SpinalDoc-RTD/master/SpinalHDL/Formal%20verification/index.html#installing-requirements
class CounterFormal extends AnyFunSuite {

  test("formal") {
    FormalConfig
      .workspacePath("formal")
      .withBMC(10)
      .doVerify(new Component {
        val dut = FormalDut(Counter(8))

        // Ensure the formal test start with a reset
        assumeInitial(clockDomain.isResetActive)

        // Provide some stimulus
        anyseq(dut.io.cond0)
        anyseq(dut.io.cond1)

        // Check the state initial value and increment
        spinal.core.assert(dut.io.state === past(dut.io.state + U(dut.io.cond0)).init(0))
      })
    }
}
