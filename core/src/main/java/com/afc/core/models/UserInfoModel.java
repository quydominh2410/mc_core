package com.afc.core.models;

import com.google.gson.annotations.SerializedName;

public class UserInfoModel extends LoginResponseModel{

    @SerializedName("keycloakId")
    private String keycloakId;

    @SerializedName("cif")
    private String cif;

    @SerializedName("fullName")
    private String fullName;
    @SerializedName("username")
    private String username;
    @SerializedName("dob")
    private String dob;

    @SerializedName("phoneNumber")
    private String phoneNumber;

    @SerializedName("redeemCode")
    private String redeemCode;

    @SerializedName("email")
    private String email;

    @SerializedName("cardId")
    private String cardId;

    @SerializedName("cardType")
    private String cardType;

    @SerializedName("gender")
    private String gender;

    @SerializedName("address")
    private String address;

    @SerializedName("province")
    private String province;

    @SerializedName("district")
    private String district;

    @SerializedName("city")
    private String city;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("userType")
    private String userType;

    @SerializedName("isActive")
    private boolean isActive;

    @SerializedName("createdDate")
    private String createdDate;

    @SerializedName("modifedDate")
    private String modifedDate;

    @SerializedName("provinceName")
    private String provinceName;

    @SerializedName("districtName")
    private String districtName;

    @SerializedName("temporaryAddress")
    private String temporaryAddress;

    @SerializedName("wardName")
    private String wardName;
    @SerializedName("permanentAddress")
    private String permanentAddress;
    @SerializedName("issuedDate")
    private String issuedDate;
    @SerializedName("expiredDate")
    private String expiredDate;
    @SerializedName("issuedPlace")
    private String issuedPlace;
    @SerializedName("provinceId")
    private String provinceId;
    @SerializedName("districtId")
    private String districtId;
    @SerializedName("wardId")
    private String wardId;
    @SerializedName("pointUserProfile")
    private PointUserProfile pointUserProfile;
    @SerializedName("statusEkyc")
    private String statusEkyc;

    public String getProvinceId() {
        return provinceId != null ? provinceId : "";
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getDistrictId() {
        return districtId != null ? districtId : "";
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getWardId() {
        return wardId != null ? wardId : "";
    }

    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    public String getIssuedPlace() {
        return issuedPlace != null ? issuedPlace : "";
    }

    public void setIssuedPlace(String issuedPlace) {
        this.issuedPlace = issuedPlace;
    }

    public String getPermanentAddress() {
        return permanentAddress != null ? permanentAddress : "";
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getIssuedDate() {
        return issuedDate != null ? issuedDate : "";
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getExpiredDate() {
        return expiredDate != null ? expiredDate : "";
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getKeycloakId() {
        return keycloakId != null ? keycloakId : "";
    }

    public void setKeycloakId(String keycloakId) {
        this.keycloakId = keycloakId;
    }

    public String getCif() {
        return cif != null ? cif : "";
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getFullName() {
        return fullName != null ? fullName : "";
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username != null ? username : "";
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDob() {
        return dob != null ? dob : "";
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhoneNumber() {
        return phoneNumber != null ? phoneNumber : "";
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRedeemCode() {
        return redeemCode != null ? redeemCode : "";
    }

    public void setRedeemCode(String redeemCode) {
        this.redeemCode = redeemCode;
    }

    public String getEmail() {
        return email != null ? email : "";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCardId() {
        return cardId != null ? cardId : "";
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardType() {
        return cardType != null ? cardType : "";
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getGender() {
        return gender != null ? gender : "";
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address != null ? address : "";
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return province != null ? province : "";
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district != null ? district : "";
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city != null ? city : "";
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAvatar() {
        return avatar != null ? avatar : "";
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUserType() {
        return userType != null ? userType : "";
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCreatedDate() {
        return createdDate != null ? createdDate : "";
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifedDate() {
        return modifedDate != null ? modifedDate : "";
    }

    public void setModifedDate(String modifedDate) {
        this.modifedDate = modifedDate;
    }

    public String getProvinceName() {
        return provinceName != null ? provinceName : "";
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getDistrictName() {
        return districtName != null ? districtName : "";
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getTemporaryAddress() {
        return temporaryAddress != null ? temporaryAddress : "";
    }

    public void setTemporaryAddress(String temporaryAddress) {
        this.temporaryAddress = temporaryAddress;
    }

    public String getWardName() {
        return wardName != null ? wardName : "";
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public PointUserProfile getPointUserProfile() {
        return pointUserProfile;
    }

    public void setPointUserProfile(PointUserProfile pointUserProfile) {
        this.pointUserProfile = pointUserProfile;
    }

    public String getStatusEkyc() {
        return statusEkyc;
    }

    public void setStatusEkyc(String statusEkyc) {
        this.statusEkyc = statusEkyc;
    }

    public UserInfoModel() {
    }

    @Override
    public String toString() {
        return "UserInfoModel{" +
                "keycloakId='" + keycloakId + '\'' +
                ", cif='" + cif + '\'' +
                ", fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", dob='" + dob + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", redeemCode='" + redeemCode + '\'' +
                ", email='" + email + '\'' +
                ", cardId='" + cardId + '\'' +
                ", cardType='" + cardType + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", avatar='" + avatar + '\'' +
                ", userType='" + userType + '\'' +
                ", isActive=" + isActive +
                ", createdDate='" + createdDate + '\'' +
                ", modifedDate='" + modifedDate + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", districtName='" + districtName + '\'' +
                ", temporaryAddress='" + temporaryAddress + '\'' +
                ", wardName='" + wardName + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", issuedDate='" + issuedDate + '\'' +
                ", expiredDate='" + expiredDate + '\'' +
                ", issuedPlace='" + issuedPlace + '\'' +
                ", provinceId='" + provinceId + '\'' +
                ", districtId='" + districtId + '\'' +
                ", wardId='" + wardId + '\'' +
                ", pointUserProfile=" + pointUserProfile +
                '}';
    }
}
