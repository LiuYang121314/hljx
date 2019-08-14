package com.kingdee.hljx.control;

import com.kingdee.hljx.config.DataSourceContextHodler;
import com.kingdee.hljx.entity.ext.TBOS200000001;
import com.kingdee.hljx.entity.ext.TBOS200000001Entry2;
import com.kingdee.hljx.entity.ext.TBOS200000007;
import com.kingdee.hljx.entity.ext.TItem3001;
import com.kingdee.hljx.entity.item.TICItem;
import com.kingdee.hljx.entity.item.TWorkCenter;
import com.kingdee.hljx.repository.item.TWorkCenterRepository;
import com.kingdee.hljx.service.BOSService;
import com.kingdee.hljx.service.TItemService;
import com.kingdee.hljx.util.ReturnJsonData;
import org.hibernate.Session;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


@Controller
@RequestMapping("/tbos")
public class BOSController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private BOSService bosService;
    @Resource
    private TItemService itemService;

    @ResponseBody
    @RequestMapping("/saveWeight")
    public String saveWeight(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        int fBase = Integer.parseInt(request.getParameter("fBase"));
        int fBase4 = Integer.parseInt(request.getParameter("fBase4"));
        int fBase6 = Integer.parseInt(request.getParameter("fBase6"));
        int fBase7 = Integer.parseInt(request.getParameter("fBase7"));
        int fBase8 = Integer.parseInt(request.getParameter("fBase8"));
        int fBase9 = Integer.parseInt(request.getParameter("fBase9"));
        BigDecimal fDecimal = BigDecimal.valueOf(Double.parseDouble(request.getParameter("fDecimal")));
        BigDecimal fDecimal1 = BigDecimal.valueOf(Double.parseDouble(request.getParameter("fDecimal1")));
        BigDecimal fDecimal2 = BigDecimal.valueOf(Double.parseDouble(request.getParameter("fDecimal2")));
        BigDecimal fQty1 = BigDecimal.valueOf(Double.parseDouble(request.getParameter("fQty1")));
        int fBiller = Integer.parseInt(request.getParameter("fBiller"));
        TBOS200000001 tbos = new TBOS200000001();
        Date d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        tbos.setfTime(d);//时间
        tbos.setfDate(d);//日期
        tbos.setfBase(fBase);//物料
//        TICItem icitem = itemService.getICItemByFItemID(fBase);
//        if (icitem != null) {
//            tbos.setfBase1(icitem.getFMaund());//重量单位);
//            tbos.setFBase2(icitem.getFSecUnit().getFItemID());//辅单位
//        }

        tbos.setfBase4(fBase4);//班组
        TItem3001 item3001 = itemService.getTItem3001ByFItemID(fBase4);
        TWorkCenter workCenter = itemService.getTWorkCenterByFItemID(item3001.getF103());
        tbos.setfBase3(workCenter.getFItemID());//工序
        tbos.setfBase6(fBase6);//包装方式
        tbos.setfBase7(fBase7);//过磅类型
        tbos.setfBatchNo(tbos.getfBillNo());//批号/过磅单号
        tbos.setfBase8(fBase8);//入库仓库
        tbos.setfBase9(fBase9);//入库仓位
        tbos.setfBiller(fBiller);//制单人
//        if(balance!=null){//电子秤
//            tbos200000001.setFBase5(balance.getFid());
//        }

        //保存单据体
        TBOS200000001Entry2 tbosEntity = new TBOS200000001Entry2();
        tbosEntity.setFDecimal(fDecimal);//称重
//        fDecimal1=fDecimal.subtract(//累计重量).subtract(//托盘重);
        tbosEntity.setFDecimal1(fDecimal1);//净重
        tbosEntity.setFDecimal2(fDecimal2); //托盘重
//        //累计
//        sumScalageQty=scalageQty;
        tbosEntity.setFDecimal3(tbosEntity.getFDecimal1());
        //去包装物重
//        tbosEntity.setFDecimal3(//净重.multiply(new BigDecimal(1-
//                tBOS200000007Entry2Facade.findByKey(TBOS200000007Entry2_.fid,String.valueOf(//包装方式.getFid()))
//                        .getFDecimal().floatValue()/100)));
        //件数
        tbosEntity.setFDecimal4(fQty1);
//        //行号
//        entry.setFIndex(index+1);

        if (bosService.saveTBOS200000001(tbos, tbosEntity) > 0) {
            return ReturnJsonData.formatJson(true, "保存入库过磅单成功");
        } else {
            return ReturnJsonData.formatJson(false, "保存入库过磅单失败");
        }
    }

    @ResponseBody
    @RequestMapping("/getOne")
    public TBOS200000001 getOne() {
        TBOS200000001 t = bosService.findOne();
        logger.info("{}", t);
        return t;
    }
}
