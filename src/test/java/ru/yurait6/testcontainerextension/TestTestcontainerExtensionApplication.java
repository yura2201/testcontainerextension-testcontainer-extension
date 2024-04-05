package ru.yurait6.testcontainerextension;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTestcontainerExtensionApplication {

  public static void main(String[] args) {
    SpringApplication.from(TestcontainerExtensionApplication::main).with(TestTestcontainerExtensionApplication.class)
        .run(args);
  }

}
