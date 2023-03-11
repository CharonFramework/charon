[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=CharonFramework_charon&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=CharonFramework_charon) [![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=CharonFramework_charon&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=CharonFramework_charon) [![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=CharonFramework_charon&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=CharonFramework_charon) [![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=CharonFramework_charon&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=CharonFramework_charon)

# Charon
This repository contains the main library for the Charon framework. It contains some general utilities that are used throughout the framework.
It also provides basic Dagger 2 bindings for the framework. You most likely don't need to use this library directly, it is pulled in by most other libraries.

## Gradle
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.CharonFramework:charon:master-SNAPSHOT'
}
```

## Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>com.github.CharonFramework</groupId>
        <artifactId>charon</artifactId>
        <version>master-SNAPSHOT</version>
    </dependency>
</dependencies>
```

## License
The Charon Framework is licensed under the GPLv3 license. See [LICENSE](LICENSE) for more information.
The reason for this is that the Charon Framework relies on the Spigot API, which is licensed under the GPLv3 license.
Although I would have liked to use a more permissive license, the GPLv3 license requires me to use the same license for any library that uses the Spigot API.

