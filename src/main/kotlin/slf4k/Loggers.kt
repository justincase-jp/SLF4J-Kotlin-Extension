@file:Suppress("FunctionName")

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
