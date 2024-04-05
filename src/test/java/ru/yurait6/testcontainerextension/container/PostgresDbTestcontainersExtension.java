package ru.yurait6.testcontainerextension.container;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * @author yurait6 (yurait6@gmail.com) on 01.04.2024
 */
public class PostgresDbTestcontainersExtension implements BeforeAllCallback {

  @Override
  public void beforeAll(ExtensionContext context) throws Exception {
    IntegrationTestContainer.container().start();
    updateDataSourceProps(IntegrationTestContainer.container());
    //migration logic here (if needed)
  }

  private void updateDataSourceProps(IntegrationTestContainer container) {
    System.setProperty("spring.datasource.url", container.getJdbcUrl());
    System.setProperty("spring.datasource.username", container.getUsername());
    System.setProperty("spring.datasource.password", container.getPassword());
  }

}
