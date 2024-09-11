package com.novel.service.impl;

import com.novel.entities.BookContent;
import com.novel.mapper.BookContentMapper;
import com.novel.service.BookContentService;
import lombok.RequiredArgsConstructor;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static com.novel.mapper.BookContentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.select.SelectDSL.select;


@Service(value = "db")
@RequiredArgsConstructor
public class DbBookContentServiceImpl implements BookContentService {

    private final BookContentMapper bookContentMapper;

    @Override
    public BookContent queryBookContent(Long bookId, Long bookIndexId) {
        SelectStatementProvider selectStatement = select(id, content)
                .from(bookContent)
                .where(indexId, isEqualTo(bookIndexId))
                .limit(1)
                .build()
                .render(RenderingStrategies.MYBATIS3);
        return bookContentMapper.selectMany(selectStatement).get(0);
    }
}
