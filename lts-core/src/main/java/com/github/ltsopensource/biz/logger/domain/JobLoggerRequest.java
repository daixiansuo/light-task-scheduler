package com.github.ltsopensource.biz.logger.domain;

import com.github.ltsopensource.admin.request.PaginationReq;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Date;

/**
 * @author Robert HG (254963746@qq.com) on 6/11/15.
 */
public class JobLoggerRequest extends PaginationReq {

    /**
     * 前端页面 搜索填写的 任务ID
     */
    private String realTaskId;
    private String taskId;

    /**
     * 节点组
     */
    private String taskTrackerNodeGroup;

    /**
     * 日志类型
     */
    private String logType;

    /**
     * 日志等级
     */
    private String level;

    /**
     * 执行结果
     */
    private String success;

    /**
     * 开始时间
     */
    private Date startLogTime;

    /**
     * 结束时间
     */
    private Date endLogTime;

    public String getRealTaskId() {
        return realTaskId;
    }

    public void setRealTaskId(String realTaskId) {
        this.realTaskId = realTaskId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskTrackerNodeGroup() {
        return taskTrackerNodeGroup;
    }

    public void setTaskTrackerNodeGroup(String taskTrackerNodeGroup) {
        this.taskTrackerNodeGroup = taskTrackerNodeGroup;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Date getStartLogTime() {
        return startLogTime;
    }

    public void setStartLogTime(Date startLogTime) {
        this.startLogTime = startLogTime;
    }

    public Date getEndLogTime() {
        return endLogTime;
    }

    public void setEndLogTime(Date endLogTime) {
        this.endLogTime = endLogTime;
    }
}
