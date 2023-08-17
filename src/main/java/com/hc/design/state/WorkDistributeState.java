package com.hc.design.state;

/**
 * 类描述:
 *
 * @author: HuangChao
 * @since: 2023/08/07 18:16
 */
public class WorkDistributeState implements WorkState{
    @Override
    public WorkStatusEnum getState() {
        return WorkStatusEnum.DISTRIBUTE;
    }

    @Override
    public Boolean handle(WorkStateMachine workStateMachine) {
        System.out.println(getState());
        return true;
    }


}
