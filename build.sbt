import Dependencies._

ThisBuild / scalaVersion := "2.12.15"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

/*
Global / gradleEnterpriseConfiguration :=
    GradleEnterpriseConfiguration(
        server = Server(
            url = Some(url("https://e.grdev.net"))
        ),
        buildScan = BuildScan(
//            obfuscation = Obfuscation(
//                username = _.reverse,
//                hostname = _.toCharArray.map(_.getNumericValue).mkString("-"),
//                ipAddresses = _.map(_ => "0.0.0.0")
//            ),
            tags = Set(
//                "buildSbtTag"
//                if (sys.env.contains("CI")) "CI" else "Local",
//                sys.props("os.name")
            ),
//            links = Map(
//                "VCS" -> url(s"https://github.com/myorg/sample/tree/${sys.props("vcs.branch")}")
//            ),
//            values = Map(
//                "Scala version" -> scalaVersion.value
//            )
        )
    )

 */

lazy val helloWorldProj = (project in file("."))
    .aggregate(lib1, lib2)
    .dependsOn(lib1)
    .settings(
        name := "hello-world-test",
        libraryDependencies += scalaTest % Test,
        helloTask := {
            println("Hello from task!")
        }
    )

lazy val lib1 = (project in file("lib1"))
    .dependsOn(lib2)
    .settings(
        name := "lib1",
        libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
    )

lazy val lib2 = (project in file("lib2"))
    .settings(
        name := "lib2",
    )

lazy val helloTask = taskKey[Unit]("A hello task =)")


