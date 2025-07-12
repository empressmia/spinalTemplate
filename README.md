# spinalTemplate
(custom/personalised) Spinal HDL Project Template, *sbt* only.
Counter implementation, simulation and formal is taken (copied) from original repository. 

## Compile
<pre><code>sbt compile</code></pre>

## Netlist
For now only a VHDL netlist will be created.
<pre><code>sbt run</code></pre>

## Simulation
<pre><code>sbt testOnly *.CounterSim</code></pre>

## Formal
This is experimental.
<pre><code>sbt testOnly *.CounterFormal</code></pre>

