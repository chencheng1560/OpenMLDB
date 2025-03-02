/*
 * Copyright 2021 4Paradigm
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com._4paradigm.openmldb.java_sdk_test.checker;
import com._4paradigm.openmldb.test_common.bean.OpenMLDBResult;
import com._4paradigm.openmldb.test_common.model.ExpectDesc;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;

/**
 * @author zhaowei
 * @date 2020/6/16 3:14 PM
 */
@Slf4j
public class MessageChecker extends BaseChecker {

    public MessageChecker(ExpectDesc expect, OpenMLDBResult fesqlResult){
        super(expect,fesqlResult);
    }

    @Override
    public void check() throws Exception {
        log.info("message check");
        String expectMsg = expect.getMsg();
        String actualMsg = fesqlResult.getMsg();
        Assert.assertTrue(actualMsg.contains(expectMsg),"msg验证失败,actualMsg="+actualMsg+",expectMsg="+expectMsg);
    }
}
