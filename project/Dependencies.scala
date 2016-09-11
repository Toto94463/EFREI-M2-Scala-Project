import sbt._

object Dependencies {
    val akkaActor = "com.typesafe.akka" %% "akka-actor" % Versions.akka
    val akkaCluster = "com.typesafe.akka" %% "akka-cluster" % Versions.akka
    val akkaHttp = "com.typesafe.akka" %% "akka-http-experimental" % Versions.akka
    val akkaPersistence = "com.typesafe.akka" %% "akka-persistence" % Versions.akka
    val cats = "org.typelevel" %% "cats" % Versions.cats
    val circeCore = "io.circe" %% "circe-core" % Versions.circe
    val circeGeneric = "io.circe" %% "circe-generic" % Versions.circe
    val circeParser = "io.circe" %% "circe-parser" % Versions.circe
    val doobie = "org.tpolecat" %% "doobie-core-cats" % Versions.doobie
    val monix = "io.monix" %% "monix" % Versions.monix
    val monixCats = "io.monix" %% "monix-cats" % Versions.monix
    val mysql = "mysql" % "mysql-connector-java" % Versions.mysql
    val postgres = "org.postgresql" % "postgresql" % Versions.postgres
    val quillCassandra = "io.getquill" %% "quill-cassandra" % Versions.quill
    val quillJdbc = "io.getquill" %% "quill-jdbc" % Versions.quill
    val quillPostgresAsync = "io.getquill" %% "quill-async-postgres" % Versions.quill
    val refined = "eu.timepit" %% "refined" % Versions.refined
    val scalaTest = "org.scalatest" %% "scalatest" % Versions.scalaTest % "test"
    val shapeless = "com.chuusai" %% "shapeless" % Versions.shapeless
}

object Versions {
    val akka = "2.4.10"
    val cats = "0.7.2"
    val circe = "0.5.1"
    val doobie = "0.3.1-SNAPSHOT"
    val monix = "2.0.1"
    val mysql = "5.1.38"
    val postgres = "9.4.1208"
    val quill = "0.10.1-SNAPSHOT"
    val refined = "0.5.0"
    val scala = "2.11.8"
    val scalaTest = "3.0.0"
    val shapeless = "2.3.2"
}

object Repositories {
    val sonatypeSnapshots = Resolver.sonatypeRepo("snapshots")
}
