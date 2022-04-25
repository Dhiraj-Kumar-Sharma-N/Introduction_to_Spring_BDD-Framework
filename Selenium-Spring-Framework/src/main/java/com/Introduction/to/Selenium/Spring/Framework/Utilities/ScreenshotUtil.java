package com.Introduction.to.Selenium.Spring.Framework.Utilities;

import com.Introduction.to.Selenium.Spring.Framework.Configurations.FakerConfig;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@Lazy
@Component
public class ScreenshotUtil {

    @Autowired
    private TakesScreenshot driver;

    @Value("${ScreenshotSave.Path}")
    private Path path;

    @Lazy
    @Autowired
    private FakerConfig fakerConfig;

    public void GrabScreenshot() throws IOException {
        File sourceFile = this.driver.getScreenshotAs(OutputType.FILE);
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
