package com.green.memoserver4.src.memo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemoService {
    private final MemoMapper memoMapper;
}
