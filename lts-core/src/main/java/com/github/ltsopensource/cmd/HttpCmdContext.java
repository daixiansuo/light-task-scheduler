package com.github.ltsopensource.cmd;

import com.github.ltsopensource.core.commons.utils.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Robert HG (254963746@qq.com)  on 2/17/16.
 */
public class HttpCmdContext {

    private ReentrantLock lock = new ReentrantLock();

    /**
     * Key: 节点标识
     * Value: <cmd, cmdProcess>   ---->  k: 命令  v: 对应处理器
     */
    private final Map<String, Map<String, HttpCmdProc>>
            NODE_PROCESSOR_MAP = new HashMap<String, Map<String, HttpCmdProc>>();

    public void addCmdProcessor(HttpCmdProc proc) {
        if (proc == null) {
            throw new IllegalArgumentException("proc can not be null");
        }

        String identity = proc.nodeIdentity();
        Assert.hasText(identity, "nodeIdentity can't be empty");

        String command = proc.getCommand();
        Assert.hasText(command, "command can't be empty");

        // 根据 NODE唯一标识 获取节点命令集
        Map<String, HttpCmdProc> cmdProcessorMap = NODE_PROCESSOR_MAP.get(identity);
        if (cmdProcessorMap == null) {
            lock.lock();
            cmdProcessorMap = NODE_PROCESSOR_MAP.get(identity);
            if (cmdProcessorMap == null) {
                // 不存在，创建
                cmdProcessorMap = new ConcurrentHashMap<String, HttpCmdProc>();
                // 添加值hash
                NODE_PROCESSOR_MAP.put(identity, cmdProcessorMap);
            }
            lock.unlock();
        }
        // 创建成功之后，添加命令 与 对应的处理器
        cmdProcessorMap.put(command, proc);
    }

    public HttpCmdProc getCmdProcessor(String nodeIdentity, String command) {
        Assert.hasText(nodeIdentity, "nodeIdentity can't be empty");

        Map<String, HttpCmdProc> cmdProcessorMap = NODE_PROCESSOR_MAP.get(nodeIdentity);
        if (cmdProcessorMap == null) {
            return null;
        }
        return cmdProcessorMap.get(command);
    }

}
