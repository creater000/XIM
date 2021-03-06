package com.xim.common.session;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 用户session
 *
 * @author noodle
 * @date 2019/6/24 18:23
 */
public class Session {

    /**
     * 用户唯一性标识
     */
    private String userId;

    private String userName;

    /**
     * 用于存储用户所加入的群
     */
    private Set<String> joinedGroups = ConcurrentHashMap.newKeySet();

    public Session() {
    }

    public Session(String userName) {
        this.userName = userName;
    }

    public Session(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Set<String> getJoinedGroups() {
        return joinedGroups;
    }

    public void setJoinedGroups(Set<String> joinedGroups) {
        this.joinedGroups = joinedGroups;
    }

    @Override
    public String toString() {
        return userId + ":" + userName;
    }
}
