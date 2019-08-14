package com.kingdee.hljx.control;

import com.kingdee.hljx.entity.stock.TStock;
import com.kingdee.hljx.entity.stock.TStockPlace;
import com.kingdee.hljx.service.StockService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Resource
    private StockService stockService;

    @RequestMapping("/getStocks")
    public List<String> getStocks() {
        List<String> list = new ArrayList<>();
        for (TStock stock : stockService.getAllStock()) {
            list.add("{\"fItemID\":" + stock.getfItemID() + ",\"fName\":\"" + stock.getfName() + "\",\"fspGroupID\":" + stock.getfSPGroupID().getfSPGroupID() + "}");
        }
        return list;
    }

    //    @RequestMapping("/getPlace")
//    public List<String> getPlaces(int groupID){
////        return stockService.getStockPlace(groupID);
//        List<String> list = new ArrayList<>();
//        for (TStockPlace place : stockService.getStockPlace(groupID)) {
//            list.add("{\"fspID\":"+place.getFspid()+",\"fName\":\""+place.getfName()+"\",\"fSPGroupID\":"+place.getfSPGroup().getfSPGroupID()+"}");
//        }
//        return list;
//    }
    @RequestMapping("/getPlace")
    public List<String> getPlaces(int stockID) {
//        return stockService.getStockPlace(groupID);
        List<String> list = new ArrayList<>();
        for (TStockPlace place : stockService.getStockPlace(stockID)) {
            list.add("{\"fspID\":" + place.getFspid() + ",\"fName\":\"" + place.getfName() + "\",\"fSPGroupID\":" + place.getfSPGroup().getfSPGroupID() + "}");
        }
        return list;
    }

}
