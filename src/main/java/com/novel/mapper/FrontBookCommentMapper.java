package com.novel.mapper;

import com.novel.vo.BookCommentVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface FrontBookCommentMapper extends BookCommentMapper {

    List<BookCommentVO> listCommentByPage(@Param("userId") Long userId, @Param("bookId") Long bookId);

}
