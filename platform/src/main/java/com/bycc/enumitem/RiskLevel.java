package com.bycc.enumitem;

import org.smartframework.platform.dictionary.bean.entry.EnumEntry;

/**
 * 风险等级
 */
public enum RiskLevel implements EnumEntry {
    HIGH("高"),
    MEDIUM("中"),
    LOW("低");

    private String value;

    RiskLevel(String param) {
        this.value = param;
    }

    @Override
    public String key() {
        return this.name();
    }

    @Override
    public String value() {
        return value;
    }

    /**
     * 按name查找枚举
     */
    public static RiskLevel getMatchByKey(String key) {
        for (RiskLevel e : RiskLevel.values()) {
            if (e.key().equalsIgnoreCase(key)) {
                return e;
            }
        }
        return null;
    }


    /**
     * 按value查找枚举
     */
    public static RiskLevel getMatchByValue(String value) {
        for (RiskLevel e : RiskLevel.values()) {
            if (e.value().equalsIgnoreCase(value)) {
                return e;
            }
        }
        return null;
    }

    /**
     * 按ordinal查找枚举
     */
    public static RiskLevel getMatchByOrdinal(Integer ordinal) {
        for (RiskLevel e : RiskLevel.values()) {
            if (e.ordinal() == ordinal) {
                return e;
            }
        }
        return null;
    }
}