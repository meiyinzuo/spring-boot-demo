package com.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author meiyinzuo@163.com
 * @version 创建时间：2019年3月26日 下午4:31:42
 * @ClassName 类名称
 * @Description 类描述
 */
@Configuration
@ConfigurationProperties(prefix = "com.demo.opensource")
@PropertySource(value = "classpath:resource.properties")
public class Resource {

    private String name;

    private String website;

    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
