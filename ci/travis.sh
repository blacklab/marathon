#!/bin/bash

set -e -o pipefail
sbt "set parallelExecution in Test := false" test
