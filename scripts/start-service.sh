#!/bin/bash
cd ../sample
../gradlew clean bootRun -PjvmArgs="-Dspring.profiles.active=development"