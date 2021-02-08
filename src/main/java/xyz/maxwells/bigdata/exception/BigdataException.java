package xyz.maxwells.bigdata.exception;

/**
 * Created by wuzusheng on 2018/3/10.
 */
public class BigdataException extends Exception {
    public BigdataException(String msg) {
        super(msg);
    }
    public BigdataException(Exception ex) {
        super(ex);
    }
}
