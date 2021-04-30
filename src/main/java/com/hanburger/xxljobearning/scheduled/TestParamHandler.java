package com.hanburger.xxljobearning.scheduled;

import com.hanburger.xxljobearning.service.TestParamService;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import static com.xxl.job.core.context.XxlJobHelper.getJobParam;

/**
 * 测试xxljob传参<br>
 *
 * @author BaoHan
 * @date 2021-4-29 18:19
 */

@Component
public class TestParamHandler{

    @Resource
    private TestParamService testParamService;

    @XxlJob("lineToCrmMappedHandler")
    public ReturnT<String> execute(String param) throws Exception{
        String parseInParameter = XxlJobHelper.getJobParam();
        System.out.println("执行成功啦！ 参数：" + parseInParameter);
        return ReturnT.SUCCESS;
    }

}
