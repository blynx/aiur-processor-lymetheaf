#!/bin/bash

mkdir bundle;
echo "build: ";
./gradlew shadowJar \
  && echo "copy: " \
  && cp -vf ./build/libs/aiur-processor-lymetheaf-all.jar ./bundle/aiur-processor-lymetheaf-all.jar \
  ;
