name := """scalacheck-scalapb"""

version := "1.0.0"

scalaVersion := "2.11.8"

libraryDependencies += "com.github.alexarchambault" %% "scalacheck-shapeless_1.13" % "1.1.1"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.3"

resolvers += Resolver.sonatypeRepo("releases")

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)
