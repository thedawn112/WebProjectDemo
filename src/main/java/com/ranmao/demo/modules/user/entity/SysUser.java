package com.ranmao.demo.modules.user.entity;

/**
 * @author ran.mao
 * @version 1.0.0.1
 * @description：TODO
 * @date 2024/10/3 22:52
 */
public class SysUser {
    //id
    private String id;
    //用户名
    private String userName;
    //真实姓名
    private String realName;
    //密码
    private String passWord;
    //密码盐
    private String salt;
    //角色列表
    private String roleIds;
    //部门id
    private String departId;
    //创建时间
    private String createTime;
    //更新时间
    private String updateTime;
    //状态
    private long state;

    private int dataFlag;

    public SysUser() {
    }

    public SysUser(String id, String userName, String realName, String passWord, String salt, String roleIds, String departId, String createTime, String updateTime, long state, int dataFlag) {
        this.id = id;
        this.userName = userName;
        this.realName = realName;
        this.passWord = passWord;
        this.salt = salt;
        this.roleIds = roleIds;
        this.departId = departId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.state = state;
        this.dataFlag = dataFlag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public long getState() {
        return state;
    }

    public void setState(long state) {
        this.state = state;
    }

    public int getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(int dataFlag) {
        this.dataFlag = dataFlag;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", salt='" + salt + '\'' +
                ", roleIds='" + roleIds + '\'' +
                ", departId='" + departId + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", state=" + state +
                ", dataFlag=" + dataFlag +
                '}';
    }
}
