#!/bin/sh
mvn package -Pnative && ./target/jacksonrecords-*-runner
