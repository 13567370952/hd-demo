package com.hongdu.demo.comm;


public class Constants {
    public interface ResultCode {
        int OK = 0;
        int ERROR = 1;
        int EXCEPTION = -1;
        int NOT_LOGIN = 2;
        int NOT_CERTIFICATION = 3;
    }
    public interface CertificationType{
    	int CERTIFICATION_NOT_CERTIFIED=0;
    	int CERTIFICATION_VERIFY_PENDING=1;
    	int CERTIFICATION_VERIFYING=2;
    	int CERTIFICATION_VERIFY_FAILED=-1;
    	int CERTIFICATION_VERIFY_SUCCESS=3;
    }
    public interface ResType {
        int RES_TYPE_OTHER = 10;
        int RES_TYPE_IMAGE = 101;
        int RES_TYPE_QRCODE = 102;
        int RES_TYPE_EXCEL = 103;
    }
    public interface ImageType {
        int IMAGE_TYPE_TS = 0;
        int IMAGE_TYPE_GOODS = 1;
        int IMAGE_TYPE_CUSTOMS = 2;
    }
    public interface MessageState {
        int MESSAGE_STATE_UNREAD=0;
        int MESSAGE_STATE_READED=1;
    }
    public interface DriverCollectionState {
        int DRIVERCOLLECTION_STATE_COLLECT=0;
        int DRIVERCOLLECTION_STATE_BACKLIST=1;
    }
    public interface MessageType {
        String SHIPPER_MESSAGE_TYPE_GRAB_ORDER_SUCCESS = "01";
        String SHIPPER_MESSAGE_TYPE_ARRIVED_LOADADDRESS="02";
        String SHIPPER_MESSAGE_TYPE_GOODS_LOADED="03";
        String SHIPPER_MESSAGE_TYPE_GOODS_UNLOADED="04";
        String SHIPPER_MESSAGE_TYPE_ORDER_COMPLETED="05";
        String SHIPPER_MESSAGE_TYPE_ORDER_CANCELLED="06";
        String SHIPPER_MESSAGE_TYPE_ORDER_SUSPENDED="07";
        String DRIVER_MESSAGE_TYPE_PUBLISH_ORDER="11";
        String DRIVER_MESSAGE_TYPE_GRAB_ORDER_SUCCESS="12";
        String DRIVER_MESSAGE_TYPE_UNLOAD_CONFIRMED="13";
        String DRIVER_MESSAGE_TYPE_ORDER_COMPLETED="14";
    }
    public interface RoleType {
        int ROLE_TYPE_SHIPPER = 0;
        int ROLE_TYPE_DRIVER = 1;
        int ROLE_TYPE_CONSIGNOR = 2;
        int ROLE_TYPE_CONSIGNEE = 3;
    }

    public interface OrderState {
    	int ORDER_STATE_SUSPEND = -4;
    	int ORDER_STATE_UNRESPONSE = -3;
    	int ORDER_STATE_CANCELLED = -2;
    	int ORDER_STATE_UNPUBLISHED = -1;
        int ORDER_STATE_GRABING = 0;
        int ORDER_STATE_WAITING = 1;
        int ORDER_STATE_LOADING = 2;
        int ORDER_STATE_TRANSPORTING= 3;
        int ORDER_STATE_CONFIRMING = 4;
        int ORDER_STATE_COMPLETED = 5;
    }
    public interface OrderType {
    	int ORDER_TYPE_NEW= -1;
    	int ORDER_TYPE_PUBLISHING= 0;
    	int ORDER_TYPE_GRABBED = 1;
    	int ORDER_TYPE_CANCELLED =2;
    	int ORDER_TYPE_NORESPONSE = 3;
    	int ORDER_TYPE_SUSPENDED = 4;
    	int ORDER_TYPE_CONFIRMING = 5;
    	int ORDER_TYPE_COMPLETED = 6;
    
    }
    public interface OrderlineState {
    	 int ORDERLINE_STATE_LOADING = 2;
         int ORDERLINE_STATE_TRANSPORTING= 3;
         int ORDERLINE_STATE_CONFIRMING = 4;
         int ORDERLINE_STATE_COMPLETED = 5;
    }
    public interface OrderCostState {
        int ORDER_STATE_PAYING = 0;
        int ORDER_STATE_PAYED = 1;
    }
    public interface GoodsState {
        int GOODS_STATE_CURRENT = 0;
        int GOODS_STATE_PAST = -1;
      
    }
    public interface VideoState {
        int VIDEO_STATE_VERIFYING = 1;
        int VIDEO_STATE_VERIFYED_SUCCESS = 2;
        int VIDEO_STATE_VERIFYED_FAILED = -1;
    }
    public interface ContactType {
        int CONTACT_TYPE_CONSIGNEE = 0;
        int CONTACT_TYPE_CONSIGNOR = 1;
        int CONTACT_TYPE_NOTIFIER =2;
    }
    public interface ContactState {
        int CONTACT_STATE_NORMAL = 0;
        int CONTACT_STATE_DELETED =1;
    }
    public interface ChargeCategoryType {
        int CATEGORY_TYPE_COSTOFBG = 0;
        int CATEGORY_TYPE_COSTOFHY = 1;
        int CATEGORY_TYPE_COSTOFMDG = 2;
    }
    public interface ChargeItemType {
        int ITEM_TYPE_ROUTEPRICING = 0;
        int ITEM_TYPE_SAILINGPRICING = 1;
        int ITEM_TYPE_PORTPRICING = 2;
        int ITEM_TYPE_STOREPRICING = 3;
    }
    public interface UnitType {
        int UNIT_TYPE_KG = 0;
        int UNIT_TYPE_M3 = 1;
        int UNIT_TYPE_BL = 2;
        int UNIT_TYPE_NO=3;
    }
    public interface ExpressState {
       String EXPRESS_STATE_WAITACCEPT="WAITACCEPT";
       String EXPRESS_STATE_ACCEPT="ACCEPT";
       String EXPRESS_STATE_UNACCEPT="UNACCEPT";
       String EXPRESS_STATE_CANCELLED="CANCELLED";
       String EXPRESS_STATE_GOT="GOT";
       String EXPRESS_STATE_SIGNSUCCESS="SIGNSUCCESS";
       String EXPRESS_STATE_SIGNFAILED="SIGNFAILED";
       String EXPRESS_STATE_NOGET="NOGET";
    }
    public interface BoxState {
        int BOX_STATE_UNCOMPLETED = 0;
        int BOX_STATE_COMPLETED = 1;
    }
}
