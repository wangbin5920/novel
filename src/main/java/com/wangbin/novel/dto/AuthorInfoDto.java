package com.wangbin.novel.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 作家信息 DTO
 *
 * @author wangbin
 * @date 2023/5/18
 */
@Data
@Builder
public class AuthorInfoDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private String penName;

    private Integer status;

}
