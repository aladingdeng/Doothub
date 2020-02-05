package com.pinyougou.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 品牌实体类
 *
 * @author lee.siu.wah
 * @version 1.0
 * <p>File Created at 2019-09-29<p>
 */
@Data
public class Brand implements Serializable {
    // 品牌id
    private long id;
    // 品牌名称
    private String name;
    // 品牌首字母
    private String firstChar;

}
