#!/bin/bash

set -e -x

source-code/mvnw clean package

cp source-code/target/concourse-example-maven-simple-0.0.1-SNAPSHOT.jar  output-dir/.
