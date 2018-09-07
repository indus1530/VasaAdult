package utils;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

/**
 * Created by irfansyed on 3/28/2017.
 */

public class ClearAllcontrol {



    public static void ClearAll(LinearLayout lv) {

        /// Checkbox Celar*************************************

        try {

            for (int i = 0, count = lv.getChildCount(); i < count; ++i) {
                View view = lv.getChildAt(i);
                if (view instanceof CheckBox) {
                    ((CheckBox) view).setChecked(false);
                }
                else   if (view instanceof RadioGroup) {
                    ((RadioGroup) view).clearCheck();
                }

                else  if (view instanceof EditText) {
                    ((EditText) view).setText("");
                }

            }
        }
        catch (Exception e) {

        }




    }
}
