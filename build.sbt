import Dependencies._

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "org.yusungsim"
ThisBuild / organizationName := "yusungsim"

lazy val root = (project in file("."))
  .settings(
    name := "wasm-lifter",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      "org.scala-lang.modules" %% "scala-parser-combinators" % "2.0.0",
      "org.gnieh" % "swam-core_2.13" % "0.6.0-RC4",
      "org.gnieh" % "swam-text_2.13" % "0.6.0-RC4",
      "org.gnieh" % "swam-text_2.13" % "0.6.0-RC4",
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
