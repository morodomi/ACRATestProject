package com.shonanshachu.acra;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Masahiro Morodomi <morodomi at gmail.com>
 * @version 1.0.0 updated on 2012-02-25
 */
public class ACRATestProjectActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // ArrayIndexOutOfBoundsException
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i <= array.length; i++){
        	sum += array[i];
        }
        System.out.println("sum=" + sum);
    }
}