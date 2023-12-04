package coyote.setting;

import java.io.File;
import java.nio.file.Paths;
import java.util.Map;

public class CoyoteSetting {

    private String report;
    private String projectSetting;

    public CoyoteSetting(Map<String, String> coyoteSetting) {
        this.report = coyoteSetting.getOrDefault("report","");
        this.projectSetting = coyoteSetting.getOrDefault("projectSetting","");
    }

    public String getReport() {
        return Paths.get(System.getProperty("user.home"),"coyoteCli","report",report).toFile().getAbsolutePath();
    }

    public String getProjectSetting() {
        return Paths.get(System.getProperty("user.home"),".crichton","plugins","coyote","setting",projectSetting).toFile().getAbsolutePath();
    }
}