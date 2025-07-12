ThisBuild / version := "0.1.0"
ThisBuild / scalaVersion := "2.13.16"
//ThisBuild / organization := "org.empressmia"

val spinalVersion = "1.12.2"
val spinalCore = "com.github.spinalhdl" %% "spinalhdl-core" % spinalVersion
val spinalLib = "com.github.spinalhdl" %% "spinalhdl-lib" % spinalVersion
val spinalTest = "com.github.spinalhdl" %% "spinalhdl-tester" % spinalVersion
val spinalIdslPlugin = compilerPlugin("com.github.spinalhdl" %% "spinalhdl-idsl-plugin" % spinalVersion)

lazy val projectname = (project in file("."))
  .settings(
    name := "spinalTemplate", 
    Test / scalaSource := baseDirectory.value / "src" / "test" / "spinal",
    libraryDependencies ++= Seq(spinalCore, spinalLib, spinalTest, spinalIdslPlugin)
  )

fork := true
