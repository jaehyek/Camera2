package us.yydcdut.camera2;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by yuyidong on 15-1-12.
 */
public class PreferenceHelper {

    public static String getCameraId(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("CameraConfig", Context.MODE_PRIVATE);
        return preferences.getString("camera", "0");
    }

    public static void writeCameraId(Context context, String value) {
        SharedPreferences preferences = context.getSharedPreferences("CameraConfig", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("camera", value);
        editor.commit();
    }

    public static String getCameraFormat(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("CameraConfig", Context.MODE_PRIVATE);
        return preferences.getString("format", "JPEG");
    }

    public static void writeCameraFormat(Context context, String value) {
        SharedPreferences preferences = context.getSharedPreferences("CameraConfig", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("format", value);
        editor.commit();
    }
}