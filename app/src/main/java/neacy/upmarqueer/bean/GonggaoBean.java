package neacy.upmarqueer.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author hadis on 16.3.22.
 */
public class GonggaoBean implements Serializable {
    //            "status": 1,
//            "message": "ok",
//            "data": {},
//            "errorcode": "0"
    private String status;
    private String message;
    private GongGaoData data;
    private String errorcode;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GongGaoData getData() {
        return data;
    }

    public void setData(GongGaoData data) {
        this.data = data;
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }

    public static class GongGaoData implements Serializable {

        //        "count": "2",
//                "data2": []
        private String count;
        private List<GongGaoDetails> data2;

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public List<GongGaoDetails> getData2() {
            return data2;
        }

        public void setData2(List<GongGaoDetails> data2) {
            this.data2 = data2;
        }

        public static class GongGaoDetails implements Serializable {
            //                    "id": "1",
//                    "ndate": "1457426327",
//                    "ntop": "1",
//                    "ntitle": "test",
//                    "ncontent": ""
            private String id;
            private String ndate;
            private String ntop;
            private String ntitle;
            private String ncontent;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getNdate() {
                return ndate;
            }

            public void setNdate(String ndate) {
                this.ndate = ndate;
            }

            public String getNtop() {
                return ntop;
            }

            public void setNtop(String ntop) {
                this.ntop = ntop;
            }

            public String getNtitle() {
                return ntitle;
            }

            public void setNtitle(String ntitle) {
                this.ntitle = ntitle;
            }

            public String getNcontent() {
                return ncontent;
            }

            public void setNcontent(String ncontent) {
                this.ncontent = ncontent;
            }
        }
    }
}
