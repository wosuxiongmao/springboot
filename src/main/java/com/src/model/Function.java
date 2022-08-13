package com.src.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("function")
public class Function {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String functionName;
}
