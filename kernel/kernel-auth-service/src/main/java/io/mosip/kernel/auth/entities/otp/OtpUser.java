package io.mosip.kernel.auth.entities.otp;

public class OtpUser {
    private String email;
    private String number;
    private String langCode;
    private String otpChannel;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getOtpChannel() {
        return otpChannel;
    }

    public void setOtpChannel(String otpChannel) {
        this.otpChannel = otpChannel;
    }
}
