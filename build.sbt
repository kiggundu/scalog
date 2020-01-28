name := "scalog"

lazy val scalacticVersion = "3.0.5"
lazy val scalatestVersion = "3.0.5"
lazy val logbackVersion = "1.2.3"

lazy val commonSettings = Seq(
  version := "0.0.1",
  organization := "com.thekiggys",
  scalaVersion := "2.12.6",
  test in assembly := {}
)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .settings(
    mainClass in assembly := Some("thekiggys.Application"),
    // more settings here ...
  )

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % scalacticVersion % "test",
  "org.scalatest" %% "scalatest" % scalatestVersion % "test",
  "ch.qos.logback" % "logback-classic" % logbackVersion //,
  //"com.typesafe.scala-logging" %% "scala-logging" % "3.7.2"
)
