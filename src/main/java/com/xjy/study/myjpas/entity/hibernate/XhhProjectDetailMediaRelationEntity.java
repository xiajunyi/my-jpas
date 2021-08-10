package com.xjy.study.myjpas.entity.hibernate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "xhh_project_detail_media_relation", schema = "xhh", catalog = "")
public class XhhProjectDetailMediaRelationEntity {
    private long id;
    private long projectDetailId;
    private String mediaUrl;
    private String creatorId;
    private String updaterId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private byte isDelete;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "project_detail_id", nullable = false)
    public long getProjectDetailId() {
        return projectDetailId;
    }

    public void setProjectDetailId(long projectDetailId) {
        this.projectDetailId = projectDetailId;
    }

    @Basic
    @Column(name = "media_url", nullable = false, length = 255)
    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    @Basic
    @Column(name = "creator_id", nullable = false, length = 36)
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    @Basic
    @Column(name = "updater_id", nullable = false, length = 36)
    public String getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    @Basic
    @Column(name = "create_time", nullable = false)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time", nullable = false)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "is_delete", nullable = false)
    public byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(byte isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XhhProjectDetailMediaRelationEntity that = (XhhProjectDetailMediaRelationEntity) o;

        if (id != that.id) return false;
        if (projectDetailId != that.projectDetailId) return false;
        if (isDelete != that.isDelete) return false;
        if (mediaUrl != null ? !mediaUrl.equals(that.mediaUrl) : that.mediaUrl != null) return false;
        if (creatorId != null ? !creatorId.equals(that.creatorId) : that.creatorId != null) return false;
        if (updaterId != null ? !updaterId.equals(that.updaterId) : that.updaterId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (projectDetailId ^ (projectDetailId >>> 32));
        result = 31 * result + (mediaUrl != null ? mediaUrl.hashCode() : 0);
        result = 31 * result + (creatorId != null ? creatorId.hashCode() : 0);
        result = 31 * result + (updaterId != null ? updaterId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (int) isDelete;
        return result;
    }
}
