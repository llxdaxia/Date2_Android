package com.redrock.date2.moudel.setting;

import com.jude.beam.bijection.Presenter;
import com.redrock.date2.model.UserModel;

/**
 * Created by Mr.Jude on 2015/8/13.
 */
public class SettingPresenter extends Presenter<SettingActivity> {

    public void LoginOut(){
        UserModel.getInstance().LoginOut();
        getView().finish();
    }

}
