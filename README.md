# gateway-bff

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

![Arquitetura-projeto-Microsserviços](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjp0kc7mCs6pgnh4hPUSd4MHyCzJYBUTYLDw1Mz3oN2ENdWMc6a_RcSlRK94ar_r9jigsJ7jN2IcvKFT8oeEF7ngf-Atauz_tok_5ogwSjt4wTVLUlQbUmyxOStpnH0NZ6VPkw0BFmx5CQS_IzIi4Z6nxf7R5uvfGehN6qVrqFLLjbjGA/s1600/ArquiteturaCurso.jpg)

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/gateway-bff-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Related Guides

- RESTEasy Classic's REST Client Jackson ([guide](https://quarkus.io/guides/resteasy-client)): Jackson serialization support for the REST Client
