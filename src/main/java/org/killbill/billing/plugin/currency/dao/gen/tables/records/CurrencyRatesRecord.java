/*
 * This file is generated by jOOQ.
 */
package org.killbill.billing.plugin.currency.dao.gen.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.currency.dao.gen.tables.CurrencyRates;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CurrencyRatesRecord extends UpdatableRecordImpl<CurrencyRatesRecord> implements Record7<ULong, String, BigDecimal, Integer, LocalDateTime, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>killbill.currency_rates.record_id</code>.
     */
    public void setRecordId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>killbill.currency_rates.record_id</code>.
     */
    public ULong getRecordId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>killbill.currency_rates.target_currency</code>.
     */
    public void setTargetCurrency(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>killbill.currency_rates.target_currency</code>.
     */
    public String getTargetCurrency() {
        return (String) get(1);
    }

    /**
     * Setter for <code>killbill.currency_rates.rate</code>.
     */
    public void setRate(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>killbill.currency_rates.rate</code>.
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for
     * <code>killbill.currency_rates.currency_update_record_id</code>.
     */
    public void setCurrencyUpdateRecordId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>killbill.currency_rates.currency_update_record_id</code>.
     */
    public Integer getCurrencyUpdateRecordId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>killbill.currency_rates.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>killbill.currency_rates.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>killbill.currency_rates.updated_at</code>.
     */
    public void setUpdatedAt(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>killbill.currency_rates.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>killbill.currency_rates.kb_tenant_id</code>.
     */
    public void setKbTenantId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>killbill.currency_rates.kb_tenant_id</code>.
     */
    public String getKbTenantId() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<ULong, String, BigDecimal, Integer, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<ULong, String, BigDecimal, Integer, LocalDateTime, LocalDateTime, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return CurrencyRates.CURRENCY_RATES.RECORD_ID;
    }

    @Override
    public Field<String> field2() {
        return CurrencyRates.CURRENCY_RATES.TARGET_CURRENCY;
    }

    @Override
    public Field<BigDecimal> field3() {
        return CurrencyRates.CURRENCY_RATES.RATE;
    }

    @Override
    public Field<Integer> field4() {
        return CurrencyRates.CURRENCY_RATES.CURRENCY_UPDATE_RECORD_ID;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return CurrencyRates.CURRENCY_RATES.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return CurrencyRates.CURRENCY_RATES.UPDATED_AT;
    }

    @Override
    public Field<String> field7() {
        return CurrencyRates.CURRENCY_RATES.KB_TENANT_ID;
    }

    @Override
    public ULong component1() {
        return getRecordId();
    }

    @Override
    public String component2() {
        return getTargetCurrency();
    }

    @Override
    public BigDecimal component3() {
        return getRate();
    }

    @Override
    public Integer component4() {
        return getCurrencyUpdateRecordId();
    }

    @Override
    public LocalDateTime component5() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component6() {
        return getUpdatedAt();
    }

    @Override
    public String component7() {
        return getKbTenantId();
    }

    @Override
    public ULong value1() {
        return getRecordId();
    }

    @Override
    public String value2() {
        return getTargetCurrency();
    }

    @Override
    public BigDecimal value3() {
        return getRate();
    }

    @Override
    public Integer value4() {
        return getCurrencyUpdateRecordId();
    }

    @Override
    public LocalDateTime value5() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value6() {
        return getUpdatedAt();
    }

    @Override
    public String value7() {
        return getKbTenantId();
    }

    @Override
    public CurrencyRatesRecord value1(ULong value) {
        setRecordId(value);
        return this;
    }

    @Override
    public CurrencyRatesRecord value2(String value) {
        setTargetCurrency(value);
        return this;
    }

    @Override
    public CurrencyRatesRecord value3(BigDecimal value) {
        setRate(value);
        return this;
    }

    @Override
    public CurrencyRatesRecord value4(Integer value) {
        setCurrencyUpdateRecordId(value);
        return this;
    }

    @Override
    public CurrencyRatesRecord value5(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public CurrencyRatesRecord value6(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public CurrencyRatesRecord value7(String value) {
        setKbTenantId(value);
        return this;
    }

    @Override
    public CurrencyRatesRecord values(ULong value1, String value2, BigDecimal value3, Integer value4, LocalDateTime value5, LocalDateTime value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CurrencyRatesRecord
     */
    public CurrencyRatesRecord() {
        super(CurrencyRates.CURRENCY_RATES);
    }

    /**
     * Create a detached, initialised CurrencyRatesRecord
     */
    public CurrencyRatesRecord(ULong recordId, String targetCurrency, BigDecimal rate, Integer currencyUpdateRecordId, LocalDateTime createdAt, LocalDateTime updatedAt, String kbTenantId) {
        super(CurrencyRates.CURRENCY_RATES);

        setRecordId(recordId);
        setTargetCurrency(targetCurrency);
        setRate(rate);
        setCurrencyUpdateRecordId(currencyUpdateRecordId);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
        setKbTenantId(kbTenantId);
    }
}