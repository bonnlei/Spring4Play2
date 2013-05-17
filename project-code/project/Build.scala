import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "spring4play21"
  val appVersion      = "1.0-SNAPSHOT"

  val springVersion = "3.1.4.RELEASE"
  val springPackage = "org.springframework"

  val appDependencies = {
    Seq(
      springPackage % "spring-context" % springVersion,
      springPackage % "spring-core" % springVersion,
      springPackage % "spring-beans" % springVersion
    )
  }

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
    scalacOptions ++= Seq("-unchecked", "-deprecation"),
    javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")
  )


}
