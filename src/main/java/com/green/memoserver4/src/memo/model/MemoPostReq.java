package com.green.memoserver4.src.memo.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MemoPostReq {
    private String title;
    private String content;
}
