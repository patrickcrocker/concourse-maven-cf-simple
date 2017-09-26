#!/bin/sh

set -e -x

cd source-code
  ./mvnw clean package
cd ..

cp source-code/target/concourse-maven-cf-simple-0.0.1-SNAPSHOT.jar  build-output/.
