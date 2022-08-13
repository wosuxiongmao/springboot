package com.src.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("plan")
public class Plan {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String planName;
    private int price;
    private String functionIds;

}
