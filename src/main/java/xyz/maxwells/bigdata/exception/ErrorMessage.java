package xyz.maxwells.bigdata.exception;

/**
 * Created by wuzusheng on 2018/3/9.
 */
//错误码封装类
public class ErrorMessage {
    private final String DEFAULT_CODE = "-1";
    private final String DEFAULT_MESSAGE = "系统异常，请联系管理员";

    private String errorCode;
    private String errorMessage;

    public ErrorMessage(BigdataException message) {
            this.initMessage(message.getMessage());
    }
    public void initMessage(String errMsg){
        if (errMsg != null && !"".equals(errMsg)){
            int pos = errMsg.indexOf("::");
            if (pos != -1){
                this.setErrorCode(errMsg.substring(0,pos));
                this.setErrorMessage(errMsg.substring(pos + 2));
            }
        }
        if (errorCode == null || "".equals(errorCode)){
            this.setErrorCode(DEFAULT_CODE);
            this.setErrorMessage(DEFAULT_MESSAGE);
        }
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
