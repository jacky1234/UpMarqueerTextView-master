package neacy.upmarqueer.bean;

import java.io.Serializable;

/**
 * @author hadis on 16.4.07.
 */
public class WXBean implements Serializable {


    /**
     * status : 1
     * message : ok
     * data : {"appid":"wx601c49cfd8d8102e","noncestr":"s93egm04ce40c0l05wpiy5fp5rcqu09h","package":"Sign=WXPay","partnerid":"1329717301","prepayid":"wx2016040716541075dfdedcaf0270390411","timestamp":1460019250,"sign":"E4D4F01831F1CFB33AF57A8BC8F4F73C"}
     * errorcode : 0
     */

    private int status;
    private String message;

    private DataBean data;
    private String errorcode;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }

    public static class DataBean {

        /**
         * appid : wx601c49cfd8d8102e
         * noncestr : s93egm04ce40c0l05wpiy5fp5rcqu09h
         * package : Sign=WXPay
         * partnerid : 1329717301
         * prepayid : wx2016040716541075dfdedcaf0270390411
         * timestamp : 1460019250
         * sign : E4D4F01831F1CFB33AF57A8BC8F4F73C
         */

        private String appid;
        private String noncestr;
        private String partnerid;
        private String prepayid;
        private int timestamp;
        private String sign;

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getNoncestr() {
            return noncestr;
        }

        public void setNoncestr(String noncestr) {
            this.noncestr = noncestr;
        }

        public String getPartnerid() {
            return partnerid;
        }

        public void setPartnerid(String partnerid) {
            this.partnerid = partnerid;
        }

        public String getPrepayid() {
            return prepayid;
        }

        public void setPrepayid(String prepayid) {
            this.prepayid = prepayid;
        }

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }
    }
}
