package com.ytd.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="trade")
public class Trade implements Serializable{
	private static final long serialVersionUID = -4631440693728596254L;

	@Id
	private String serialNumber;

    /**
     *用户标识
     */
    private Integer userId;

    /**
     *报文标识
     */
    private String messageId;

    /**
     *请求报文
     */
    private String requestMessage;

    /**
     *响应报文
     */
    private String responseMessage;

    /**
     *请求交易账户
     */
    private String requestTradingAccount;

    /**
     *请求交易金额
     */
    private BigDecimal requestTradingAmount;

    /**
     *响应交易账号
     */
    private String responseTradingAccount;

    /**
     *响应交易金额
     */
    private BigDecimal responseTradingAmount;

    /**
     *交易状态
     */
    private String tradeStatus;

    /**
     *交易时间
     */
    private Date tradeDate;

    /**
     *标信息
     */
    private Integer loanid;

    /**
     *还款（借款标id）
     */
    private Integer loanPhaseId;

    /**
     *债券转让（投标id）
     */
    private Integer loanInvestorId;

    /**
     *请求id（取现借用：requestId = 1 ：银联通道，requestId = 2 ：人行通道）
     */
    private Integer requestId;

    /**
     *第三方响应流水号
     */
    private String trxId;

    /**
     *冻结资金流水号（支付生成）
     */
    private String freezeTrxid;

    /**
     *冻结资金流水
     */
    private String freezeOrdid;

    /**
     *解冻订单号（客户请求）
     */
    private String unfreezeOrdid;

    /**
     *债权转让成功订单号（用在还款中）
     */
    private String debtOrdId;

    /**
     *债权转让成功时间（用在还款中）
     */
    private Date debtOrdDate;

    /**
     *
     */
    private Integer version = 1;
    /**
     * 还款时资金处理状态(待处理'D',成功'S',失败'F')
     */
    private String repayStatus;
    /**
     * 还款资金处理状态
     * @return
     */
    public String getRepayStatus() {
		return repayStatus;
	}

	public void setRepayStatus(String repayStatus) {
		this.repayStatus = repayStatus;
	}

	/**
     * 投资渠道   wu
     */
    private String qd;
    
    /**
     * 投资渠道  wu
     * @return
     */
    public String getQd() {
		return qd;
	}

	public void setQd(String qd) {
		this.qd = qd;
	}

	/**
     *流水号
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     *流水号
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    /**
     *用户标识
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *用户标识
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     *报文标识
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     *报文标识
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    /**
     *请求报文
     */
    public String getRequestMessage() {
        return requestMessage;
    }

    /**
     *请求报文
     */
    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage == null ? null : requestMessage.trim();
    }

    /**
     *响应报文
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     *响应报文
     */
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage == null ? null : responseMessage.trim();
    }

    /**
     *请求交易账户
     */
    public String getRequestTradingAccount() {
        return requestTradingAccount;
    }

    /**
     *请求交易账户
     */
    public void setRequestTradingAccount(String requestTradingAccount) {
        this.requestTradingAccount = requestTradingAccount == null ? null : requestTradingAccount.trim();
    }

    /**
     *请求交易金额
     */
    public BigDecimal getRequestTradingAmount() {
        return requestTradingAmount;
    }

    /**
     *请求交易金额
     */
    public void setRequestTradingAmount(BigDecimal requestTradingAmount) {
        this.requestTradingAmount = requestTradingAmount;
    }

    /**
     *响应交易账号
     */
    public String getResponseTradingAccount() {
        return responseTradingAccount;
    }

    /**
     *响应交易账号
     */
    public void setResponseTradingAccount(String responseTradingAccount) {
        this.responseTradingAccount = responseTradingAccount == null ? null : responseTradingAccount.trim();
    }

    /**
     *响应交易金额 (提现时作为手续费-wfl)
     */
    public BigDecimal getResponseTradingAmount() {
        return responseTradingAmount;
    }

    /**
     *响应交易金额(提现时作为手续费-wfl)
     */
    public void setResponseTradingAmount(BigDecimal responseTradingAmount) {
        this.responseTradingAmount = responseTradingAmount;
    }

    /**
     *交易状态
     */
    public String getTradeStatus() {
        return tradeStatus;
    }

    /**
     *交易状态
     */
    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    /**
     *交易时间
     */
    public Date getTradeDate() {
        return tradeDate;
    }

    /**
     *交易时间
     */
    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    /**
     *标信息
     */
    public Integer getLoanid() {
        return loanid;
    }

    /**
     *标信息
     */
    public void setLoanid(Integer loanid) {
        this.loanid = loanid;
    }

    /**
     *还款（借款标id）
     */
    public Integer getLoanPhaseId() {
        return loanPhaseId;
    }

    /**
     *还款（借款标id）
     */
    public void setLoanPhaseId(Integer loanPhaseId) {
        this.loanPhaseId = loanPhaseId;
    }

    /**
     *债券转让（投标id）
     */
    public Integer getLoanInvestorId() {
        return loanInvestorId;
    }

    /**
     *债券转让（投标id）
     */
    public void setLoanInvestorId(Integer loanInvestorId) {
        this.loanInvestorId = loanInvestorId;
    }

    /**
     *请求id（取现借用：requestId = 1 ：银联通道，requestId = 2 ：人行通道）
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     *请求id（取现借用：requestId = 1 ：银联通道，requestId = 2 ：人行通道）
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     *第三方响应流水号
     */
    public String getTrxId() {
		return trxId;
	}

    /**
     *第三方响应流水号
     */
	public void setTrxId(String trxId) {
		this.trxId = trxId;
	}

    /**
     *冻结资金流水号（支付生成）
     */
    public String getFreezeTrxid() {
        return freezeTrxid;
    }

    /**
     *冻结资金流水号（支付生成）
     */
    public void setFreezeTrxid(String freezeTrxid) {
        this.freezeTrxid = freezeTrxid == null ? null : freezeTrxid.trim();
    }

    /**
     *冻结资金流水
     */
    public String getFreezeOrdid() {
        return freezeOrdid;
    }

    /**
     *冻结资金流水
     */
    public void setFreezeOrdid(String freezeOrdid) {
        this.freezeOrdid = freezeOrdid == null ? null : freezeOrdid.trim();
    }

    /**
     *解冻订单号（客户请求）
     */
    public String getUnfreezeOrdid() {
        return unfreezeOrdid;
    }

    /**
     *解冻订单号（客户请求）
     */
    public void setUnfreezeOrdid(String unfreezeOrdid) {
        this.unfreezeOrdid = unfreezeOrdid == null ? null : unfreezeOrdid.trim();
    }

    /**
     *债权转让成功订单号（用在还款中）
     */
    public String getDebtOrdId() {
        return debtOrdId;
    }

    /**
     *债权转让成功订单号（用在还款中）
     */
    public void setDebtOrdId(String debtOrdId) {
        this.debtOrdId = debtOrdId == null ? null : debtOrdId.trim();
    }

    /**
     *债权转让成功时间（用在还款中）
     */
    public Date getDebtOrdDate() {
        return debtOrdDate;
    }

    /**
     *债权转让成功时间（用在还款中）
     */
    public void setDebtOrdDate(Date debtOrdDate) {
        this.debtOrdDate = debtOrdDate;
    }

    /**
     *
     */
    public Integer getVersion() {
        return version;
    }

    /**
     *
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

}
