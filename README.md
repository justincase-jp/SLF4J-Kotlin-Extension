SLF4J Kotlin Extension
====
[![](https://jitpack.io/v/justincase-jp/SLF4J-Kotlin-Extension.svg)](https://jitpack.io/#justincase-jp/SLF4J-Kotlin-Extension)

Simplest Kotlin logging

```kt
package slf4k

import org.slf4j.LoggerFactory

@PublishedApi
internal inline val logger
  get() = LoggerFactory.getLogger(Thread.currentThread().stackTrace[1].className.substringBefore('$'))


inline fun TRACE(throwable: Throwable? = null, message: () -> Any?) = logger.run {
  if (isTraceEnabled) {
    trace(message().toString(), throwable)
  }
}

inline fun DEBUG(throwable: Throwable? = null, message: () -> Any?) = logger.run {
  if (isDebugEnabled) {
    debug(message().toString(), throwable)
  }
}

inline fun INFO(throwable: Throwable? = null, message: () -> Any?) = logger.run {
  if (isInfoEnabled) {
    info(message().toString(), throwable)
  }
}

inline fun WARN(throwable: Throwable? = null, message: () -> Any?) = logger.run {
  if (isWarnEnabled) {
    warn(message().toString(), throwable)
  }
}

inline fun ERROR(throwable: Throwable? = null, message: () -> Any?) = logger.run {
  if (isErrorEnabled) {
    error(message().toString(), throwable)
  }
}
```

# Installation 

Gradle Kotlin DSL

```gradle
repositories {
  mavenCentral()
  maven("https://jitpack.io")
}
dependencies {
  implementation("io.github.justincase-jp", "slf4j-kotlin-extension", "1.4.0")
  runtimeOnly("org.slf4j", "slf4j-simple", "1.7.30")
}
```
