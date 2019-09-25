/*  Copyright (c) 2019 AT&T Intellectual Property.                             #
#                                                                              #
#   Licensed under the Apache License, Version 2.0 (the "License");            #
#   you may not use this file except in compliance with the License.           #
#   You may obtain a copy of the License at                                    #
#                                                                              #
#       http://www.apache.org/licenses/LICENSE-2.0                             #
#                                                                              #
#   Unless required by applicable law or agreed to in writing, software        #
#   distributed under the License is distributed on an "AS IS" BASIS,          #
#   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   #
#   See the License for the specific language governing permissions and        #
#   limitations under the License.                                             #
##############################################################################*/


package org.oran.otf.camunda.configuration;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class OTFDataSourceConfiguration {
  @Value("${otf.camunda.mysql.url}")
  private String url;

  @Value("${otf.camunda.mysql.username}")
  private String username;

  @Value("${otf.camunda.mysql.password}")
  private String password;

  @Bean
  @Primary
  public DataSource dataSource() {
    DataSource dataSource = DataSourceBuilder.create()
            .url(url)
            .username(username)
            .password(password)
            .driverClassName("com.mysql.cj.jdbc.Driver")
            .build();
    if (dataSource instanceof HikariDataSource){
//      ((HikariDataSource) dataSource).setLeakDetectionThreshold(10000);

      ((HikariDataSource) dataSource).setMaximumPoolSize(75);
      ((HikariDataSource) dataSource).setMinimumIdle(15);
    }
    return dataSource;
  }

  @Bean
  public PlatformTransactionManager transactionManager() {
    return new DataSourceTransactionManager(dataSource());
  }
}
