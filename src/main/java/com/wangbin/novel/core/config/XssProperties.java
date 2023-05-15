package com.wangbin.novel.core.config;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Xss 过滤配置属性
 *
 * @author wangbin
 * @date 2023/5/17
 */
@ConfigurationProperties(prefix = "novel.xss")
public record XssProperties(Boolean enabled, List<String> excludes) {

}
