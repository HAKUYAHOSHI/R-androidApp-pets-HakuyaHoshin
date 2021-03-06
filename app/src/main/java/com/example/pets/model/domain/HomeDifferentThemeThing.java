package com.example.pets.model.domain;

import java.util.List;

public class HomeDifferentThemeThing {   //?

    public Boolean success;
    public long code;
    public String message;
    public List<DataBean> data;

    public static class DataBean {
        public long category_id;
        public Object category_name;
        public String click_url;
        public String commission_rate;
        public long coupon_amount;
        public String coupon_click_url;
        public String coupon_end_time;
        public Object coupon_info;
        public long coupon_remain_count;
        public String coupon_share_url;
        public String coupon_start_fee;
        public String coupon_start_time;
        public long coupon_total_count;
        public String item_description;
        public Long item_id;
        public long level_one_category_id;
        public String level_one_category_name;
        public String nick;
        public String pict_url;
        public long seller_id;
        public String shop_title;
        public SmallImagesBean small_images;
        public String title;
        public long  user_type;
        public long volume;
        public String zk_final_price;

        public static class SmallImagesBean {
            public List<String> string;
        }



        public long getCategory_id() {
            return category_id;
        }

        public void setCategory_id(long category_id) {
            this.category_id = category_id;
        }

        public Object getCategory_name() {
            return category_name;
        }

        public void setCategory_name(Object category_name) {
            this.category_name = category_name;
        }

        public String getClick_url() {
            return click_url;
        }

        public void setClick_url(String click_url) {
            this.click_url = click_url;
        }

        public String getCommission_rate() {
            return commission_rate;
        }

        public void setCommission_rate(String commission_rate) {
            this.commission_rate = commission_rate;
        }

        public long getCoupon_amount() {
            return coupon_amount;
        }

        public void setCoupon_amount(long coupon_amount) {
            this.coupon_amount = coupon_amount;
        }

        public String getCoupon_click_url() {
            return coupon_click_url;
        }

        public void setCoupon_click_url(String coupon_click_url) {
            this.coupon_click_url = coupon_click_url;
        }

        public String getCoupon_end_time() {
            return coupon_end_time;
        }

        public void setCoupon_end_time(String coupon_end_time) {
            this.coupon_end_time = coupon_end_time;
        }

        public Object getCoupon_info() {
            return coupon_info;
        }

        public void setCoupon_info(Object coupon_info) {
            this.coupon_info = coupon_info;
        }

        public long getCoupon_remain_count() {
            return coupon_remain_count;
        }

        public void setCoupon_remain_count(long coupon_remain_count) {
            this.coupon_remain_count = coupon_remain_count;
        }

        public String getCoupon_share_url() {
            return coupon_share_url;
        }

        public void setCoupon_share_url(String coupon_share_url) {
            this.coupon_share_url = coupon_share_url;
        }

        public String getCoupon_start_fee() {
            return coupon_start_fee;
        }

        public void setCoupon_start_fee(String coupon_start_fee) {
            this.coupon_start_fee = coupon_start_fee;
        }

        public String getCoupon_start_time() {
            return coupon_start_time;
        }

        public void setCoupon_start_time(String coupon_start_time) {
            this.coupon_start_time = coupon_start_time;
        }

        public long getCoupon_total_count() {
            return coupon_total_count;
        }

        public void setCoupon_total_count(long coupon_total_count) {
            this.coupon_total_count = coupon_total_count;
        }

        public String getItem_description() {
            return item_description;
        }

        public void setItem_description(String item_description) {
            this.item_description = item_description;
        }

        public Long getItem_id() {
            return item_id;
        }

        public void setItem_id(Long item_id) {
            this.item_id = item_id;
        }

        public long getLevel_one_category_id() {
            return level_one_category_id;
        }

        public void setLevel_one_category_id(long level_one_category_id) {
            this.level_one_category_id = level_one_category_id;
        }

        public String getLevel_one_category_name() {
            return level_one_category_name;
        }

        public void setLevel_one_category_name(String level_one_category_name) {
            this.level_one_category_name = level_one_category_name;
        }

        public String getNick() {
            return nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public String getPict_url() {
            return pict_url;
        }

        public void setPict_url(String pict_url) {
            this.pict_url = pict_url;
        }

        public long getSeller_id() {
            return seller_id;
        }

        public void setSeller_id(long seller_id) {
            this.seller_id = seller_id;
        }

        public String getShop_title() {
            return shop_title;
        }

        public void setShop_title(String shop_title) {
            this.shop_title = shop_title;
        }

        public SmallImagesBean getSmall_images() {
            return small_images;
        }

        public void setSmall_images(SmallImagesBean small_images) {
            this.small_images = small_images;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public long getUser_type() {
            return user_type;
        }

        public void setUser_type(long user_type) {
            this.user_type = user_type;
        }

        public long getVolume() {
            return volume;
        }

        public void setVolume(long volume) {
            this.volume = volume;
        }

        public String getZk_final_price() {
            return zk_final_price;
        }

        public void setZk_final_price(String zk_final_price) {
            this.zk_final_price = zk_final_price;
        }
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public long getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "HomeDifferentThemeThing{" +
                "success=" + success +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

}
