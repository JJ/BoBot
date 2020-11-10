name := "bobot"

version := "0.0.1"

organization := "info.jjmerelo"

libraryDependencies += "com.bot4s" %% "telegram-core" % "4.4.0-RC2"

val circeVersion = "0.12.3"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
retrieveManaged := true

