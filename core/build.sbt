name := "snmp4s-core"

version := "0.1.0"

libraryDependencies ++= Seq(
  "org.snmp4j" % "snmp4j" % "2.2.1",
  "org.snmp4j" % "snmp4j-agent" % "2.0.7" % "test",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)

osgiSettings

OsgiKeys.exportPackage := Seq(
  "org.snmp4s"
)

OsgiKeys.privatePackage := Seq()
