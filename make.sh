#!/bin/sh -ex

JDK=/opt/jdk/amber/jvm/openjdk-10-internal
JAVAC="${JDK}/bin/javac -d out -Xlint:unchecked "

mkdir -p out

${JAVAC} Option.java
${JAVAC} OptionExample.java
${JAVAC} OptionOverlap.java || true
${JAVAC} OptionWrongType.java || true

