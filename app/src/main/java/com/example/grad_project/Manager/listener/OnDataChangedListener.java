package com.example.grad_project.Manager.listener;

import java.util.List;

public interface OnDataChangedListener<T> {

    public void onListChanged(List<T> list);
}