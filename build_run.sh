#!/usr/bin/env bash

./gradlew build docker
docker run -p 8080:8080 -t springio/gradle-docker