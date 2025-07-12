package Config

import spinal.core._
import spinal.core.sim._

object Config {
  def spinal = SpinalConfig(
    targetDirectory = "netlist",
    defaultConfigForClockDomains = ClockDomainConfig(
      resetActiveLevel = LOW
    ),
    onlyStdLogicVectorAtTopLevelIo = false
  )
  def sim = SimConfig.withConfig(spinal).withFstWave.workspacePath("sim")
}
