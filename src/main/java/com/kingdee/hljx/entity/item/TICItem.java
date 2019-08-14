/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.item;

import com.kingdee.hljx.entity.measure.TMeasureUnit;
import com.kingdee.hljx.entity.stock.TStock;
import com.kingdee.hljx.entity.stock.TStockPlace;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "t_ICItem")
//@DiscriminatorValue("4")
//@XmlRootElement
//@NamedQueries({
//        @NamedQuery(name = "TICItem.findAll", query = "SELECT t FROM TICItem t")
//        , @NamedQuery(name = "TICItem.findByFItemID", query = "SELECT t FROM TICItem t WHERE t.fItemID = :fItemID")
//        , @NamedQuery(name = "TICItem.findByFModel", query = "SELECT t FROM TICItem t WHERE t.fModel = :fModel")
//        , @NamedQuery(name = "TICItem.findByFName", query = "SELECT t FROM TICItem t WHERE t.fName = :fName")
//        , @NamedQuery(name = "TICItem.findByFHelpCode", query = "SELECT t FROM TICItem t WHERE t.fHelpCode = :fHelpCode")
//        , @NamedQuery(name = "TICItem.findByFDeleted", query = "SELECT t FROM TICItem t WHERE t.fDeleted = :fDeleted")
//        , @NamedQuery(name = "TICItem.findByFShortNumber", query = "SELECT t FROM TICItem t WHERE t.fShortNumber = :fShortNumber")
//        , @NamedQuery(name = "TICItem.findByFNumber", query = "SELECT t FROM TICItem t WHERE t.fNumber = :fNumber")
//        , @NamedQuery(name = "TICItem.findByFParentID", query = "SELECT t FROM TICItem t WHERE t.fParentID = :fParentID")
//        , @NamedQuery(name = "TICItem.findByFBrNo", query = "SELECT t FROM TICItem t WHERE t.fBrNo = :fBrNo")
//        , @NamedQuery(name = "TICItem.findByFTopID", query = "SELECT t FROM TICItem t WHERE t.fTopID = :fTopID")
//        , @NamedQuery(name = "TICItem.findByFrp", query = "SELECT t FROM TICItem t WHERE t.frp = :frp")
//        , @NamedQuery(name = "TICItem.findByFOmortize", query = "SELECT t FROM TICItem t WHERE t.fOmortize = :fOmortize")
//        , @NamedQuery(name = "TICItem.findByFOmortizeScale", query = "SELECT t FROM TICItem t WHERE t.fOmortizeScale = :fOmortizeScale")
//        , @NamedQuery(name = "TICItem.findByFForSale", query = "SELECT t FROM TICItem t WHERE t.fForSale = :fForSale")
//        , @NamedQuery(name = "TICItem.findByFStaCost", query = "SELECT t FROM TICItem t WHERE t.fStaCost = :fStaCost")
//        , @NamedQuery(name = "TICItem.findByFOrderPrice", query = "SELECT t FROM TICItem t WHERE t.fOrderPrice = :fOrderPrice")
//        , @NamedQuery(name = "TICItem.findByFOrderMethod", query = "SELECT t FROM TICItem t WHERE t.fOrderMethod = :fOrderMethod")
//        , @NamedQuery(name = "TICItem.findByFPriceFixingType", query = "SELECT t FROM TICItem t WHERE t.fPriceFixingType = :fPriceFixingType")
//        , @NamedQuery(name = "TICItem.findByFSalePriceFixingType", query = "SELECT t FROM TICItem t WHERE t.fSalePriceFixingType = :fSalePriceFixingType")
//        , @NamedQuery(name = "TICItem.findByFPerWastage", query = "SELECT t FROM TICItem t WHERE t.fPerWastage = :fPerWastage")
//        , @NamedQuery(name = "TICItem.findByFARAcctID", query = "SELECT t FROM TICItem t WHERE t.fARAcctID = :fARAcctID")
//        , @NamedQuery(name = "TICItem.findByFPlanPriceMethod", query = "SELECT t FROM TICItem t WHERE t.fPlanPriceMethod = :fPlanPriceMethod")
//        , @NamedQuery(name = "TICItem.findByFPlanClass", query = "SELECT t FROM TICItem t WHERE t.fPlanClass = :fPlanClass")
//        , @NamedQuery(name = "TICItem.findByFpy", query = "SELECT t FROM TICItem t WHERE t.fpy = :fpy")
//        , @NamedQuery(name = "TICItem.findByFPinYin", query = "SELECT t FROM TICItem t WHERE t.fPinYin = :fPinYin")
//        , @NamedQuery(name = "TICItem.findByFErpClsID", query = "SELECT t FROM TICItem t WHERE t.fErpClsID = :fErpClsID")
//        , @NamedQuery(name = "TICItem.findByFUnit", query = "SELECT t FROM TICItem t WHERE t.fUnit = :fUnit")
//        , @NamedQuery(name = "TICItem.findByFUnitGroupID", query = "SELECT t FROM TICItem t WHERE t.fUnitGroupID = :fUnitGroupID")
//        , @NamedQuery(name = "TICItem.findByFDefaultLoc", query = "SELECT t FROM TICItem t WHERE t.fDefaultLoc = :fDefaultLoc")
//        , @NamedQuery(name = "TICItem.findByFspid", query = "SELECT t FROM TICItem t WHERE t.fspid = :fspid")
//        , @NamedQuery(name = "TICItem.findByFSource", query = "SELECT t FROM TICItem t WHERE t.fSource = :fSource")
//        , @NamedQuery(name = "TICItem.findByFQtyDecimal", query = "SELECT t FROM TICItem t WHERE t.fQtyDecimal = :fQtyDecimal")
//        , @NamedQuery(name = "TICItem.findByFLowLimit", query = "SELECT t FROM TICItem t WHERE t.fLowLimit = :fLowLimit")
//        , @NamedQuery(name = "TICItem.findByFHighLimit", query = "SELECT t FROM TICItem t WHERE t.fHighLimit = :fHighLimit")
//        , @NamedQuery(name = "TICItem.findByFSecInv", query = "SELECT t FROM TICItem t WHERE t.fSecInv = :fSecInv")
//        , @NamedQuery(name = "TICItem.findByFUseState", query = "SELECT t FROM TICItem t WHERE t.fUseState = :fUseState")
//        , @NamedQuery(name = "TICItem.findByFIsEquipment", query = "SELECT t FROM TICItem t WHERE t.fIsEquipment = :fIsEquipment")
//        , @NamedQuery(name = "TICItem.findByFEquipmentNum", query = "SELECT t FROM TICItem t WHERE t.fEquipmentNum = :fEquipmentNum")
//        , @NamedQuery(name = "TICItem.findByFIsSparePart", query = "SELECT t FROM TICItem t WHERE t.fIsSparePart = :fIsSparePart")
//        , @NamedQuery(name = "TICItem.findByFFullName", query = "SELECT t FROM TICItem t WHERE t.fFullName = :fFullName")
//        , @NamedQuery(name = "TICItem.findByFSecUnit", query = "SELECT t FROM TICItem t WHERE t.fSecUnit = :fSecUnit")
//        , @NamedQuery(name = "TICItem.findByFSecCoefficient", query = "SELECT t FROM TICItem t WHERE t.fSecCoefficient = :fSecCoefficient")
//        , @NamedQuery(name = "TICItem.findByFSecUnitDecimal", query = "SELECT t FROM TICItem t WHERE t.fSecUnitDecimal = :fSecUnitDecimal")
//        , @NamedQuery(name = "TICItem.findByFAlias", query = "SELECT t FROM TICItem t WHERE t.fAlias = :fAlias")
//        , @NamedQuery(name = "TICItem.findByFOrderUnitID", query = "SELECT t FROM TICItem t WHERE t.fOrderUnit = :fOrderUnit")
//        , @NamedQuery(name = "TICItem.findByFSaleUnit", query = "SELECT t FROM TICItem t WHERE t.fSaleUnit = :fSaleUnit")
//        , @NamedQuery(name = "TICItem.findByFStoreUnit", query = "SELECT t FROM TICItem t WHERE t.fStoreUnit = :fStoreUnit")
//        , @NamedQuery(name = "TICItem.findByFProductUnit", query = "SELECT t FROM TICItem t WHERE t.fProductUnit = :fProductUnit")
//        , @NamedQuery(name = "TICItem.findByFApproveNo", query = "SELECT t FROM TICItem t WHERE t.fApproveNo = :fApproveNo")
//        , @NamedQuery(name = "TICItem.findByFAuxClassID", query = "SELECT t FROM TICItem t WHERE t.fAuxClassID = :fAuxClassID")
//        , @NamedQuery(name = "TICItem.findByFTypeID", query = "SELECT t FROM TICItem t WHERE t.fTypeID = :fTypeID")
//        , @NamedQuery(name = "TICItem.findByFPreDeadLine", query = "SELECT t FROM TICItem t WHERE t.fPreDeadLine = :fPreDeadLine")
//        , @NamedQuery(name = "TICItem.findByFSerialClassID", query = "SELECT t FROM TICItem t WHERE t.fSerialClassID = :fSerialClassID")
//        , @NamedQuery(name = "TICItem.findByFDefaultReadyLoc", query = "SELECT t FROM TICItem t WHERE t.fDefaultReadyLoc = :fDefaultReadyLoc")
//        , @NamedQuery(name = "TICItem.findByFSPIDReady", query = "SELECT t FROM TICItem t WHERE t.fSPIDReady = :fSPIDReady")
//        , @NamedQuery(name = "TICItem.findByFDSManagerID", query = "SELECT t FROM TICItem t WHERE t.fDSManagerID = :fDSManagerID")
//        , @NamedQuery(name = "TICItem.findByFForbbitBarcodeEdit", query = "SELECT t FROM TICItem t WHERE t.fForbbitBarcodeEdit = :fForbbitBarcodeEdit")
//        , @NamedQuery(name = "TICItem.findByFOrderRector", query = "SELECT t FROM TICItem t WHERE t.fOrderRector = :fOrderRector")
//        , @NamedQuery(name = "TICItem.findByFPOHghPrcMnyType", query = "SELECT t FROM TICItem t WHERE t.fPOHghPrcMnyType = :fPOHghPrcMnyType")
//        , @NamedQuery(name = "TICItem.findByFPOHighPrice", query = "SELECT t FROM TICItem t WHERE t.fPOHighPrice = :fPOHighPrice")
//        , @NamedQuery(name = "TICItem.findByFWWHghPrc", query = "SELECT t FROM TICItem t WHERE t.fWWHghPrc = :fWWHghPrc")
//        , @NamedQuery(name = "TICItem.findByFWWHghPrcMnyType", query = "SELECT t FROM TICItem t WHERE t.fWWHghPrcMnyType = :fWWHghPrcMnyType")
//        , @NamedQuery(name = "TICItem.findByFSOLowPrc", query = "SELECT t FROM TICItem t WHERE t.fSOLowPrc = :fSOLowPrc")
//        , @NamedQuery(name = "TICItem.findByFSOLowPrcMnyType", query = "SELECT t FROM TICItem t WHERE t.fSOLowPrcMnyType = :fSOLowPrcMnyType")
//        , @NamedQuery(name = "TICItem.findByFIsSale", query = "SELECT t FROM TICItem t WHERE t.fIsSale = :fIsSale")
//        , @NamedQuery(name = "TICItem.findByFProfitRate", query = "SELECT t FROM TICItem t WHERE t.fProfitRate = :fProfitRate")
//        , @NamedQuery(name = "TICItem.findByFSalePrice", query = "SELECT t FROM TICItem t WHERE t.fSalePrice = :fSalePrice")
//        , @NamedQuery(name = "TICItem.findByFBatchManager", query = "SELECT t FROM TICItem t WHERE t.fBatchManager = :fBatchManager")
//        , @NamedQuery(name = "TICItem.findByFISKFPeriod", query = "SELECT t FROM TICItem t WHERE t.fISKFPeriod = :fISKFPeriod")
//        , @NamedQuery(name = "TICItem.findByFKFPeriod", query = "SELECT t FROM TICItem t WHERE t.fKFPeriod = :fKFPeriod")
//        , @NamedQuery(name = "TICItem.findByFTrack", query = "SELECT t FROM TICItem t WHERE t.fTrack = :fTrack")
//        , @NamedQuery(name = "TICItem.findByFPlanPrice", query = "SELECT t FROM TICItem t WHERE t.fPlanPrice = :fPlanPrice")
//        , @NamedQuery(name = "TICItem.findByFPriceDecimal", query = "SELECT t FROM TICItem t WHERE t.fPriceDecimal = :fPriceDecimal")
//        , @NamedQuery(name = "TICItem.findByFAcctID", query = "SELECT t FROM TICItem t WHERE t.fAcctID = :fAcctID")
//        , @NamedQuery(name = "TICItem.findByFSaleAcctID", query = "SELECT t FROM TICItem t WHERE t.fSaleAcctID = :fSaleAcctID")
//        , @NamedQuery(name = "TICItem.findByFCostAcctID", query = "SELECT t FROM TICItem t WHERE t.fCostAcctID = :fCostAcctID")
//        , @NamedQuery(name = "TICItem.findByFAPAcctID", query = "SELECT t FROM TICItem t WHERE t.fAPAcctID = :fAPAcctID")
//        , @NamedQuery(name = "TICItem.findByFGoodSpec", query = "SELECT t FROM TICItem t WHERE t.fGoodSpec = :fGoodSpec")
//        , @NamedQuery(name = "TICItem.findByFCostProject", query = "SELECT t FROM TICItem t WHERE t.fCostProject = :fCostProject")
//        , @NamedQuery(name = "TICItem.findByFIsSnManage", query = "SELECT t FROM TICItem t WHERE t.fIsSnManage = :fIsSnManage")
//        , @NamedQuery(name = "TICItem.findByFStockTime", query = "SELECT t FROM TICItem t WHERE t.fStockTime = :fStockTime")
//        , @NamedQuery(name = "TICItem.findByFBookPlan", query = "SELECT t FROM TICItem t WHERE t.fBookPlan = :fBookPlan")
//        , @NamedQuery(name = "TICItem.findByFBeforeExpire", query = "SELECT t FROM TICItem t WHERE t.fBeforeExpire = :fBeforeExpire")
//        , @NamedQuery(name = "TICItem.findByFTaxRate", query = "SELECT t FROM TICItem t WHERE t.fTaxRate = :fTaxRate")
//        , @NamedQuery(name = "TICItem.findByFAdminAcctID", query = "SELECT t FROM TICItem t WHERE t.fAdminAcctID = :fAdminAcctID")
//        , @NamedQuery(name = "TICItem.findByFNote", query = "SELECT t FROM TICItem t WHERE t.fNote = :fNote")
//        , @NamedQuery(name = "TICItem.findByFIsSpecialTax", query = "SELECT t FROM TICItem t WHERE t.fIsSpecialTax = :fIsSpecialTax")
//        , @NamedQuery(name = "TICItem.findByFSOHighLimit", query = "SELECT t FROM TICItem t WHERE t.fSOHighLimit = :fSOHighLimit")
//        , @NamedQuery(name = "TICItem.findByFSOLowLimit", query = "SELECT t FROM TICItem t WHERE t.fSOLowLimit = :fSOLowLimit")
//        , @NamedQuery(name = "TICItem.findByFOIHighLimit", query = "SELECT t FROM TICItem t WHERE t.fOIHighLimit = :fOIHighLimit")
//        , @NamedQuery(name = "TICItem.findByFOILowLimit", query = "SELECT t FROM TICItem t WHERE t.fOILowLimit = :fOILowLimit")
//        , @NamedQuery(name = "TICItem.findByFDaysPer", query = "SELECT t FROM TICItem t WHERE t.fDaysPer = :fDaysPer")
//        , @NamedQuery(name = "TICItem.findByFLastCheckDate", query = "SELECT t FROM TICItem t WHERE t.fLastCheckDate = :fLastCheckDate")
//        , @NamedQuery(name = "TICItem.findByFCheckCycle", query = "SELECT t FROM TICItem t WHERE t.fCheckCycle = :fCheckCycle")
//        , @NamedQuery(name = "TICItem.findByFCheckCycUnit", query = "SELECT t FROM TICItem t WHERE t.fCheckCycUnit = :fCheckCycUnit")
//        , @NamedQuery(name = "TICItem.findByFStockPrice", query = "SELECT t FROM TICItem t WHERE t.fStockPrice = :fStockPrice")
//        , @NamedQuery(name = "TICItem.findByFABCCls", query = "SELECT t FROM TICItem t WHERE t.fABCCls = :fABCCls")
//        , @NamedQuery(name = "TICItem.findByFBatchQty", query = "SELECT t FROM TICItem t WHERE t.fBatchQty = :fBatchQty")
//        , @NamedQuery(name = "TICItem.findByFClass", query = "SELECT t FROM TICItem t WHERE t.fClass = :fClass")
//        , @NamedQuery(name = "TICItem.findByFCostDiffRate", query = "SELECT t FROM TICItem t WHERE t.fCostDiffRate = :fCostDiffRate")
//        , @NamedQuery(name = "TICItem.findByFDepartment", query = "SELECT t FROM TICItem t WHERE t.fDepartment = :fDepartment")
//        , @NamedQuery(name = "TICItem.findByFSaleTaxAcctID", query = "SELECT t FROM TICItem t WHERE t.fSaleTaxAcctID = :fSaleTaxAcctID")
//        , @NamedQuery(name = "TICItem.findByFCBBmStandardID", query = "SELECT t FROM TICItem t WHERE t.fCBBmStandardID = :fCBBmStandardID")
//        , @NamedQuery(name = "TICItem.findByFCBRestore", query = "SELECT t FROM TICItem t WHERE t.fCBRestore = :fCBRestore")
//        , @NamedQuery(name = "TICItem.findByFPickHighLimit", query = "SELECT t FROM TICItem t WHERE t.fPickHighLimit = :fPickHighLimit")
//        , @NamedQuery(name = "TICItem.findByFPickLowLimit", query = "SELECT t FROM TICItem t WHERE t.fPickLowLimit = :fPickLowLimit")
//        , @NamedQuery(name = "TICItem.findByFOnlineShopPName", query = "SELECT t FROM TICItem t WHERE t.fOnlineShopPName = :fOnlineShopPName")
//        , @NamedQuery(name = "TICItem.findByFOnlineShopPNo", query = "SELECT t FROM TICItem t WHERE t.fOnlineShopPNo = :fOnlineShopPNo")
//        , @NamedQuery(name = "TICItem.findByFUnitPackageNumber", query = "SELECT t FROM TICItem t WHERE t.fUnitPackageNumber = :fUnitPackageNumber")
//        , @NamedQuery(name = "TICItem.findByFOrderDept", query = "SELECT t FROM TICItem t WHERE t.fOrderDept = :fOrderDept")
//        , @NamedQuery(name = "TICItem.findByFPlanTrategy", query = "SELECT t FROM TICItem t WHERE t.fPlanTrategy = :fPlanTrategy")
//        , @NamedQuery(name = "TICItem.findByFOrderTrategy", query = "SELECT t FROM TICItem t WHERE t.fOrderTrategy = :fOrderTrategy")
//        , @NamedQuery(name = "TICItem.findByFLeadTime", query = "SELECT t FROM TICItem t WHERE t.fLeadTime = :fLeadTime")
//        , @NamedQuery(name = "TICItem.findByFFixLeadTime", query = "SELECT t FROM TICItem t WHERE t.fFixLeadTime = :fFixLeadTime")
//        , @NamedQuery(name = "TICItem.findByFTotalTQQ", query = "SELECT t FROM TICItem t WHERE t.fTotalTQQ = :fTotalTQQ")
//        , @NamedQuery(name = "TICItem.findByFQtyMin", query = "SELECT t FROM TICItem t WHERE t.fQtyMin = :fQtyMin")
//        , @NamedQuery(name = "TICItem.findByFQtyMax", query = "SELECT t FROM TICItem t WHERE t.fQtyMax = :fQtyMax")
//        , @NamedQuery(name = "TICItem.findByFCUUnitID", query = "SELECT t FROM TICItem t WHERE t.fCUUnitID = :fCUUnitID")
//        , @NamedQuery(name = "TICItem.findByFOrderInterVal", query = "SELECT t FROM TICItem t WHERE t.fOrderInterVal = :fOrderInterVal")
//        , @NamedQuery(name = "TICItem.findByFBatchAppendQty", query = "SELECT t FROM TICItem t WHERE t.fBatchAppendQty = :fBatchAppendQty")
//        , @NamedQuery(name = "TICItem.findByFOrderPoint", query = "SELECT t FROM TICItem t WHERE t.fOrderPoint = :fOrderPoint")
//        , @NamedQuery(name = "TICItem.findByFBatFixEconomy", query = "SELECT t FROM TICItem t WHERE t.fBatFixEconomy = :fBatFixEconomy")
//        , @NamedQuery(name = "TICItem.findByFBatChangeEconomy", query = "SELECT t FROM TICItem t WHERE t.fBatChangeEconomy = :fBatChangeEconomy")
//        , @NamedQuery(name = "TICItem.findByFRequirePoint", query = "SELECT t FROM TICItem t WHERE t.fRequirePoint = :fRequirePoint")
//        , @NamedQuery(name = "TICItem.findByFPlanPoint", query = "SELECT t FROM TICItem t WHERE t.fPlanPoint = :fPlanPoint")
//        , @NamedQuery(name = "TICItem.findByFDefaultRoutingID", query = "SELECT t FROM TICItem t WHERE t.fDefaultRoutingID = :fDefaultRoutingID")
//        , @NamedQuery(name = "TICItem.findByFDefaultWorkTypeID", query = "SELECT t FROM TICItem t WHERE t.fDefaultWorkTypeID = :fDefaultWorkTypeID")
//        , @NamedQuery(name = "TICItem.findByFProductPrincipal", query = "SELECT t FROM TICItem t WHERE t.fProductPrincipal = :fProductPrincipal")
//        , @NamedQuery(name = "TICItem.findByFDailyConsume", query = "SELECT t FROM TICItem t WHERE t.fDailyConsume = :fDailyConsume")
//        , @NamedQuery(name = "TICItem.findByFMRPCon", query = "SELECT t FROM TICItem t WHERE t.fMRPCon = :fMRPCon")
//        , @NamedQuery(name = "TICItem.findByFPlanner", query = "SELECT t FROM TICItem t WHERE t.fPlanner = :fPlanner")
//        , @NamedQuery(name = "TICItem.findByFPutInteger", query = "SELECT t FROM TICItem t WHERE t.fPutInteger = :fPutInteger")
//        , @NamedQuery(name = "TICItem.findByFInHighLimit", query = "SELECT t FROM TICItem t WHERE t.fInHighLimit = :fInHighLimit")
//        , @NamedQuery(name = "TICItem.findByFInLowLimit", query = "SELECT t FROM TICItem t WHERE t.fInLowLimit = :fInLowLimit")
//        , @NamedQuery(name = "TICItem.findByFLowestBomCode", query = "SELECT t FROM TICItem t WHERE t.fLowestBomCode = :fLowestBomCode")
//        , @NamedQuery(name = "TICItem.findByFMRPOrder", query = "SELECT t FROM TICItem t WHERE t.fMRPOrder = :fMRPOrder")
//        , @NamedQuery(name = "TICItem.findByFIsCharSourceItem", query = "SELECT t FROM TICItem t WHERE t.fIsCharSourceItem = :fIsCharSourceItem")
//        , @NamedQuery(name = "TICItem.findByFCharSourceItemID", query = "SELECT t FROM TICItem t WHERE t.fCharSourceItemID = :fCharSourceItemID")
//        , @NamedQuery(name = "TICItem.findByFPlanMode", query = "SELECT t FROM TICItem t WHERE t.fPlanMode = :fPlanMode")
//        , @NamedQuery(name = "TICItem.findByFCtrlType", query = "SELECT t FROM TICItem t WHERE t.fCtrlType = :fCtrlType")
//        , @NamedQuery(name = "TICItem.findByFCtrlStraregy", query = "SELECT t FROM TICItem t WHERE t.fCtrlStraregy = :fCtrlStraregy")
//        , @NamedQuery(name = "TICItem.findByFContainerName", query = "SELECT t FROM TICItem t WHERE t.fContainerName = :fContainerName")
//        , @NamedQuery(name = "TICItem.findByFKanBanCapability", query = "SELECT t FROM TICItem t WHERE t.fKanBanCapability = :fKanBanCapability")
//        , @NamedQuery(name = "TICItem.findByFIsBackFlush", query = "SELECT t FROM TICItem t WHERE t.fIsBackFlush = :fIsBackFlush")
//        , @NamedQuery(name = "TICItem.findByFBackFlushStockID", query = "SELECT t FROM TICItem t WHERE t.fBackFlushStockID = :fBackFlushStockID")
//        , @NamedQuery(name = "TICItem.findByFBackFlushSPID", query = "SELECT t FROM TICItem t WHERE t.fBackFlushSPID = :fBackFlushSPID")
//        , @NamedQuery(name = "TICItem.findByFBatchSplitDays", query = "SELECT t FROM TICItem t WHERE t.fBatchSplitDays = :fBatchSplitDays")
//        , @NamedQuery(name = "TICItem.findByFBatchSplit", query = "SELECT t FROM TICItem t WHERE t.fBatchSplit = :fBatchSplit")
//        , @NamedQuery(name = "TICItem.findByFIsFixedReOrder", query = "SELECT t FROM TICItem t WHERE t.fIsFixedReOrder = :fIsFixedReOrder")
//        , @NamedQuery(name = "TICItem.findByFAuxInMrpCal", query = "SELECT t FROM TICItem t WHERE t.fAuxInMrpCal = :fAuxInMrpCal")
//        , @NamedQuery(name = "TICItem.findByFProductDesigner", query = "SELECT t FROM TICItem t WHERE t.fProductDesigner = :fProductDesigner")
//        , @NamedQuery(name = "TICItem.findByFChartNumber", query = "SELECT t FROM TICItem t WHERE t.fChartNumber = :fChartNumber")
//        , @NamedQuery(name = "TICItem.findByFIsKeyItem", query = "SELECT t FROM TICItem t WHERE t.fIsKeyItem = :fIsKeyItem")
//        , @NamedQuery(name = "TICItem.findByFMaund", query = "SELECT t FROM TICItem t WHERE t.fMaund = :fMaund")
//        , @NamedQuery(name = "TICItem.findByFGrossWeight", query = "SELECT t FROM TICItem t WHERE t.fGrossWeight = :fGrossWeight")
//        , @NamedQuery(name = "TICItem.findByFNetWeight", query = "SELECT t FROM TICItem t WHERE t.fNetWeight = :fNetWeight")
//        , @NamedQuery(name = "TICItem.findByFCubicMeasure", query = "SELECT t FROM TICItem t WHERE t.fCubicMeasure = :fCubicMeasure")
//        , @NamedQuery(name = "TICItem.findByFLength", query = "SELECT t FROM TICItem t WHERE t.fLength = :fLength")
//        , @NamedQuery(name = "TICItem.findByFWidth", query = "SELECT t FROM TICItem t WHERE t.fWidth = :fWidth")
//        , @NamedQuery(name = "TICItem.findByFHeight", query = "SELECT t FROM TICItem t WHERE t.fHeight = :fHeight")
//        , @NamedQuery(name = "TICItem.findByFSize", query = "SELECT t FROM TICItem t WHERE t.fSize = :fSize")
//        , @NamedQuery(name = "TICItem.findByFVersion", query = "SELECT t FROM TICItem t WHERE t.fVersion = :fVersion")
//        , @NamedQuery(name = "TICItem.findByFStartService", query = "SELECT t FROM TICItem t WHERE t.fStartService = :fStartService")
//        , @NamedQuery(name = "TICItem.findByFMakeFile", query = "SELECT t FROM TICItem t WHERE t.fMakeFile = :fMakeFile")
//        , @NamedQuery(name = "TICItem.findByFIsFix", query = "SELECT t FROM TICItem t WHERE t.fIsFix = :fIsFix")
//        , @NamedQuery(name = "TICItem.findByFTtermOfService", query = "SELECT t FROM TICItem t WHERE t.fTtermOfService = :fTtermOfService")
//        , @NamedQuery(name = "TICItem.findByFTtermOfUsefulTime", query = "SELECT t FROM TICItem t WHERE t.fTtermOfUsefulTime = :fTtermOfUsefulTime")
//        , @NamedQuery(name = "TICItem.findByFStandardCost", query = "SELECT t FROM TICItem t WHERE t.fStandardCost = :fStandardCost")
//        , @NamedQuery(name = "TICItem.findByFStandardManHour", query = "SELECT t FROM TICItem t WHERE t.fStandardManHour = :fStandardManHour")
//        , @NamedQuery(name = "TICItem.findByFStdPayRate", query = "SELECT t FROM TICItem t WHERE t.fStdPayRate = :fStdPayRate")
//        , @NamedQuery(name = "TICItem.findByFChgFeeRate", query = "SELECT t FROM TICItem t WHERE t.fChgFeeRate = :fChgFeeRate")
//        , @NamedQuery(name = "TICItem.findByFStdFixFeeRate", query = "SELECT t FROM TICItem t WHERE t.fStdFixFeeRate = :fStdFixFeeRate")
//        , @NamedQuery(name = "TICItem.findByFOutMachFee", query = "SELECT t FROM TICItem t WHERE t.fOutMachFee = :fOutMachFee")
//        , @NamedQuery(name = "TICItem.findByFPieceRate", query = "SELECT t FROM TICItem t WHERE t.fPieceRate = :fPieceRate")
//        , @NamedQuery(name = "TICItem.findByFStdBatchQty", query = "SELECT t FROM TICItem t WHERE t.fStdBatchQty = :fStdBatchQty")
//        , @NamedQuery(name = "TICItem.findByFPOVAcctID", query = "SELECT t FROM TICItem t WHERE t.fPOVAcctID = :fPOVAcctID")
//        , @NamedQuery(name = "TICItem.findByFPIVAcctID", query = "SELECT t FROM TICItem t WHERE t.fPIVAcctID = :fPIVAcctID")
//        , @NamedQuery(name = "TICItem.findByFMCVAcctID", query = "SELECT t FROM TICItem t WHERE t.fMCVAcctID = :fMCVAcctID")
//        , @NamedQuery(name = "TICItem.findByFPCVAcctID", query = "SELECT t FROM TICItem t WHERE t.fPCVAcctID = :fPCVAcctID")
//        , @NamedQuery(name = "TICItem.findByFSLAcctID", query = "SELECT t FROM TICItem t WHERE t.fSLAcctID = :fSLAcctID")
//        , @NamedQuery(name = "TICItem.findByFCAVAcctID", query = "SELECT t FROM TICItem t WHERE t.fCAVAcctID = :fCAVAcctID")
//        , @NamedQuery(name = "TICItem.findByFCBAppendRate", query = "SELECT t FROM TICItem t WHERE t.fCBAppendRate = :fCBAppendRate")
//        , @NamedQuery(name = "TICItem.findByFCBAppendProject", query = "SELECT t FROM TICItem t WHERE t.fCBAppendProject = :fCBAppendProject")
//        , @NamedQuery(name = "TICItem.findByFCostBomID", query = "SELECT t FROM TICItem t WHERE t.fCostBomID = :fCostBomID")
//        , @NamedQuery(name = "TICItem.findByFCBRouting", query = "SELECT t FROM TICItem t WHERE t.fCBRouting = :fCBRouting")
//        , @NamedQuery(name = "TICItem.findByFOutMachFeeProject", query = "SELECT t FROM TICItem t WHERE t.fOutMachFeeProject = :fOutMachFeeProject")
//        , @NamedQuery(name = "TICItem.findByFInspectionLevel", query = "SELECT t FROM TICItem t WHERE t.fInspectionLevel = :fInspectionLevel")
//        , @NamedQuery(name = "TICItem.findByFInspectionProject", query = "SELECT t FROM TICItem t WHERE t.fInspectionProject = :fInspectionProject")
//        , @NamedQuery(name = "TICItem.findByFIsListControl", query = "SELECT t FROM TICItem t WHERE t.fIsListControl = :fIsListControl")
//        , @NamedQuery(name = "TICItem.findByFProChkMde", query = "SELECT t FROM TICItem t WHERE t.fProChkMde = :fProChkMde")
//        , @NamedQuery(name = "TICItem.findByFWWChkMde", query = "SELECT t FROM TICItem t WHERE t.fWWChkMde = :fWWChkMde")
//        , @NamedQuery(name = "TICItem.findByFSOChkMde", query = "SELECT t FROM TICItem t WHERE t.fSOChkMde = :fSOChkMde")
//        , @NamedQuery(name = "TICItem.findByFWthDrwChkMde", query = "SELECT t FROM TICItem t WHERE t.fWthDrwChkMde = :fWthDrwChkMde")
//        , @NamedQuery(name = "TICItem.findByFStkChkMde", query = "SELECT t FROM TICItem t WHERE t.fStkChkMde = :fStkChkMde")
//        , @NamedQuery(name = "TICItem.findByFOtherChkMde", query = "SELECT t FROM TICItem t WHERE t.fOtherChkMde = :fOtherChkMde")
//        , @NamedQuery(name = "TICItem.findByFStkChkPrd", query = "SELECT t FROM TICItem t WHERE t.fStkChkPrd = :fStkChkPrd")
//        , @NamedQuery(name = "TICItem.findByFStkChkAlrm", query = "SELECT t FROM TICItem t WHERE t.fStkChkAlrm = :fStkChkAlrm")
//        , @NamedQuery(name = "TICItem.findByFIdentifier", query = "SELECT t FROM TICItem t WHERE t.fIdentifier = :fIdentifier")
//        , @NamedQuery(name = "TICItem.findByFSampStdCritical", query = "SELECT t FROM TICItem t WHERE t.fSampStdCritical = :fSampStdCritical")
//        , @NamedQuery(name = "TICItem.findByFSampStdStrict", query = "SELECT t FROM TICItem t WHERE t.fSampStdStrict = :fSampStdStrict")
//        , @NamedQuery(name = "TICItem.findByFSampStdSlight", query = "SELECT t FROM TICItem t WHERE t.fSampStdSlight = :fSampStdSlight")
//        , @NamedQuery(name = "TICItem.findByFNameEn", query = "SELECT t FROM TICItem t WHERE t.fNameEn = :fNameEn")
//        , @NamedQuery(name = "TICItem.findByFModelEn", query = "SELECT t FROM TICItem t WHERE t.fModelEn = :fModelEn")
//        , @NamedQuery(name = "TICItem.findByFHSNumber", query = "SELECT t FROM TICItem t WHERE t.fHSNumber = :fHSNumber")
//        , @NamedQuery(name = "TICItem.findByFFirstUnit", query = "SELECT t FROM TICItem t WHERE t.fFirstUnit = :fFirstUnit")
//        , @NamedQuery(name = "TICItem.findByFSecondUnit", query = "SELECT t FROM TICItem t WHERE t.fSecondUnit = :fSecondUnit")
//        , @NamedQuery(name = "TICItem.findByFFirstUnitRate", query = "SELECT t FROM TICItem t WHERE t.fFirstUnitRate = :fFirstUnitRate")
//        , @NamedQuery(name = "TICItem.findByFSecondUnitRate", query = "SELECT t FROM TICItem t WHERE t.fSecondUnitRate = :fSecondUnitRate")
//        , @NamedQuery(name = "TICItem.findByFIsManage", query = "SELECT t FROM TICItem t WHERE t.fIsManage = :fIsManage")
//        , @NamedQuery(name = "TICItem.findByFPackType", query = "SELECT t FROM TICItem t WHERE t.fPackType = :fPackType")
//        , @NamedQuery(name = "TICItem.findByFLenDecimal", query = "SELECT t FROM TICItem t WHERE t.fLenDecimal = :fLenDecimal")
//        , @NamedQuery(name = "TICItem.findByFCubageDecimal", query = "SELECT t FROM TICItem t WHERE t.fCubageDecimal = :fCubageDecimal")
//        , @NamedQuery(name = "TICItem.findByFWeightDecimal", query = "SELECT t FROM TICItem t WHERE t.fWeightDecimal = :fWeightDecimal")
//        , @NamedQuery(name = "TICItem.findByFImpostTaxRate", query = "SELECT t FROM TICItem t WHERE t.fImpostTaxRate = :fImpostTaxRate")
//        , @NamedQuery(name = "TICItem.findByFConsumeTaxRate", query = "SELECT t FROM TICItem t WHERE t.fConsumeTaxRate = :fConsumeTaxRate")
//        , @NamedQuery(name = "TICItem.findByFManageType", query = "SELECT t FROM TICItem t WHERE t.fManageType = :fManageType")
//        , @NamedQuery(name = "TICItem.findByFExportRate", query = "SELECT t FROM TICItem t WHERE t.fExportRate = :fExportRate")
//        , @NamedQuery(name = "TICItem.findByFBarcode", query = "SELECT t FROM TICItem t WHERE t.fBarcode = :fBarcode")
//})
public class TICItem extends TItem /*implements Serializable*/ {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FItemID")
    private Integer fItemID;

    @Column(name = "FDeleted")
    private Short fDeleted;
    @Size(max = 80)
    @Column(name = "FShortNumber")
    private String fShortNumber;
    @Size(max = 80)
    @Column(name = "FNumber")
    private String fNumber;
    //    @Lob
    @Column(name = "FModifyTime")
    private byte[] fModifyTime;
    @Column(name = "FParentID")
    private Integer fParentID;
    @Size(max = 10)
    @Column(name = "FBrNo")
    private String fBrNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FName")
    private String fName;

    @Size(max = 255)
    @Column(name = "FModel")
    private String fModel;

    @Size(max = 50)
    @Column(name = "FHelpCode")
    private String fHelpCode;

    @Column(name = "FTopID")
    private Integer fTopID;
    @Column(name = "FRP")
    private Short frp;
    @Column(name = "FOmortize")
    private Short fOmortize;
    @Column(name = "FOmortizeScale")
    private Short fOmortizeScale;
    @Column(name = "FForSale")
    private Boolean fForSale;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FStaCost")
    private Double fStaCost;
    @Column(name = "FOrderPrice")
    private Double fOrderPrice;
    @Column(name = "FOrderMethod")
    private Integer fOrderMethod;
    @Column(name = "FPriceFixingType")
    private Integer fPriceFixingType;
    @Column(name = "FSalePriceFixingType")
    private Integer fSalePriceFixingType;
    @Column(name = "FPerWastage")
    private Double fPerWastage;
    @Column(name = "FARAcctID")
    private Integer fARAcctID;
    @Column(name = "FPlanPriceMethod")
    private Short fPlanPriceMethod;
    @Column(name = "FPlanClass")
    private Short fPlanClass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FPY")
    private String fpy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FPinYin")
    private String fPinYin;
    @Column(name = "FErpClsID")
    private Integer fErpClsID;
    @Column(name = "FUnitGroupID")
    private Integer fUnitGroupID;

    //    -----------------------------------------------------------------
    @JoinColumn(name = "FDefaultLoc", referencedColumnName = "FItemID")
    @ManyToOne
    private TStock fDefaultLoc;
    @JoinColumn(name = "FSPID", referencedColumnName = "FSPID")
    @ManyToOne
    private TStockPlace fspid;
    //    ------------------------------------------------------------------
    @Column(name = "FSource")
    private Integer fSource;
    @Column(name = "FQtyDecimal")
    private Short fQtyDecimal;
    @Column(name = "FLowLimit")
    private BigDecimal fLowLimit;
    @Column(name = "FHighLimit")
    private BigDecimal fHighLimit;
    @Column(name = "FSecInv")
    private BigDecimal fSecInv;
    @Column(name = "FUseState")
    private Integer fUseState;
    @Column(name = "FIsEquipment")
    private Boolean fIsEquipment;
    @Size(max = 80)
    @Column(name = "FEquipmentNum")
    private String fEquipmentNum;
    @Column(name = "FIsSparePart")
    private Boolean fIsSparePart;

    @Column(name = "FSecCoefficient")
    private BigDecimal fSecCoefficient;
    @Column(name = "FSecUnitDecimal")
    private Integer fSecUnitDecimal;
    @Size(max = 80)
    @Column(name = "FAlias")
    private String fAlias;
    @Size(max = 80)
    @Column(name = "FApproveNo")
    private String fApproveNo;
    @Column(name = "FAuxClassID")
    private Integer fAuxClassID;
    @Column(name = "FTypeID")
    private Integer fTypeID;
    @Column(name = "FPreDeadLine")
    private Integer fPreDeadLine;
    @Column(name = "FSerialClassID")
    private Integer fSerialClassID;
    @Column(name = "FDefaultReadyLoc")
    private Integer fDefaultReadyLoc;
    @Column(name = "FSPIDReady")
    private Integer fSPIDReady;
    @Column(name = "FDSManagerID")
    private Integer fDSManagerID;
    @Column(name = "FForbbitBarcodeEdit")
    private Boolean fForbbitBarcodeEdit;
    @Column(name = "FOrderRector")
    private Integer fOrderRector;
    @Column(name = "FPOHghPrcMnyType")
    private Integer fPOHghPrcMnyType;
    @Column(name = "FPOHighPrice")
    private BigDecimal fPOHighPrice;
    @Column(name = "FWWHghPrc")
    private BigDecimal fWWHghPrc;
    @Column(name = "FWWHghPrcMnyType")
    private Integer fWWHghPrcMnyType;
    @Column(name = "FSOLowPrc")
    private BigDecimal fSOLowPrc;
    @Column(name = "FSOLowPrcMnyType")
    private Integer fSOLowPrcMnyType;
    @Column(name = "FIsSale")
    private Boolean fIsSale;
    @Column(name = "FProfitRate")
    private BigDecimal fProfitRate;
    @Column(name = "FSalePrice")
    private BigDecimal fSalePrice;
    @Column(name = "FBatchManager")
    private Boolean fBatchManager;
    @Column(name = "FISKFPeriod")
    private Boolean fISKFPeriod;
    @Column(name = "FKFPeriod")
    private BigDecimal fKFPeriod;
    @Column(name = "FTrack")
    private Integer fTrack;
    @Column(name = "FPlanPrice")
    private BigDecimal fPlanPrice;
    @Column(name = "FPriceDecimal")
    private Short fPriceDecimal;
    @Column(name = "FAcctID")
    private Integer fAcctID;
    @Column(name = "FSaleAcctID")
    private Integer fSaleAcctID;
    @Column(name = "FCostAcctID")
    private Integer fCostAcctID;
    @Column(name = "FAPAcctID")
    private Integer fAPAcctID;
    @Column(name = "FGoodSpec")
    private Integer fGoodSpec;
    @Column(name = "FCostProject")
    private Integer fCostProject;
    @Column(name = "FIsSnManage")
    private Boolean fIsSnManage;
    @Column(name = "FStockTime")
    private Boolean fStockTime;
    @Column(name = "FBookPlan")
    private Boolean fBookPlan;
    @Column(name = "FBeforeExpire")
    private Integer fBeforeExpire;
    @Column(name = "FTaxRate")
    private BigDecimal fTaxRate;
    @Column(name = "FAdminAcctID")
    private Integer fAdminAcctID;
    @Size(max = 80)
    @Column(name = "FNote")
    private String fNote;
    @Column(name = "FIsSpecialTax")
    private Boolean fIsSpecialTax;
    @Column(name = "FSOHighLimit")
    private BigDecimal fSOHighLimit;
    @Column(name = "FSOLowLimit")
    private BigDecimal fSOLowLimit;
    @Column(name = "FOIHighLimit")
    private BigDecimal fOIHighLimit;
    @Column(name = "FOILowLimit")
    private BigDecimal fOILowLimit;
    @Column(name = "FDaysPer")
    private Integer fDaysPer;
    @Column(name = "FLastCheckDate")
//    @Temporal(TemporalType.DATE)
    private byte[] fLastCheckDate;
    @Column(name = "FCheckCycle")
    private Integer fCheckCycle;
    @Column(name = "FCheckCycUnit")
    private Integer fCheckCycUnit;
    @Column(name = "FStockPrice")
    private BigDecimal fStockPrice;
    @Column(name = "FABCCls")
    private Character fABCCls;
    @Column(name = "FBatchQty")
    private Double fBatchQty;
    @Column(name = "FClass")
    private Boolean fClass;
    @Column(name = "FCostDiffRate")
    private Double fCostDiffRate;


    @Column(name = "FDepartment")
    private Integer fDepartment;
    @Column(name = "FSaleTaxAcctID")
    private Integer fSaleTaxAcctID;
    @Column(name = "FCBBmStandardID")
    private Integer fCBBmStandardID;
    @Column(name = "FCBRestore")
    private Integer fCBRestore;
    @Column(name = "FPickHighLimit")
    private BigDecimal fPickHighLimit;
    @Column(name = "FPickLowLimit")
    private BigDecimal fPickLowLimit;
    @Size(max = 60)
    @Column(name = "FOnlineShopPName")
    private String fOnlineShopPName;
    @Size(max = 80)
    @Column(name = "FOnlineShopPNo")
    private String fOnlineShopPNo;
    @Column(name = "FUnitPackageNumber")
    private Integer fUnitPackageNumber;
    @Column(name = "FOrderDept")
    private Integer fOrderDept;
    @Column(name = "FPlanTrategy")
    private Integer fPlanTrategy;
    @Column(name = "FOrderTrategy")
    private Integer fOrderTrategy;
    @Column(name = "FLeadTime")
    private Float fLeadTime;
    @Column(name = "FFixLeadTime")
    private Float fFixLeadTime;
    @Column(name = "FTotalTQQ")
    private Integer fTotalTQQ;
    @Column(name = "FQtyMin")
    private BigDecimal fQtyMin;
    @Column(name = "FQtyMax")
    private BigDecimal fQtyMax;
    @Column(name = "FCUUnitID")
    private Integer fCUUnitID;
    @Column(name = "FOrderInterVal")
    private Integer fOrderInterVal;
    @Column(name = "FBatchAppendQty")
    private BigDecimal fBatchAppendQty;
    @Column(name = "FOrderPoint")
    private BigDecimal fOrderPoint;
    @Column(name = "FBatFixEconomy")
    private BigDecimal fBatFixEconomy;
    @Column(name = "FBatChangeEconomy")
    private BigDecimal fBatChangeEconomy;
    @Column(name = "FRequirePoint")
    private Integer fRequirePoint;
    @Column(name = "FPlanPoint")
    private Integer fPlanPoint;
    @Column(name = "FDefaultRoutingID")
    private Integer fDefaultRoutingID;
    @Column(name = "FDefaultWorkTypeID")
    private Integer fDefaultWorkTypeID;
    @Column(name = "FProductPrincipal")
    private Integer fProductPrincipal;
    @Column(name = "FDailyConsume")
    private BigDecimal fDailyConsume;
    @Column(name = "FMRPCon")
    private Boolean fMRPCon;
    @Column(name = "FPlanner")
    private Integer fPlanner;
    @Column(name = "FPutInteger")
    private Boolean fPutInteger;
    @Column(name = "FInHighLimit")
    private BigDecimal fInHighLimit;
    @Column(name = "FInLowLimit")
    private BigDecimal fInLowLimit;
    @Column(name = "FLowestBomCode")
    private Integer fLowestBomCode;
    @Column(name = "FMRPOrder")
    private Boolean fMRPOrder;
    @Column(name = "FIsCharSourceItem")
    private Integer fIsCharSourceItem;
    @Column(name = "FCharSourceItemID")
    private Integer fCharSourceItemID;
    @Column(name = "FPlanMode")
    private Integer fPlanMode;
    @Column(name = "FCtrlType")
    private Integer fCtrlType;
    @Column(name = "FCtrlStraregy")
    private Integer fCtrlStraregy;
    @Size(max = 50)
    @Column(name = "FContainerName")
    private String fContainerName;
    @Column(name = "FKanBanCapability")
    private Integer fKanBanCapability;
    @Column(name = "FIsBackFlush")
    private Integer fIsBackFlush;
    @Column(name = "FBackFlushStockID")
    private Integer fBackFlushStockID;
    @Column(name = "FBackFlushSPID")
    private Integer fBackFlushSPID;
    @Column(name = "FBatchSplitDays")
    private Integer fBatchSplitDays;
    @Column(name = "FBatchSplit")
    private BigDecimal fBatchSplit;

    //    -------------------------------------------
    @Column(name = "FIsFixedReOrder")
    private Boolean fIsFixedReOrder;
    @Column(name = "FAuxInMrpCal")
    private Boolean fAuxInMrpCal;
    @Column(name = "FProductDesigner")
    private Integer fProductDesigner;
    @Size(max = 255)
    @Column(name = "FChartNumber")
    private String fChartNumber;
    @Column(name = "FIsKeyItem")
    private Boolean fIsKeyItem;
    //    --------------------------------------------------------------------
    @JoinColumn(name = "FMaund", referencedColumnName = "FItemID")//
    @ManyToOne
    private TMeasureUnit fMaund;
    //    --------------------------------------------------------------------
    @Column(name = "FGrossWeight")
    private BigDecimal fGrossWeight;
    @Column(name = "FNetWeight")
    private BigDecimal fNetWeight;
    @Column(name = "FCubicMeasure")
    private Integer fCubicMeasure;
    @Column(name = "FLength")
    private BigDecimal fLength;
    @Column(name = "FWidth")
    private BigDecimal fWidth;
    @Column(name = "FHeight")
    private BigDecimal fHeight;
    @Column(name = "FSize")
    private BigDecimal fSize;
    @Size(max = 10)
    @Column(name = "FVersion")
    private String fVersion;


    @Column(name = "FStartService")
    private Boolean fStartService;
    @Column(name = "FMakeFile")
    private Boolean fMakeFile;
    @Column(name = "FIsFix")
    private Boolean fIsFix;
    @Column(name = "FTtermOfService")
    private Integer fTtermOfService;
    @Column(name = "FTtermOfUsefulTime")
    private Integer fTtermOfUsefulTime;
    @Column(name = "FStandardCost")
    private BigDecimal fStandardCost;
    @Column(name = "FStandardManHour")
    private BigDecimal fStandardManHour;
    @Column(name = "FStdPayRate")
    private BigDecimal fStdPayRate;
    @Column(name = "FChgFeeRate")
    private BigDecimal fChgFeeRate;
    @Column(name = "FStdFixFeeRate")
    private BigDecimal fStdFixFeeRate;
    @Column(name = "FOutMachFee")
    private BigDecimal fOutMachFee;
    @Column(name = "FPieceRate")
    private BigDecimal fPieceRate;
    @Column(name = "FStdBatchQty")
    private BigDecimal fStdBatchQty;
    @Column(name = "FPOVAcctID")
    private Integer fPOVAcctID;
    @Column(name = "FPIVAcctID")
    private Integer fPIVAcctID;
    @Column(name = "FMCVAcctID")
    private Integer fMCVAcctID;
    @Column(name = "FPCVAcctID")
    private Integer fPCVAcctID;
    @Column(name = "FSLAcctID")
    private Integer fSLAcctID;
    @Column(name = "FCAVAcctID")
    private Integer fCAVAcctID;
    @Column(name = "FCBAppendRate")
    private BigDecimal fCBAppendRate;
    @Column(name = "FCBAppendProject")
    private Integer fCBAppendProject;
    @Column(name = "FCostBomID")
    private Integer fCostBomID;
    @Column(name = "FCBRouting")
    private Integer fCBRouting;
    @Column(name = "FOutMachFeeProject")
    private Integer fOutMachFeeProject;
    @Column(name = "FInspectionLevel")
    private Integer fInspectionLevel;
    @Column(name = "FInspectionProject")
    private Integer fInspectionProject;
    @Column(name = "FIsListControl")
    private Integer fIsListControl;
    @Column(name = "FProChkMde")
    private Integer fProChkMde;
    @Column(name = "FWWChkMde")
    private Integer fWWChkMde;
    @Column(name = "FSOChkMde")
    private Integer fSOChkMde;
    @Column(name = "FWthDrwChkMde")
    private Integer fWthDrwChkMde;
    @Column(name = "FStkChkMde")
    private Integer fStkChkMde;
    @Column(name = "FOtherChkMde")
    private Integer fOtherChkMde;
    @Column(name = "FStkChkPrd")
    private Integer fStkChkPrd;
    @Column(name = "FStkChkAlrm")
    private Integer fStkChkAlrm;
    @Column(name = "FIdentifier")
    private Integer fIdentifier;
    @Size(max = 50)
    @Column(name = "FSampStdCritical")
    private String fSampStdCritical;
    @Size(max = 50)
    @Column(name = "FSampStdStrict")
    private String fSampStdStrict;
    @Size(max = 50)
    @Column(name = "FSampStdSlight")
    private String fSampStdSlight;
    @Size(max = 255)
    @Column(name = "FNameEn")
    private String fNameEn;
    @Size(max = 255)
    @Column(name = "FModelEn")
    private String fModelEn;
    @Column(name = "FHSNumber")
    private Integer fHSNumber;
    @Size(max = 255)
    @Column(name = "FFirstUnit")
    private String fFirstUnit;
    @Size(max = 255)
    @Column(name = "FSecondUnit")
    private String fSecondUnit;
    @Column(name = "FFirstUnitRate")
    private BigDecimal fFirstUnitRate;
    @Column(name = "FSecondUnitRate")
    private BigDecimal fSecondUnitRate;
    @Column(name = "FIsManage")
    private Boolean fIsManage;
    @Column(name = "FPackType")
    private Integer fPackType;
    @Column(name = "FLenDecimal")
    private Integer fLenDecimal;

    @Column(name = "FCubageDecimal")
    private Integer fCubageDecimal;
    @Column(name = "FWeightDecimal")
    private Integer fWeightDecimal;
    @Column(name = "FImpostTaxRate")
    private BigDecimal fImpostTaxRate;
    @Column(name = "FConsumeTaxRate")
    private BigDecimal fConsumeTaxRate;
    @Column(name = "FManageType")
    private Integer fManageType;
    @Column(name = "FExportRate")
    private BigDecimal fExportRate;
    @Size(max = 128)
    @Column(name = "FBarcode")
    private String fBarcode;

    @Override
    public String getfName() {
        return this.fName;
    }

    @Override
    public String getfNumber() {
        return this.fNumber;
    }

    @Override
    public Integer getfItemID() {
        return this.fItemID;
    }

    public String getfModel() {
        return fModel;
    }

    public void setfModel(String fModel) {
        this.fModel = fModel;
    }
}