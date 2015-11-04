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
        String tag = "VALIDATOR_PRIME";
        int n = Integer.valueOf(s).intValue();

        for(int i=2;i<n;i++) {
            if(n%i==0) {
                log.w(tag, "Is not a prime number: " + s);
                return false;
            }
        }

        return true;
    }

    public Boolean isByte(String s) {

        return true;
    }

    protected void setLog(Log log) {
       this.log = log;
    }
}
