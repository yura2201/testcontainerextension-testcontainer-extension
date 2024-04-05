package ru.yurait6.testcontainerextension;

import ru.yurait6.testcontainerextension.container.PostgresDbTestcontainersExtension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(PostgresDbTestcontainersExtension.class)
class TestcontainerExtensionApplicationTests {

  @Test
  void contextLoads() {
  }

}
