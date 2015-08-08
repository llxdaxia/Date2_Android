package com.redrock.date2.moudel.main;

import android.support.v4.app.Fragment;

import com.jude.beam.nucleus.manager.Presenter;
import com.redrock.date2.moudel.action.ActionFragment;
import com.redrock.date2.moudel.date.DateFragment;
import com.redrock.date2.moudel.message.MessageFragment;
import com.redrock.date2.moudel.user.UserFragment;

/**
 * Created by Mr.Jude on 2015/8/7.
 */
public class MainPresenter extends Presenter<MainActivity> {
    private Fragment mDateFragment;
    private Fragment mActionFragment;
    private Fragment mMessageFragment;
    private Fragment mUserFragment;

    @Override
    protected void onCreateView(MainActivity view) {
        super.onCreateView(view);
        showDateFragment();
    }

    public void showDateFragment(){
        if (mDateFragment==null){
            mDateFragment = new DateFragment();
        }
        getView().showFragment(mDateFragment);
    }
    public void showActionFragment(){
        if (mActionFragment==null){
            mActionFragment = new ActionFragment();
        }
        getView().showFragment(mActionFragment);
    }
    public void showMessageFragment(){
        if (mMessageFragment==null){
            mMessageFragment = new MessageFragment();
        }
        getView().showFragment(mMessageFragment);
    }
    public void showUserFragment(){
        if (mUserFragment==null){
            mUserFragment = new UserFragment();
        }
        getView().showFragment(mUserFragment);
    }
    public void startPost(){

    }
}
