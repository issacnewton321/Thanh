// Generated with g9.

package com.abc.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="sanpham")
public class Sanpham implements Serializable {

    /** Primary key. */
    protected static final String PK = "masp";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(unique=true, nullable=false, length=255)
    private String masp;
    @Column(nullable=false, precision=53)
    private double dongia;
    @Column(nullable=false, precision=53)
    private double khuyenmai;
    @Column(name="mota_chitiet", length=255)
    private String motaChitiet;
    @Column(name="mota_ngan", length=255)
    private String motaNgan;
    @Column(length=255)
    private String photo;
    @Column(nullable=false, precision=10)
    private int soluong;
    @Column(length=255)
    private String tensp;

    /** Default constructor. */
    public Sanpham() {
        super();
    }

    /**
     * Access method for masp.
     *
     * @return the current value of masp
     */
    public String getMasp() {
        return masp;
    }

    /**
     * Setter method for masp.
     *
     * @param aMasp the new value for masp
     */
    public void setMasp(String aMasp) {
        masp = aMasp;
    }

    /**
     * Access method for dongia.
     *
     * @return the current value of dongia
     */
    public double getDongia() {
        return dongia;
    }

    /**
     * Setter method for dongia.
     *
     * @param aDongia the new value for dongia
     */
    public void setDongia(double aDongia) {
        dongia = aDongia;
    }

    /**
     * Access method for khuyenmai.
     *
     * @return the current value of khuyenmai
     */
    public double getKhuyenmai() {
        return khuyenmai;
    }

    /**
     * Setter method for khuyenmai.
     *
     * @param aKhuyenmai the new value for khuyenmai
     */
    public void setKhuyenmai(double aKhuyenmai) {
        khuyenmai = aKhuyenmai;
    }

    /**
     * Access method for motaChitiet.
     *
     * @return the current value of motaChitiet
     */
    public String getMotaChitiet() {
        return motaChitiet;
    }

    /**
     * Setter method for motaChitiet.
     *
     * @param aMotaChitiet the new value for motaChitiet
     */
    public void setMotaChitiet(String aMotaChitiet) {
        motaChitiet = aMotaChitiet;
    }

    /**
     * Access method for motaNgan.
     *
     * @return the current value of motaNgan
     */
    public String getMotaNgan() {
        return motaNgan;
    }

    /**
     * Setter method for motaNgan.
     *
     * @param aMotaNgan the new value for motaNgan
     */
    public void setMotaNgan(String aMotaNgan) {
        motaNgan = aMotaNgan;
    }

    /**
     * Access method for photo.
     *
     * @return the current value of photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * Setter method for photo.
     *
     * @param aPhoto the new value for photo
     */
    public void setPhoto(String aPhoto) {
        photo = aPhoto;
    }

    /**
     * Access method for soluong.
     *
     * @return the current value of soluong
     */
    public int getSoluong() {
        return soluong;
    }

    /**
     * Setter method for soluong.
     *
     * @param aSoluong the new value for soluong
     */
    public void setSoluong(int aSoluong) {
        soluong = aSoluong;
    }

    /**
     * Access method for tensp.
     *
     * @return the current value of tensp
     */
    public String getTensp() {
        return tensp;
    }

    /**
     * Setter method for tensp.
     *
     * @param aTensp the new value for tensp
     */
    public void setTensp(String aTensp) {
        tensp = aTensp;
    }

    /**
     * Compares the key for this instance with another Sanpham.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Sanpham and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Sanpham)) {
            return false;
        }
        Sanpham that = (Sanpham) other;
        Object myMasp = this.getMasp();
        Object yourMasp = that.getMasp();
        if (myMasp==null ? yourMasp!=null : !myMasp.equals(yourMasp)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Sanpham.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Sanpham)) return false;
        return this.equalKeys(other) && ((Sanpham)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getMasp() == null) {
            i = 0;
        } else {
            i = getMasp().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Sanpham |");
        sb.append(" masp=").append(getMasp());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("masp", getMasp());
        return ret;
    }

}
