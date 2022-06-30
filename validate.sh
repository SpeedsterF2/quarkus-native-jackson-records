#!/bin/sh
mvn clean package -Pnative && ./target/jacksonrecords-*-runner
