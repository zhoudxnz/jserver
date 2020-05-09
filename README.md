
# Get started

1. Download and install gradle 6.4
2. Install the latest jdk, e.g, on Fedora Linux, run:

    ```bash
    sudo dnf install java-latest-openjdk-devel
    sudo alternatives --config java
    ```

3. Create the directory structure and install gradle wrapper

    ```bash
    mkdir -p src/main/java/com/jserver/api
    mkdir -p src/main/webapp/WEB-INF
    mkdir -p src/main/resources
    mkdir -p src/test/java/
    gradle wrapper
    ```

4. Start the server under `http://localhost:8080/jserver` (TBD)

    ```bash
    ./gradlew appRunWar
    ```
