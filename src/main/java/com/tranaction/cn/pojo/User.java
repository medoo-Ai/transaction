package com.tranaction.cn.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @auther SyntacticSugar
 * @data 2019/3/31 0031下午 10:34
 */

@Data
@Alias("user")
public class User {
    private String userName;
    private Long id;
    private String note;
}
