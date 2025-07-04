package com.green.memoserver4.src.memo;

import com.green.memoserver4.src.memo.model.MemoPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemoService {
    private final MemoMapper memoMapper;

    public int insertMemo(MemoPostReq req) {
        return memoMapper.insertMemo(req);
    }
}
