package com.rainbow.app1.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.rainbow.microservice.service1.api.ConsumerService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Autowired
    private static Logger log = LoggerFactory.getLogger(AppController.class);
    @Reference
    ConsumerService consumerService;

    @GetMapping("/service")
    @SentinelResource(
            value = "app-ser"
            ,blockHandler = "blockHandler"
            ,fallback = "fallback")
    public String service(String name){
        return "app1 invoke : " +consumerService.service();
    }
    //////////////////////////////////////////////////////
    // 参数和返回值需和上面的一样 , 参数可加最后BlockException
    /**
     * 资源内部发生了BlockException (Sentinel 定义的异常)
     * @param name
     * @param e
     * @return
     */
    public String blockHandler(String name, BlockException e){
        log.error("触发了BlockException,",e);
        return "BlockException";
    }

    /**
     * 资源其他Exception
     * @param name
     * @param e
     * @return
     */
    public String fallback(String name, BlockException e){
        log.error("触发了Throwable,",e);
        return "Throwable";
    }

}
