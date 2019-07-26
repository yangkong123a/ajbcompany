package Utils;

/**
 * @author HeYi
 * @version V2.0
 * @Description: 创建JavaBean
 * @date 2019/5/29 9:39
 */
public class BeanCreate {

    //推荐人类型 1：代理人推荐，2：内部人员推荐，3：机构推荐
    private String zengYuanType;
    //推荐人分公司代码
    private String fenGongSiId;
    //推荐人代码
    private String salerId;

    /**
     * 获取 推荐人类型 1：代理人推荐，2：内部人员推荐，3：机构推荐
     * @return zengYuanType 推荐人类型 1：代理人推荐，2：内部人员推荐，3：机构推荐
     */
    public String getZengYuanType() {
        return this.zengYuanType;
    }

    /**
     * 设置 推荐人类型 1：代理人推荐，2：内部人员推荐，3：机构推荐
     * @param zengYuanType 推荐人类型 1：代理人推荐，2：内部人员推荐，3：机构推荐
     */
    public void setZengYuanType(String zengYuanType) {
        this.zengYuanType = zengYuanType;
    }

    /**
     * 获取 推荐人分公司代码
     * @return fenGongSiId 推荐人分公司代码
     */
    public String getFenGongSiId() {
        return this.fenGongSiId;
    }

    /**
     * 设置 推荐人分公司代码
     * @param fenGongSiId 推荐人分公司代码
     */
    public void setFenGongSiId(String fenGongSiId) {
        this.fenGongSiId = fenGongSiId;
    }

    /**
     * 获取 推荐人代码
     * @return salerId 推荐人代码
     */
    public String getSalerId() {
        return this.salerId;
    }

    /**
     * 设置 推荐人代码
     * @param salerId 推荐人代码
     */
    public void setSalerId(String salerId) {
        this.salerId = salerId;
    }
}
