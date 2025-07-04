package com.green.memoserver4.src.memo;

import com.green.memoserver4.src.memo.model.MemoPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemoMapper {
    int insertMemo(MemoPostReq req);
}
