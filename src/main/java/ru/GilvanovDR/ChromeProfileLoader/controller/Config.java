/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.ChromeProfileLoader.controller;

 class Config {
    private static Config ourInstance = new Config();
    private String profileFolder = "";
    private String chromeFilePath = "";
    private String defaultProfileZip = "";

     static Config getInstance() {
        return ourInstance;
    }

     String getProfileFolder() {
        return profileFolder;
    }

     void setProfileFolder(String profileFolder) {
        this.profileFolder = profileFolder;
    }

     String getChromeFilePath() {
        return chromeFilePath;
    }

     void setChromeFilePath(String chromeFilePath) {
        this.chromeFilePath = chromeFilePath;
    }

     String getDefaultProfileZip() {
        return defaultProfileZip;
    }

     void setDefaultProfileZip(String defaultProfileZip) {
        this.defaultProfileZip = defaultProfileZip;
    }
}
