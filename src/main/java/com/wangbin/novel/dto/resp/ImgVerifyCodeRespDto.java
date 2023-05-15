package com.wangbin.novel.dto.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

/**
 * 图像验证码 响应DTO
 * @author wangbin
 * @date 2023/5/18
 */
@Data
@Builder
public class ImgVerifyCodeRespDto {

    /**
     * 当前会话ID，用于标识改图形验证码属于哪个会话
     * */
    @Schema(description = "sessionId")
    private String sessionId;

    /**
     * Base64 编码的验证码图片
     * */
    @Schema(description = "Base64 编码的验证码图片")
    private String img;

}
