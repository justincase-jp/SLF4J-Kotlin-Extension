plugins {
  maven
  `java-library`
  kotlin("jvm") version "1.3.60"
}

tasks.named<Wrapper>("wrapper") {
  gradleVersion = "6.0.1"
}

repositories {
  jcenter()
}
dependencies {
  implementation(kotlin("stdlib"))

  implementation("org.slf4j", "slf4j-api", "1.7.29")
}
