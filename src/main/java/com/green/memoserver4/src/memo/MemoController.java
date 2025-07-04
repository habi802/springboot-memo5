package com.green.memoserver4.src.memo;

import com.green.memoserver4.config.model.ResultResponse;
import com.green.memoserver4.src.memo.model.MemoPostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/memo")
public class MemoController {
    private final MemoService memoService;

    @PostMapping
    public ResultResponse<Integer> insertMemo(@RequestBody MemoPostReq req) {
      log.info("insert req={}", req);
      int result = memoService.insertMemo(req);
      return new ResultResponse<>("등록 성공", result);
    }
}
