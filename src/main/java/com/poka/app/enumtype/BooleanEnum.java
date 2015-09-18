package com.poka.app.enumtype;

public enum BooleanEnum {

	TRUE(1),FALSE(0);
	private int nCode;

    // 构造函数，枚举类型只能为私有

    private BooleanEnum(int _nCode) {
        this.nCode = _nCode;

    }
    
    @Override
    public String toString() {

        return String.valueOf(this.nCode);

    }
}
