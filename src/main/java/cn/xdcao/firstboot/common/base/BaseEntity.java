package cn.xdcao.firstboot.common.base;

import cn.xdcao.firstboot.common.constants.DomainConstants;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xd.cao
 * @version 1.0.0
 * @ClassName: BaseEntity.java
 * @Description: base entity
 * @date 2020年03月13日 01:36:00
 */
@Data
public class BaseEntity implements Serializable {

    /**
     * 对象id,自动生成随机码
     */
    private Long objectId;

    /**
     *对象创始人
     *@date: 2020/3/13
     */
    private String orginator;

    /**
     * 对象当前拥有者
     */
    private String owner;

    /**
     * 修改的人
     */
    private String modPerson;

    /**
     * 对象状态，是否激活,默认激活
     */
    private String status = DomainConstants.STATE_ACTIVE;

    /**
     *创建时间
     *@date: 2020/3/13
     */
    private Date createDate;

    /**
     *更新时间
     *@date: 2020/3/13
     */
    private Date updateDate;


}
