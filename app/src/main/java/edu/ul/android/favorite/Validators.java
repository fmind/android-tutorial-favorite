package edu.ul.android.favorite;

import android.util.Log;

public class Validators {
    private Log log;

    public Boolean isIp(String s) {
        String tag = "VALIDATOR_IP";

        if (!s.matches("\\d+\\.\\d+\\.\\d+\\.\\d+")) {
            log.w(tag, "IP Does not match regexp: " + s);

            return false;
        }

        return true;
    }

    public Boolean isPrime(String s) {

        return true;
    }

    public Boolean isByte(String s) {

        return true;
    }

    protected void setLog(Log log) {
       this.log = log;
    }
}
