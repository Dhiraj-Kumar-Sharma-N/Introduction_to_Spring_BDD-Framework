package com.Introduction.to.Selenium.Spring.Framework.Utilities;

import com.Introduction.to.Selenium.Spring.Framework.Configurations.FakerConfig;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@Lazy
@Component
public class ScreenshotUtilwithApplicationContext {

    @Autowired
    private ApplicationContext applicationContext;

    @Value("${ScreenshotSave.Path}")
    private Path path;

    @Lazy
    @Autowired
    private FakerConfig fakerConfig;

    public void GrabScreenshot() throws IOException {
        File sourceFile = this.applicationContext.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(sourceFile,this.path.resolve(fakerConfig.getfaker().name().firstName()+".png").toFile());
    }

    //@PostConstruct
    public void PostConstruct_Sleeping() throws InterruptedException {
        for (int i = 0; i < 9; i++) {
            Thread.sleep(1000);
            System.out.println("Sleeping for "+i+" Second in Post Construct Block");
        }
    }
}
