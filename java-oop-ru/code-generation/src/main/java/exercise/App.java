package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
class App {
    public static void save(Path path, Car car) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String file = objectMapper.writeValueAsString(car);
        Files.write(path, file.getBytes());
    }

    public static Car extract(Path path) throws IOException {
        String readFile = Files.readString(path);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(readFile, Car.class);
    }
}
// END
