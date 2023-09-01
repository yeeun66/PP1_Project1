package com.mycom.word;

public interface ICRUD {
    public Object add(); // 추가된 객체 리턴하기 위함
    public int update(Object obj);
    public int delete(Object obj);
    public void selectOne(int id);
}
