package ru.yurait6.testcontainerextension.container;

import org.testcontainers.containers.PostgreSQLContainer;

/**
 * @author yurait6 (yurait6@gmail.com) on 01.04.2024
 */
public class IntegrationTestContainer extends PostgreSQLContainer<IntegrationTestContainer> {

  private static final String IMAGE_NAME = "postgres:14.5"; //zalando/spilo-15:3.1-p1
  private static final String DATABASE_NAME = "billing-test";
  private static final String USER_NAME = "billing-test";
  private static final String PASSWORD = "billing-test-Pa$$w0Rd!1";

  private static class IntegrationTestContainerHolder {
    private static final IntegrationTestContainer INSTANCE = new IntegrationTestContainer()
        .withDatabaseName(DATABASE_NAME)
        .withUsername(USER_NAME)
        .withPassword(PASSWORD);

    public static IntegrationTestContainer getInstance() {
      return INSTANCE;
    }
  }

  public static IntegrationTestContainer container() {
    return IntegrationTestContainerHolder.getInstance();
  }

  public IntegrationTestContainer() {
    super(IMAGE_NAME);
  }
}
