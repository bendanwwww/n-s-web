package com.novel.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novel.entities.Book;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 */
@Data
public class BookVO extends Book implements Serializable {

    @JsonFormat(timezone = "GMT+8", pattern = "MM/dd HH:mm")
    private Date lastIndexUpdateTime;


}
