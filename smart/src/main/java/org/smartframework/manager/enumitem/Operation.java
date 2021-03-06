package org.smartframework.manager.enumitem;

import org.smartframework.platform.dictionary.bean.entry.EnumEntry;

public enum Operation implements EnumEntry {
    VIEW("查看"),
    EDIT("编辑"),
    DELETE("删除"),
    AUDIT("审核"),
    HANDLE("办理"),
    MARK("评价"),
    IMPORT("导入"),
    EXPORT("导出");

    private String value;
    private Operation(String value) {
        this.value = value;
    }

    public String key() {
        return this.name();
    }

    public String value() {
        return this.value;
    }

    /**
     * 按name查找枚举
     */
    public static Operation getMatchByKey(String key) {
        for (Operation e : Operation.values()) {
            if (e.key().equalsIgnoreCase(key)) {
                return e;
            }
        }
        return null;
    }

    /**
     * 按value查找枚举
     */
    public static Operation getMatchByValue(String value) {
        for (Operation e : Operation.values()) {
            if (e.value().equalsIgnoreCase(value)) {
                return e;
            }
        }
        return null;
    }

    /**
     * 按ordinal查找枚举
     */
    public static Operation getMatchByOrdinal(Integer ordinal) {
        for (Operation e : Operation.values()) {
            if (e.ordinal() == ordinal) {
                return e;
            }
        }
        return null;
    }
}
