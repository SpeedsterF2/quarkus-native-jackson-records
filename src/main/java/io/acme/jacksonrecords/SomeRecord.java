package io.acme.jacksonrecords;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
record SomeRecord(String name, String surname) {
}
