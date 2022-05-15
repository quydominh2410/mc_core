package com.afc.core.models;

public class UserProfile {
    private String keycloakId;
    private String username;
    private String fullName;
    private String phoneNumber;
    private String cif;
    private String dob;
    private String redeemCode;
    private String email;
    private String cardId;
    private String cardType;
    private String cardIssuedAt;
    private String cardExpiredAt;
    private String gender;
    private String address;
    private String province;
    private String district;
    private String city;
    private String avatar;
    private String userType;
    private boolean isEKYC;
    private boolean isMatching;
    private boolean isExistSocial;
    private PointUserProfile pointUserProfile;
    private String password;
    private String statusEkyc;
    private boolean isAgreeToSign; // true là đã Xác nhận đăng ký kiêm Hợp đồng giao dịch điện tử
    private String wardName;
    private String provinceId;
    private String districtId;
    private String wardId;
    private String issuedDate;
    private String permanentAddress;
    private String provinceName;
    private String districtName;
    private String temporaryAddress;
    public boolean isAgreeToSign() {
        return isAgreeToSign;
    }

    public void setAgreeToSign(boolean agreeToSign) {
        isAgreeToSign = agreeToSign;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isExistSocial() {
        return isExistSocial;
    }

    public void setExistSocial(boolean existSocial) {
        isExistSocial = existSocial;
    }


    public String getCif() {
        return cif != null ? cif : "";
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDob() {
        return dob != null ? dob : "";
    }

    public void setDob(String dob) {
        this.dob = dob;
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

    public String getCardIssuedAt() {
        return cardIssuedAt != null ? cardIssuedAt : "";
    }

    public void setCardIssuedAt(String cardIssuedAt) {
        this.cardIssuedAt = cardIssuedAt;
    }

    public String getCardExpiredAt() {
        return cardExpiredAt != null ? cardExpiredAt : "";
    }

    public void setCardExpiredAt(String cardExpiredAt) {
        this.cardExpiredAt = cardExpiredAt;
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

    @Override
    public String toString() {
        return "UserProfile{" +
                "keycloakId='" + keycloakId + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cif='" + cif + '\'' +
                ", dob='" + dob + '\'' +
                ", redeemCode='" + redeemCode + '\'' +
                ", email='" + email + '\'' +
                ", cardId='" + cardId + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardIssuedAt='" + cardIssuedAt + '\'' +
                ", cardExpiredAt='" + cardExpiredAt + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", avatar='" + avatar + '\'' +
                ", userType='" + userType + '\'' +
                ", isEKYC=" + isEKYC +
                ", pointUserProfile=" + pointUserProfile +
                ", isAgreeToSign=" + isAgreeToSign +
                '}';
    }

    public UserProfile() {
    }

    public UserProfile(String keycloakId, String username, String fullName, String phoneNumber, boolean isEKYC) {
        this.keycloakId = keycloakId;
        this.username = username;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.isEKYC = isEKYC;
    }

    public String getkeycloakId() {
        return keycloakId != null ? keycloakId : "";
    }

    public void setkeycloakId(String keycloakId) {
        this.keycloakId = keycloakId;
    }

    public String getUsername() {
        return username != null ? username : "";
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName != null ? fullName : "";
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber != null ? phoneNumber : "";
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isEKYC() {
        return isEKYC;
    }

    public void setEKYC(boolean EKYC) {
        isEKYC = EKYC;
    }

    public boolean isMatching() {
        return isMatching;
    }

    public void setMatching(boolean matching) {
        isMatching = matching;
    }

    public void updateUserProfile(UserInfoModel userInfoModel) {
        keycloakId = userInfoModel.getKeycloakId();
        username = userInfoModel.getUsername();
        phoneNumber = userInfoModel.getPhoneNumber();
        dob = userInfoModel.getDob();
        fullName = userInfoModel.getFullName();
        cif = userInfoModel.getCif();
        redeemCode = userInfoModel.getRedeemCode();
        avatar = userInfoModel.getAvatar();
        address = userInfoModel.getAddress();
        cardExpiredAt = userInfoModel.getExpiredDate();
        cardId = userInfoModel.getCardId();
        cardIssuedAt = userInfoModel.getIssuedPlace();
        cardType = userInfoModel.getCardType();
        city = userInfoModel.getCity();
        email = userInfoModel.getEmail();
        cardType = userInfoModel.getCardType();
        gender = userInfoModel.getGender();
        province = userInfoModel.getProvince();
        district = userInfoModel.getDistrict();
        userType = userInfoModel.getUserType();
        pointUserProfile = userInfoModel.getPointUserProfile();
        statusEkyc = userInfoModel.getStatusEkyc();
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getWardId() {
        return wardId;
    }

    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getTemporaryAddress() {
        return temporaryAddress;
    }

    public void setTemporaryAddress(String temporaryAddress) {
        this.temporaryAddress = temporaryAddress;
    }
}
