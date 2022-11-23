package com.yll.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName books
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books implements Serializable {
    /**
     * 书ID
     */
    private Integer bookId;

    /**
     * 书名
     */
    private String bookName;

    /**
     * 数量
     */
    private Integer bookCounts;

    /**
     * 描述
     */
    private String detail;

    private static final long serialVersionUID = 1L;

}