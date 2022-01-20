package com.xiaodi.qa.jmeter;

import com.alibaba.fastjson.JSONObject;
import org.apache.jmeter.JMeter;
import org.apache.jmeter.control.LoopController;
import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.protocol.http.control.HeaderManager;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;
import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.reporters.Summariser;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.TestPlan;
import org.apache.jmeter.threads.ThreadGroup;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;

import java.io.File;

/**
 * @Author xiaodi.gou
 * @create 2021/12/26 9:22 下午
 */
public class JmeterTest {

    public static void main(String[] args) {

        StandardJMeterEngine standardJMeterEngine = new StandardJMeterEngine();
        System.setProperty(JMeter.JMETER_NON_GUI, "true");
        String path = JmeterTest.class.getClassLoader().getResource("jmeter.properties").getPath();
        File file = new File(path);
        if (file.exists()) {
            JMeterUtils.loadJMeterProperties(file.getPath());
        }

        TestPlan testPlan = new TestPlan("我的测试计划");
        HashTree testPlanHashTree = new HashTree();
        ThreadGroup threadGroup = createThreadGroup();
        LoopController loopController = createLoopController();
        threadGroup.setSamplerController(loopController);
        HashTree threadGroupHashTree = testPlanHashTree.add(testPlan, threadGroup);
        HTTPSamplerProxy httpSamplerProxy = createHttpSampleProxy();
        threadGroupHashTree.add(httpSamplerProxy);

        //添加结果树
        Summariser summer = null;
        String summariserName = JMeterUtils.getPropDefault("summariser.name", "summray");
        if (summariserName.length() > 0) {
            summer = new Summariser(summariserName);
        }
        ResultCollector logger = new ResultCollector(summer);
//        String logFile = "/Users/xiaodi.gou/Downloads/test/gouxiaodi/jmeter-log";
//        logger.setFilename(logFile);
        testPlanHashTree.add(testPlanHashTree.getArray(), logger);

        standardJMeterEngine.configure(testPlanHashTree);
        standardJMeterEngine.run();

    }

    public static ThreadGroup createThreadGroup() {
        ThreadGroup threadGroup = new ThreadGroup();
        threadGroup.setName("Example Thread Group");
        threadGroup.setNumThreads(1);
        threadGroup.setRampUp(0);
        threadGroup.setProperty(TestElement.TEST_CLASS, ThreadGroup.class.getName());
        threadGroup.setScheduler(true);
        threadGroup.setDuration(60);
        threadGroup.setDelay(0);

        return threadGroup;
    }

    public static HTTPSamplerProxy createHttpSampleProxy() {
        HTTPSamplerProxy httpSamplerProxy = new HTTPSamplerProxy();
        HeaderManager headerManager = new HeaderManager();
        headerManager.setProperty("Content-Type", "multipart/form-data");
        httpSamplerProxy.setDomain("www.baidu.com");
        httpSamplerProxy.setPort(80);
        httpSamplerProxy.setPath("/");
        httpSamplerProxy.setMethod("GET");
        httpSamplerProxy.setConnectTimeout("5000");
        httpSamplerProxy.setUseKeepAlive(true);
        httpSamplerProxy.setProperty(TestElement.TEST_CLASS, HTTPSamplerProxy.class.getName());
        httpSamplerProxy.setHeaderManager(headerManager);

        return httpSamplerProxy;
    }

    public static LoopController createLoopController() {
        LoopController loopController = new LoopController();
        // Loop Controller
        loopController.setLoops(1);
        loopController.setContinueForever(false);
        loopController.setProperty(TestElement.TEST_CLASS, LoopController.class.getName());
        loopController.initialize();
        return loopController;
    }

    public void gouxiaodi(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.toJSONString();

    }
}
