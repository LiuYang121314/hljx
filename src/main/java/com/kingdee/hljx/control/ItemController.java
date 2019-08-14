package com.kingdee.hljx.control;

import com.kingdee.hljx.entity.ext.TBOS200000007;
import com.kingdee.hljx.entity.ext.TItem3001;
import com.kingdee.hljx.entity.item.TICItem;
import com.kingdee.hljx.service.BOSService;
import com.kingdee.hljx.service.TItemService;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/item")
public class ItemController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private TItemService itemService;
    @Resource
    private BOSService bosService;

    @RequestMapping(value = "/icitems")//,method = RequestMethod.POST
    public Map<String, Object> getAllICItem(String fNumber) {
        if (fNumber == null) {
            fNumber = "";
        }
        JSONObject jsonObject = new JSONObject();
        Map<String, Object> map = new HashMap<>();
        logger.info("参数fNumber：{}", fNumber);
        List<String> list = new ArrayList<>();
        List<Map<String, String>> listMap = new ArrayList<>();

        String query = "\"query\": \"" + fNumber + "\"";
        String sug = "\"suggestions\": ";

        List<JSONObject> jsonList = new ArrayList<>();
        for (TICItem icitem : itemService.getICItems(fNumber)) {
            Map<String, String> te = new HashMap<>();
            te.put("data", icitem.getfFullNumber());
            te.put("value", icitem.getfName() + "|" + icitem.getfModel() + "|" + icitem.getfItemID());
            listMap.add(te);
            jsonList.add(new JSONObject().put("data", icitem.getfFullNumber()).put("value", icitem.getfName() + "|" + icitem.getfModel() + "|" + icitem.getfItemID()));
        }
        String res = "{" + query + "," + sug + list + "}";
        map.put("query", fNumber);
        map.put("suggestions", listMap);
//        ---------------------------------------------------
        jsonObject.put("query", fNumber);
        jsonObject.put("suggestions", jsonList);
        logger.info(jsonObject.toString());
        return map;
    }
//
//    @RequestMapping("/emps")
//    public List<TEmp> getEmps(){
//        return itemService.getAllTEmp();
//    }

    @RequestMapping("/item3001")
    public List<TItem3001> getItem3001s() {

        return itemService.getTItem3001();
    }

    @RequestMapping("/packageType")
    public List<TBOS200000007> getPageageTypes() {
        return bosService.getPackageTypes();
    }

}
