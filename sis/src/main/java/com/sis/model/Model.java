package com.sis.model;

import java.util.Date;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Model
{

    private Boolean isActive;
    private Integer createdBy;
    private Date createdDate;
    private Integer modifiedBy;
    private Date modifiedDate;

    public Boolean getIsActive()
    {
	return isActive;
    }

    public void setIsActive(Boolean isActive)
    {
	this.isActive = isActive;
    }

    public Integer getCreatedBy()
    {
	return createdBy;
    }

    public void setCreatedBy(Integer createdBy)
    {
	this.createdBy = createdBy;
    }

    public Date getCreatedDate()
    {
	return createdDate;
    }

    public void setCreatedDate(Date createdDate)
    {
	this.createdDate = createdDate;
    }

    public Integer getModifiedBy()
    {
	return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy)
    {
	this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate()
    {
	return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate)
    {
	this.modifiedDate = modifiedDate;
    }

}
