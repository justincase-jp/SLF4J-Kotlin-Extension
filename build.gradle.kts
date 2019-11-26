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
}
