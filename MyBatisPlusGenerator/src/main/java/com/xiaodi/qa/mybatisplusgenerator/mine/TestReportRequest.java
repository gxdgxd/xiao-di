package com.xiaodi.qa.mybatisplusgenerator.mine;

import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

public class TestReportRequest {
    private String productName; //产品名称
    private String buildName;
    private String buildStamp;
    private String name;
    private String generator;
    private String oSName;
    private String hostname;
    private String osRelease;
    private String osVersion;
    private String osPlatform;
    private String is64Bits;
    private String vendorString;
    private String vendorId;
    private String familyId;
    private String modelId;
    private String processorCacheSize;
    private String numberOfLogicalcpu;
    private String numberOfPhysicalcpu;
    private String totalVirtualMemory;
    private String totalPhysicalMemory;
    private String logicalProcessorsPerPhysical;
    private String processorClockFrequency;
    private String source;
    private String operator;
    private String start;
    private String end;
    private String duration;
    private String os;
    private String language;
    private String testUrl;
    private String projectUrl;
    private String projectName;
    private String execPath;

    private String reportType;

    private String env;    //环境
    private String taskId;  //任务ID
    private String taskName; //任务名称
    private String execId;  //执行任务ID
    private Integer caseSum;  //case总数
    private Integer passSum;  //通过总数
    private Integer failSum;  //失败总数
    private String passNum;   //成功用例编号1，成功用例编号2"
    private String failNum;   //失败用了编号1，失败用了编号2
    private List<JSONObject> caseDetail;
    //用例详情：{"接口测试":[{"key1":"value1","key2":"value2"},{"key1":"value11","key2":"value22"}]}


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }


    public String getBuildStamp() {
        return buildStamp;
    }
    public void setBuildStamp(String buildStamp) {
        this.buildStamp = buildStamp;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGenerator() {
        return generator;
    }
    public void setGenerator(String generator) {
        this.generator = generator;
    }

    public String getOsName() {
        return oSName;
    }
    public void setOsName(String oSName) {
        this.oSName = oSName;
    }

    public String getHostName() {
        return hostname;
    }
    public void setHostName(String hostname) {
        this.hostname = hostname;
    }

    public String getOsRelease() {
        return osRelease;
    }
    public void setOsRelease(String osRelease) {
        this.osRelease = osRelease;
    }

    public String getOsVersion() {
        return osVersion;
    }
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getOsPlatform() {
        return osPlatform;
    }
    public void setOsPlatform(String osPlatform) {
        this.osPlatform = osPlatform;
    }

    public String getIs64Bits() {
        return is64Bits;
    }
    public void setIs64Bits(String is64Bits) {
        this.is64Bits = is64Bits;
    }

    public String getVendorString() {
        return vendorString;
    }
    public void setVendorString(String vendorString) {
        this.vendorString = vendorString;
    }

    public String getVendorId() {
        return vendorId;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getFamilyId() {
        return familyId;
    }
    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getProcessorCacheSize() {
        return processorCacheSize;
    }
    public void setProcessorCacheSize(String processorCacheSize) {
        this.processorCacheSize = processorCacheSize;
    }

    public String getNumberOfLogicalcpu() {
        return numberOfLogicalcpu;
    }
    public void setNumberOfLogicalcpu(String numberOfLogicalcpu) {
        this.numberOfLogicalcpu = numberOfLogicalcpu;
    }

    public String getNumberOfPhysicalcpu() {
        return numberOfPhysicalcpu;
    }
    public void setNumberOfPhysicalcpu(String numberOfPhysicalcpu) {
        this.numberOfPhysicalcpu = numberOfPhysicalcpu;
    }

    public String getTotalVirtualMemory() {
        return totalVirtualMemory;
    }
    public void setTotalVirtualMemory(String totalVirtualMemory) {
        this.totalVirtualMemory = totalVirtualMemory;
    }

    public String getTotalPhysicalMemory() {
        return totalPhysicalMemory;
    }
    public void setTotalPhysicalMemory(String totalPhysicalMemory) {
        this.totalPhysicalMemory = totalPhysicalMemory;
    }

    public String getLogicalProcessorsPerPhysical() {
        return logicalProcessorsPerPhysical;
    }
    public void setLogicalProcessorsPerPhysical(String logicalProcessorsPerPhysical) {
        this.logicalProcessorsPerPhysical = logicalProcessorsPerPhysical;
    }

    public String getProcessorClockFrequency() {
        return processorClockFrequency;
    }
    public void setProcessorClockFrequency(String processorClockFrequency) {
        this.processorClockFrequency = processorClockFrequency;
    }

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }

    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTestUrl() {
        return testUrl;
    }
    public void setTestUrl(String testUrl) {
        this.testUrl = testUrl;
    }

    public String getProjectUrl() {
        return projectUrl;
    }
    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getExecPath() {
        return execPath;
    }
    public void setExecPath(String execPath) {
        this.execPath = execPath;
    }




    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getExecId() {
        return execId;
    }

    public void setExecId(String execId) {
        this.execId = execId;
    }

    public Integer getCaseSum() {
        return caseSum;
    }

    public void setCaseSum(Integer caseSum) {
        this.caseSum = caseSum;
    }

    public Integer getPassSum() {
        return passSum;
    }

    public void setPassSum(Integer passSum) {
        this.passSum = passSum;
    }

    public Integer getFailSum() {
        return failSum;
    }

    public void setFailSum(Integer failSum) {
        this.failSum = failSum;
    }

    public String getPassNum() {
        return passNum;
    }

    public void setPassNum(String passNum) {
        this.passNum = passNum;
    }

    public String getFailNum() {
        return failNum;
    }

    public void setFailNum(String failNum) {
        this.failNum = failNum;
    }

    public List<JSONObject> getCaseDetail() {
        return caseDetail;
    }

    public void setCaseDetail(List<JSONObject> caseDetail) {
        this.caseDetail = caseDetail;
    }
}
