/**
 * @Copyright (c) http://www.iqianbang.com/ All rights reserved.
 * @Description: TODO
 * @date 2016年7月13日 下午4:25:59
 * @version V1.0
 */

package com.iqb.consumer.web.constant;

/**
 * @author <a href="zhuyaoming@aliyun.com">yeoman</a>
 */
public class WebConstant {
    public static final String SUCCESS = "success";// 成功
    public static final String ERROR = "error";// 失败
    public static final int STATUS_OK = 1;
    public static final int STATUS_NO = 2;

    /** 账单日相关 **/
    public class BillDateConstant {
        /** 固定账单日 **/
        public static final String BILLDATE_TYPE_STATIC = "1";
        /** 月对月固定日期 **/
        public static final String BILLDATE_TYPE_MONTHLY_STATIC = "2";
        /** 月对月月末 **/
        public static final String BILLDATE_TYPE_MONTHLY_END = "3";
        /** 月对月前一日固定日期 **/
        public static final String BILLDATE_TYPE_MONTHLY_STATIC_PRE_DAY = "4";
        /** 月对月前一日月末 **/
        public static final String BILLDATE_TYPE_MONTHLY_END_PRE_DAY = "5";
    }
    /** 锁定日期相关 */
    public class LockRepayDateConstant {
        public static final String LOCKREPAYDATE_TYPE_MONTH = "1";
        public static final String LOCKREPAYDATE_TYPE_DAY = "2";
    }
    /** 违约金相关常量 **/
    public class BreachContractConstant {
        /** 启用上下限控制 **/
        public static final String MAX_MIN_AMT_ENABLE = "1";
        /** 剩余本金比例 **/
        public static final String BASE_AMT_TYPE_REMAIN_AMT = "1";
        /** 合同金额比例 **/
        public static final String BASE_AMT_TYPE_CONTRACT_AMT = "2";
        /** 还款额比例 **/
        public static final String BASE_AMT_TYPE_REPAYMENT_AMT = "3";

    }
    /** 逾期相关 **/
    public class OverdueConstant {
        /** 逾期计算方式 1.非复利 **/
        public static final String OVERDUE_METHOD_UNCOMPOUND = "1";
        /** 逾期计算方式 2.复利 **/
        public static final String OVERDUE_METHOD_COMPOUND = "2";
    }
    /** redis相关 **/
    public class RedisLockConstant {
        /** 逾期redis锁 **/
        public static final String BIZ_SCHEDULER_OVERDUE_LOCK_KEY = "lock_biz_scheduler_overdue";
        /** 逾期redis锁 1.逾期调度进行中 **/
        public static final String BIZ_SCHEDULER_OVERDUE_LOCK = "1";
        /** 逾期redis锁 2.逾期调度非进行中 **/
        public static final String BIZ_SCHEDULER_OVERDUE_UNLOCK = "0";
        /** 逾期redis锁时间为7200 **/
        public static final String BIZ_SCHEDULER_OVERDUE_LOCK_TIME = "7200";
    }

}
