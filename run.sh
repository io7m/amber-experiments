#!/bin/sh

if [ $# -ne 1 ]
then
  echo "usage: class" 1>&2
  exit 1
fi

CLASS="$1"
shift

JDK=/opt/jdk/amber/jvm/openjdk-10-internal
JAVA="${JDK}/bin/java -cp out "

exec ${JAVA} "${CLASS}"
