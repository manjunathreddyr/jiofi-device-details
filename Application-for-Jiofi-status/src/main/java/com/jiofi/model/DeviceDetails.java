package com.jiofi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author MANJUNATH REDDY R on 21-07-2022
 * @project Application-for-Jiofi-status
 */

@JacksonXmlRootElement(localName="dev")
public class DeviceDetails {

    @JacksonXmlProperty(localName="dsc")
    @JsonProperty("dsc")
    private String dsc;

    @JacksonXmlProperty(localName="time")
    @JsonProperty("time")
    private String time;

    @JacksonXmlProperty(localName="odm")
    @JsonProperty("odm")
    private String odm;

    @JacksonXmlProperty(localName="model")
    @JsonProperty("model")
    private String model;

    @JacksonXmlProperty(localName="oui")
    @JsonProperty("oui")
    private String oui;

    @JacksonXmlProperty(localName="make")
    @JsonProperty("make")
    private String make;

    @JacksonXmlProperty(localName="serial")
    @JsonProperty("serial")
    private String  serial;

    @JacksonXmlProperty(localName="imei")
    @JsonProperty("imei")
    private String imei;

    @JacksonXmlProperty(localName="imsi")
    @JsonProperty("imsi")
    private String imsi;

    @JacksonXmlProperty(localName="msisdn")
    @JsonProperty("msisdn")
    private String msisdn;

    @JacksonXmlProperty(localName="iccid")
    @JsonProperty("iccid")
    private String  iccid;

    @JacksonXmlProperty(localName="swver")
    @JsonProperty("swver")
    private String  swver;

    @JacksonXmlProperty(localName="swdate")
    @JsonProperty("swdate")
    private String swdate;

    @JacksonXmlProperty(localName="hwver")
    @JsonProperty("hwver")
    private String hwver;

    @JacksonXmlProperty(localName="uiver")
    @JsonProperty("uiver")
    private String uiver;

    @JacksonXmlProperty(localName="macaddr")
    @JsonProperty("macaddr")
    private String macaddr;

    @JacksonXmlProperty(localName="batt_per")
    @JsonProperty("batt_per")
    private String batt_per;

    @JacksonXmlProperty(localName="batt_st")
    @JsonProperty("batt_st")
    private String batt_st;

    @JacksonXmlProperty(localName="freq")
    @JsonProperty("freq")
    private String freq;

    @JacksonXmlProperty(localName="refresh")
    @JsonProperty("refresh")
    private String refresh;

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getOdm() {
        return odm;
    }

    public void setOdm(String odm) {
        this.odm = odm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOui() {
        return oui;
    }

    public void setOui(String oui) {
        this.oui = oui;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getSwver() {
        return swver;
    }

    public void setSwver(String swver) {
        this.swver = swver;
    }

    public String getSwdate() {
        return swdate;
    }

    public void setSwdate(String swdate) {
        this.swdate = swdate;
    }

    public String getHwver() {
        return hwver;
    }

    public void setHwver(String hwver) {
        this.hwver = hwver;
    }

    public String getUiver() {
        return uiver;
    }

    public void setUiver(String uiver) {
        this.uiver = uiver;
    }

    public String getMacaddr() {
        return macaddr;
    }

    public void setMacaddr(String macaddr) {
        this.macaddr = macaddr;
    }

    public String getBatt_per() {
        return batt_per;
    }

    public void setBatt_per(String batt_per) {
        this.batt_per = batt_per;
    }

    public String getBatt_st() {
        return batt_st;
    }

    public void setBatt_st(String batt_st) {
        this.batt_st = batt_st;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    public String getRefresh() {
        return refresh;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }
}
