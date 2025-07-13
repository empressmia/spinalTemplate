# spinalTemplate
(custom/personalised) Spinal HDL Project Template, *sbt* only.
Counter implementation, simulation and formal is taken (copied) from original repository. 

## Compile
<pre><code>sbt compile</code></pre>

## Netlist(s)
Using the following will create a VHDL netlist.
<pre><code>sbt run</code></pre> or <pre><code>sbt "run --vhdl"</code></pre>
<pre><code>sbt "run --verilog"</code></pre> will create a Verilog netlist.

## Simulation
<pre><code>sbt testOnly *.CounterSim</code></pre>

## Formal
This is experimental.
<pre><code>sbt testOnly *.CounterFormal</code></pre>

