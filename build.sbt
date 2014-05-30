import sbtunidoc.Plugin.unidocSettings

version in ThisBuild := "0.0.1"

scalaVersion in ThisBuild := "2.11.0"

testOptions in ThisBuild += Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports")

unidocSettings

libraryDependencies in ThisBuild ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.7" % "test",
  "org.pegdown" % "pegdown" % "1.4.2" % "test"      // (For Html Scalatest reports)
)

lazy val subproject_a = Project(
  "subproject_a",
  file("subproject_a"),
  settings = Project.defaultSettings
)

lazy val subproject_b = Project(
  "subproject_b",
  file("subproject_b"),
  settings = Project.defaultSettings
)
