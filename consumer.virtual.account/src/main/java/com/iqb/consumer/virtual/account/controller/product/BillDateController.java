package com.iqb.consumer.virtual.account.controller.product;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.iqb.consumer.common.constant.AccountConstant;
import com.iqb.consumer.common.exception.BizException;
import com.iqb.consumer.common.utils.sign.DecryptUtils;
import com.iqb.consumer.service.product.IBillDateService;

/**
 * 
 * Description: 最后还款日
 * 
 * @author wangxinbang
 * @version 1.0
 * 
 * <pre>
 * Modification History: 
 * Date         Author      Version     Description 
------------------------------------------------------------------
 * 2016年11月17日    wangxinbang       1.0        1.0 Version 
 * </pre>
 */
@RestController
@RequestMapping("/product/billDate")
public class BillDateController {

    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(BillDateController.class);

    @Resource
    private IBillDateService billDateService;

    @Resource
    private DecryptUtils decryptUtils;

    /**
     * 
     * Description: 账单日删除
     * 
     * @param
     * @return Object
     * @throws
     * @Author wangxinbang Create Date: 2016年11月17日 上午11:10:15
     */
    @ResponseBody
    @RequestMapping(value = "/deleteById", method = {RequestMethod.GET, RequestMethod.POST})
    public Object deleteById(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> result = new HashMap<String, Object>();
        JSONObject params = JSONObject.parseObject(decryptUtils.DecryptFromRequest(request));// 解析信息
        logger.info("账单日计划删除:" + JSONObject.toJSONString(params));
        try {
            billDateService.deleteById(params);
            result.put("retCode", AccountConstant.SUCCESS);
            result.put("retMsg", "账单日计划删除成功");
        } catch (BizException e) {
            logger.error("账单日计划删除异常", e);
            result.put("retCode", AccountConstant.ERROR);
            result.put("retMsg", "账单日计划删除异常->" + e.getMsg());
        } catch (Exception e) {
            logger.error("账单日计划删除异常", e);
            result.put("retCode", AccountConstant.ERROR);
            result.put("retMsg", "账单日计划删除异常->" + e);
        }
        return result;
    }

    /**
     * 
     * Description: 账单日计划更新
     * 
     * @param
     * @return Object
     * @throws
     * @Author wangxinbang Create Date: 2016年11月17日 上午11:12:51
     */
    @ResponseBody
    @RequestMapping(value = "/updateById", method = {RequestMethod.GET, RequestMethod.POST})
    public Object updateById(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> result = new HashMap<String, Object>();
        JSONObject params = JSONObject.parseObject(decryptUtils.DecryptFromRequest(request));// 解析信息
        logger.info("账单日计划更新:" + JSONObject.toJSONString(params));
        try {
            billDateService.updateById(params);
            result.put("retCode", AccountConstant.SUCCESS);
            result.put("retMsg", "账单日计划更新成功");
        } catch (BizException e) {
            logger.error("账单日计划更新异常", e);
            result.put("retCode", AccountConstant.ERROR);
            result.put("retMsg", "账单日计划更新异常->" + e.getMsg());
        } catch (Exception e) {
            logger.error("账单日计划更新异常", e);
            result.put("retCode", AccountConstant.ERROR);
            result.put("retMsg", "账单日计划更新异常->" + e);
        }
        return result;
    }

    /**
     * 
     * Description: 新增
     * 
     * @param
     * @return Object
     * @throws
     * @Author wangxinbang Create Date: 2016年11月17日 上午11:13:53
     */
    @ResponseBody
    @RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
    public Object insert(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> result = new HashMap<String, Object>();
        JSONObject params = JSONObject.parseObject(decryptUtils.DecryptFromRequest(request));// 解析信息
        logger.info("账单日计划新增:" + JSONObject.toJSONString(params));
        try {
            billDateService.insert(params);
            result.put("retCode", AccountConstant.SUCCESS);
            result.put("retMsg", "账单日计划新增成功");
        } catch (BizException e) {
            logger.error("账单日计划新增异常", e);
            result.put("retCode", AccountConstant.ERROR);
            result.put("retMsg", "账单日计划新增异常->" + e.getMsg());
        } catch (Exception e) {
            logger.error("账单日计划新增异常", e);
            result.put("retCode", AccountConstant.ERROR);
            result.put("retMsg", "账单日计划新增异常->" + e);
        }
        return result;
    }

}
