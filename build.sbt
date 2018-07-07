enablePlugins(org.nlogo.build.NetLogoExtension)

netLogoExtName      := "maps"

netLogoClassManager := "MapsExtension"

scalaVersion           := "2.11.7"

scalaSource in Compile := baseDirectory.value / "src"

scalacOptions          ++= Seq("-deprecation", "-unchecked", "-Xfatal-warnings", "-encoding", "us-ascii")

netLogoVersion := "6.0.2"

fork in run := true

