package com.github.ltsopensource.admin.request;

import java.util.Date;
import java.util.Map;

/**
 * @author Robert HG (254963746@qq.com) on 6/6/15.
 */
public class JobQueueReq extends PaginationReq {

    // ------------ 下面是查询条件值 ---------------
    /**
     * jobId
     */
    private String jobId;
    /**
     * 任务类型
     */
    private String jobType;
    /**
     * 任务ID
     */
    private String taskId;
    /**
     * 真实任务ID
     */
    private String realTaskId;

    /**
     * 提交节点组
     */
    private String submitNodeGroup;

    /**
     * 执行节点组
     */
    private String taskTrackerNodeGroup;

    private Date startGmtCreated;
    private Date endGmtCreated;
    private Date startGmtModified;
    private Date endGmtModified;

    // ------------ 下面是能update的值 -------------------

    /**
     * Cron任务 - cron 表达式
     */
    private String cronExpression;

    /**
     * 是否需要反馈客户端
     */
    private Boolean needFeedback;

    /**
     * 用户参数
     */
    private Map<String, String> extParams;

    /**
     * 定时任务 - 触发时间
     */
    private Date triggerTime;

    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 最大重试次数
     */
    private Integer maxRetryTimes;

    /**
     * Repeat任务 - 重复次数
     */
    private Integer repeatCount;

    /**
     * Repeat任务 - 触发时间间隔
     */
    private Long repeatInterval;

    /**
     * 是否依赖上一周期
     */
    private Boolean relyOnPrevCycle;

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getSubmitNodeGroup() {
        return submitNodeGroup;
    }

    public void setSubmitNodeGroup(String submitNodeGroup) {
        this.submitNodeGroup = submitNodeGroup;
    }

    public String getTaskTrackerNodeGroup() {
        return taskTrackerNodeGroup;
    }

    public void setTaskTrackerNodeGroup(String taskTrackerNodeGroup) {
        this.taskTrackerNodeGroup = taskTrackerNodeGroup;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public Boolean getNeedFeedback() {
        return needFeedback;
    }

    public void setNeedFeedback(Boolean needFeedback) {
        this.needFeedback = needFeedback;
    }

    public Map<String, String> getExtParams() {
        return extParams;
    }

    public void setExtParams(Map<String, String> extParams) {
        this.extParams = extParams;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getStartGmtCreated() {
        return startGmtCreated;
    }

    public void setStartGmtCreated(Date startGmtCreated) {
        this.startGmtCreated = startGmtCreated;
    }

    public Date getEndGmtCreated() {
        return endGmtCreated;
    }

    public void setEndGmtCreated(Date endGmtCreated) {
        this.endGmtCreated = endGmtCreated;
    }

    public Date getStartGmtModified() {
        return startGmtModified;
    }

    public void setStartGmtModified(Date startGmtModified) {
        this.startGmtModified = startGmtModified;
    }

    public Date getEndGmtModified() {
        return endGmtModified;
    }

    public void setEndGmtModified(Date endGmtModified) {
        this.endGmtModified = endGmtModified;
    }

    public Date getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(Date triggerTime) {
        this.triggerTime = triggerTime;
    }

    public Integer getMaxRetryTimes() {
        return maxRetryTimes;
    }

    public void setMaxRetryTimes(Integer maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
    }

    public Integer getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(Integer repeatCount) {
        this.repeatCount = repeatCount;
    }

    public Long getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public Boolean getRelyOnPrevCycle() {
        return relyOnPrevCycle;
    }

    public void setRelyOnPrevCycle(Boolean relyOnPrevCycle) {
        this.relyOnPrevCycle = relyOnPrevCycle;
    }

    public String getRealTaskId() {
        return realTaskId;
    }

    public void setRealTaskId(String realTaskId) {
        this.realTaskId = realTaskId;
    }
}
