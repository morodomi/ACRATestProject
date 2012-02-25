package com.shonanshachu.acra;

import org.acra.*;
import org.acra.annotation.*;

import android.app.Application;

/**
 * @author Masahiro Morodomi <shonan.shachu at gmail.com>
 * @version 1.0.0 updated on 2012-02-25
 */
@ReportsCrashes(formKey = "dEVxSFhIMk5SFDREQVZkNlVxNmhMUVE6MQ") 
public class MyApplication extends Application{
	@Override
	public void onCreate() {
		ACRA.init(this);
		super.onCreate();
	}
}
