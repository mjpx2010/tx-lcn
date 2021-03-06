package com.lorne.tx.service.model;

import com.lorne.core.framework.utils.task.Task;
import com.lorne.tx.mq.model.TxGroup;
import org.springframework.transaction.TransactionStatus;

/**
 * Created by lorne on 2017/6/9.
 */
public class ServiceThreadModel {

    private Task waitTask;
    private TransactionStatus status;
    private TxGroup txGroup;
    private boolean notifyOk;
    private String compensateId;


    public Task getWaitTask() {
        return waitTask;
    }

    public void setWaitTask(Task waitTask) {
        this.waitTask = waitTask;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public TxGroup getTxGroup() {
        return txGroup;
    }

    public void setTxGroup(TxGroup txGroup) {
        this.txGroup = txGroup;
    }

    public boolean isNotifyOk() {
        return notifyOk;
    }

    public void setNotifyOk(boolean notifyOk) {
        this.notifyOk = notifyOk;
    }

    public String getCompensateId() {
        return compensateId;
    }

    public void setCompensateId(String compensateId) {
        this.compensateId = compensateId;
    }
}
