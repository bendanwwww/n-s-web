package com.novel.mapper;

import com.novel.vo.BookSettingVO;

import java.util.List;

/**
 * @author Administrator
 */
public interface FrontBookSettingMapper extends BookSettingMapper {

    List<BookSettingVO> listVO();
}
