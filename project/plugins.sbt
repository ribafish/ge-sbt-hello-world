resolvers += Resolver.mavenLocal
lazy val geVersion = "0.10"
//lazy val geVersion = "0.9"
addSbtPlugin("com.gradle" % "sbt-gradle-enterprise" % geVersion)
