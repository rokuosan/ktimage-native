# ktimage-native

This repository is a sample for using GraalVM Native Image with Kotlin.

CI/CD is configured with GitHub Actions. Therefore, you can retrieve artifacts from the Actions tab.

## Getting Started

### Prerequisites

- GraalVM 21

### Build .jar file

Make a fatJar with shadowJar.

```shell
$ ./gradlew shadowJar
```

### Build native image

Run the command below to create a native image on GraalVM.

```shell
$ native-image -jar build/libs/jar/*-all.jar build/libs/out/ktimage -H:+UnlockExperimentalVMOptions -H:EnableURLProtocols=http,https --no-fallback
```
