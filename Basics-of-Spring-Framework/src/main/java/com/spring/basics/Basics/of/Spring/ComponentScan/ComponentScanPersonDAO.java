package com.spring.basics.Basics.of.Spring.ComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ComponentScanPersonDAO {

    @Autowired
    ComponentScanJDBCConnection componentScanJdbcConnection;

    public ComponentScanJDBCConnection getJdbcConnection() {
        return componentScanJdbcConnection;
    }

    public void setJdbcConnection(ComponentScanJDBCConnection componentScanJdbcConnection) {
        this.componentScanJdbcConnection = componentScanJdbcConnection;
    }
}
