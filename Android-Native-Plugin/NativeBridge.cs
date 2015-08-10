f UNITY_ANDROID
    public static void showSimpleAlert(string msg){
        AndroidJavaClass jClass = new AndroidJavaClass ("com.your.package.NativeBasics");
        if (jClass != null) {
            int i = jClass.CallStatic<int>("showSimpleAlert",msg);
        }
    }
    #endif
 
//call the static function from other class
NativeBridge.showSimpleAlert("alert message");
