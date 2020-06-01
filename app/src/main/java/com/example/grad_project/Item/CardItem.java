package com.example.grad_project.Item;

public class CardItem {
    private int mTextResource;
    private int mTitleResource;
    private int musicNum;

    public CardItem(int title, int text, int num) {
        mTitleResource = title;
        mTextResource = text;
        musicNum = num;
    }
    public int getMusicNum(){ return musicNum; }
    public int getText() {
        return mTextResource;
    }

    public int getTitle() {
        return mTitleResource;
    }
}
