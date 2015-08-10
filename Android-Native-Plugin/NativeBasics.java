c class NativeBasics extends UnityPlayerActivity{
    public static Context mContext;
      
     @Override
     protected void onCreate(Bundle bundle){
             super.onCreate(bundle);
             mContext = this;
     }
     
    /**
     * Display a simple alertview
     * @param msg message of the alertview
     */
    public static int showSimpleAlert(final String msg){
        final Activity mActivity = UnityPlayer.currentActivity;
        mActivity.runOnUiThread(new Runnable(){
            public void run()
            {
                new AlertDialog.Builder(mActivity)
                .setTitle("")
                .setMessage(msg)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) { 
                         
                    }
                 })
                .setIcon(android.R.drawable.ic_dialog_alert)
                 .show();
            }
        });
         
        return 1;
    }
}
