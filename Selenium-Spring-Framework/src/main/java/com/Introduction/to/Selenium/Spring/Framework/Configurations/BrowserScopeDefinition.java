package com.Introduction.to.Selenium.Spring.Framework.Configurations;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.SimpleThreadScope;
import org.springframework.lang.Nullable;

import java.util.Map;
import java.util.Objects;

public class BrowserScopeDefinition extends SimpleThreadScope {

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Object scopedObject = super.get(name,objectFactory);
        SessionId sid = ((RemoteWebDriver)scopedObject).getSessionId();
        if (Objects.isNull(sid)) {
            scopedObject = objectFactory.getObject();
            super.remove(name);
            super.get(name,objectFactory);
        }
        return scopedObject;
    }
    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }


}
