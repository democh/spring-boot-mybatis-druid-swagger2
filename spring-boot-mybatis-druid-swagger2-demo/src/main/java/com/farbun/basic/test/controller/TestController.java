package com.farbun.basic.test.controller;
import com.farbun.basic.test.dao.TestDao;
import com.farbun.basic.test.entity.Test;
import com.farbun.basic.test.model.TestModel;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 测试controller
 */
@Api(value = "测试", description = "测试API")
@RestController
@RequestMapping("/user")
public class TestController {

  /**
   * 声明日志
   */
  private final Logger log = LoggerFactory.getLogger(this.getClass());

  @Autowired
  TestDao testDao;

  /**
   * 查询用户列表
   * @return
   */
  @ApiOperation(value="查询用户列表")
  @GetMapping("/list")
  public List<Test> list(){
    log.debug("test");
    return testDao.query();
  }

  /**
   * 根据ID查询
   * @param id
   * @return
   */
  @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
  @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long",paramType = "path")
  @GetMapping("/{id}")
  public Test queryById(@PathVariable Long id){
    return testDao.queryById(id);
  }

  /**
   * 添加
   * @param model
   * @return
   */
  @ApiOperation(value="添加用户")
  @PostMapping("/add")
  public Integer add(@ModelAttribute TestModel model){
    return testDao.add(model);
  }

  /**
   * json格式传递对象使用RequestBody注解
   * @param model
   * @return
   */
  @ApiOperation(value="传递复杂对象", notes="传递复杂对象DTO，json格式传递数据",produces = "application/json")
  @PostMapping(value="/add2")
  public TestModel add2(@RequestBody TestModel model) {
    return model;
  }

  /**
   * 传递数组
   * @param ids
   * @return
   */
  @ApiOperation(value="传递数组")
  @PostMapping("/arr")
  public Integer[] arr(@ApiParam("用户ID数组") @RequestParam Integer[] ids) {
    return ids;
  }

  /**
   * 传递数组对象
   * @param models
   * @return
   */
  @ApiOperation(value="传递数组对象")
  @PostMapping("/arrDto")
  public TestModel[] arrDto(@ApiParam("数组对象") @RequestBody TestModel[] models) {
    return models;
  }
}
