name := "bobot"

resolvers += "jitpack" at "https://jitpack.io"

version := "0.0.1"

scalaVersion := "2.11.7"

organization := "info.jjmerelo"

libraryDependencies += "com.github.mukel" %% "telegrambot4s" % "v1.2.1"

val circeVersion = "0.5.1"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

addCompilerPlugin(
  "org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full
)

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"
retrieveManaged := true

