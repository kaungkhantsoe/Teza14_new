package com.kks.teza14_new.custom_control;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kks.teza14_new.TezaConstant;

public class AndroidCommonSetup {

    private FontSharePreferenceHelper sharePreferenceHelper;
    private boolean fontChecked = false;

    private static final AndroidCommonSetup ourInstance = new AndroidCommonSetup();

    public static AndroidCommonSetup getInstance() {
        return ourInstance;
    }

    private AndroidCommonSetup() {
    }

    public void init(Context context)
    {

        sharePreferenceHelper = new FontSharePreferenceHelper(context);
        if (fontChecked) {
            return;
        }

        //Credit: Myat Min Soe MDetect.
        TextView textView = new TextView(context, null);
        textView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        textView.setText("\u1000");
        textView.measure(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        int length1 = textView.getMeasuredWidth();

        textView.setText("\u1000\u1039\u1000");
        textView.measure(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        int length2 = textView.getMeasuredWidth();

        if(length1 == length2)
        {
            //mm3
            changeFont(TezaConstant.MM3_FONT);
            fontChecked = true;
        }
        else
        {
            //zg
            changeFont(TezaConstant.ZG_FONT);
            fontChecked = true;
        }

    }

    public String getZgOrMM3()
    {
        return sharePreferenceHelper.getFont();
    }

    //zg or mm3
    public void changeFont(String font) {
        sharePreferenceHelper.setFont(font);
    }

    public String getSelectedLanguage() {
        return sharePreferenceHelper.getLanguage();
    }
    public void changeLanguage(String language) {
        sharePreferenceHelper.setLanguage(language);
    }

}
