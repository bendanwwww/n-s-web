package com.novel.service;


import com.novel.entities.BookContent;

public interface BookContentService {

    BookContent queryBookContent(Long bookId, Long bookIndexId);

}
