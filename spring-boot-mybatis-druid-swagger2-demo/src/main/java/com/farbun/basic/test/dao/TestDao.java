package com.farbun.basic.test.dao;

import com.farbun.basic.test.entity.Test;
import com.farbun.basic.test.model.TestModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by democh on 2017/7/20.
 */
@Repository
public interface TestDao {
  List<Test> query();
  Test queryById(Long id);
  Integer add(TestModel model);
}
