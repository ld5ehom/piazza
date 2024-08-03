package com.piazza.board.service;

import com.piazza.board.dto.PostDTO;
import com.piazza.board.dto.request.PostSearchRequest;

import java.util.List;

public interface PostSearchService {
    List<PostDTO> getProducts(PostSearchRequest postSearchRequest);
}