package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.GroupDeletePersonResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupDeletePersonRequest extends ZenoRequest<GroupDeletePersonResponse> {

    @Param(name = "group_id")
    private String groupId;

    @Param(name = "person_id")
    private String personId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Override
    public String getApi() {
        return "/v2/group/delete_person";
    }
}
