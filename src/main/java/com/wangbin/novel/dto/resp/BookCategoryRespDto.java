package com.wangbin.novel.dto.resp;

<<<<<<< HEAD
import io.swagger.v3.oas.annotations.media.Schema;
=======
>>>>>>> origin/main
import lombok.Builder;
import lombok.Data;

/**
 * 小说分类 响应DTO
 *
 * @author wangbin
<<<<<<< HEAD
 * @date 2023/5/16
=======
 * @date 2022/5/16
>>>>>>> origin/main
 */
@Data
@Builder
public class BookCategoryRespDto {

    /**
     * 类别ID
     */
<<<<<<< HEAD
    @Schema(description = "类别ID")
=======
>>>>>>> origin/main
    private Long id;

    /**
     * 类别名
     */
<<<<<<< HEAD
    @Schema(description = "类别名")
=======
>>>>>>> origin/main
    private String name;

}
